package org.eclipse.athene.sirius.spec;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.ModelChangeTrigger;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.business.api.query.EObjectQuery;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusGMFHelper;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.sirius.ext.base.Options;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.sirius.viewpoint.ViewpointPackage;

public class MoveInOutPutsInCommonTrigger implements ModelChangeTrigger {

	// public static final Adapter AUTO_SIZE_MARKER = new AdapterImpl();
	private TransactionalEditingDomain domain;

	public MoveInOutPutsInCommonTrigger(TransactionalEditingDomain domain) {
		super();
		this.domain = domain;
	}

	public static final NotificationFilter IS_GMF_NODE_ATTACHMENT = new NotificationFilter.Custom() {
		public boolean matches(Notification input) {
			return input.getNotifier() instanceof org.eclipse.gmf.runtime.notation.Bounds
					&& input.getFeature() == NotationPackage.Literals.LOCATION__Y;
		}
	};

	public Option<Command> localChangesAboutToCommit(Collection<Notification> notifications) {
		for (Notification notif : notifications) {
			org.eclipse.gmf.runtime.notation.Bounds bound = (org.eclipse.gmf.runtime.notation.Bounds) notif
					.getNotifier();
			if (bound.eContainer() instanceof org.eclipse.gmf.runtime.notation.Node) {

				final int newY = notif.getNewIntValue();

				org.eclipse.gmf.runtime.notation.Node node = (org.eclipse.gmf.runtime.notation.Node) bound.eContainer();
				EObject semanticObject = ((DSemanticDecorator) node.getElement()).getTarget();

				org.eclipse.gmf.runtime.notation.Node gmfConnected = null;
				if (semanticObject instanceof org.eclipse.athene.nn.model.keras.OutputNode) {
					org.eclipse.athene.nn.model.keras.OutputNode semanticNode = (org.eclipse.athene.nn.model.keras.OutputNode) semanticObject;
					org.eclipse.athene.nn.model.keras.SingleInputNode semanticConnected = semanticNode.getConnectedNode();

					Collection<EObject> diagramConnected = new EObjectQuery(semanticConnected)
							.getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET);

					if (!diagramConnected.isEmpty()) {
						for (Iterator<EObject> iterator = diagramConnected.iterator(); iterator.hasNext();) {
							EObject dElement = iterator.next();
							if (dElement instanceof DNode) {
								gmfConnected = SiriusGMFHelper.getGmfNode((DDiagramElement) dElement);
								break;
							}
						}
					}
				} else if (semanticObject instanceof org.eclipse.athene.nn.model.keras.SingleInputNode) {
					org.eclipse.athene.nn.model.keras.SingleInputNode semanticNode = (org.eclipse.athene.nn.model.keras.SingleInputNode) semanticObject;
					org.eclipse.athene.nn.model.keras.OutputNode semanticConnected = semanticNode.getConnectedNode();

					Collection<EObject> diagramConnected = new EObjectQuery(semanticConnected)
							.getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET);

					if (!diagramConnected.isEmpty()) {
						for (Iterator<EObject> iterator = diagramConnected.iterator(); iterator.hasNext();) {
							EObject dElement = iterator.next();
							if (dElement instanceof DNode) {
								gmfConnected = SiriusGMFHelper.getGmfNode((DDiagramElement) dElement);
								break;
							}
						}
					}
				}
				if (gmfConnected != null) {
					final org.eclipse.gmf.runtime.notation.Node gmfConnectedFinal = gmfConnected;
					Command result = new RecordingCommand(domain) {
						@Override
						protected void doExecute() {
							if (gmfConnectedFinal
									.getLayoutConstraint() instanceof org.eclipse.gmf.runtime.notation.Bounds) {
								((org.eclipse.gmf.runtime.notation.Bounds) gmfConnectedFinal.getLayoutConstraint())
										.setY(newY);
							}
						}
					};
					return Options.newSome(result);
				}

			}
		}
		return Options.newNone();
	}

	public int priority() {
		return 0;
	}

}