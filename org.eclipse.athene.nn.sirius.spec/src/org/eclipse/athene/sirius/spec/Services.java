package org.eclipse.athene.sirius.spec;

import java.util.stream.Collectors;

import org.eclipse.athene.nn.model.core.Design;
import org.eclipse.athene.nn.model.keras.SingleInputNode;
import org.eclipse.athene.nn.model.keras.Layer;
import org.eclipse.athene.nn.model.keras.Node;
import org.eclipse.athene.nn.model.keras.OutputNode;
import org.eclipse.athene.nn.model.keras.Tensor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DEdgeSpec;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeSpec;

public class Services {

	public void connectTensorToInput(OutputNode sourceOutputNode, Layer target) {
		sourceOutputNode.connectToInputLayer(target);
	}

	public void connectTensorToInput(OutputNode source, SingleInputNode inputNode) {
		connectTensorToInput(source, inputNode.getLayer());
	}

	@SuppressWarnings("restriction")
	public void unconnectFromTargetInput(Tensor tensor, DEdgeSpec targetInputNodeView) {
		SingleInputNode targetInputNode = (SingleInputNode) ((DNodeSpec) targetInputNodeView.getTargetNode()).getTarget();
		tensor.unconnectFromTargetInput(targetInputNode);
	}

	public void removeNode(Node node) {
		node.removeFromLayer();
	}

	public void finishElement(Layer layer) {
		Design d = (Design) layer.eContainer();
		int count = d.getElements().stream().filter(e -> e.eClass() == layer.eClass()).collect(Collectors.toList())
				.size();
		layer.setName(layer.getClass().getSimpleName().replace("Impl", "") + "-" + (count));
		
		// for default nodes, do auto name
		for(OutputNode o : layer.getOutputNodes()) {
			o.autoName();
		}
	}

	public void style(EObject eobjct) {
		System.out.println("");
	}

}
