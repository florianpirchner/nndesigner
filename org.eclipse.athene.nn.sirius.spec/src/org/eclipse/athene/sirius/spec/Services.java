package org.eclipse.athene.sirius.spec;

import org.eclipse.athene.nn.model.keras.InputNode;
import org.eclipse.athene.nn.model.keras.Layer;
import org.eclipse.athene.nn.model.keras.Node;
import org.eclipse.athene.nn.model.keras.OutputNode;
import org.eclipse.athene.nn.model.keras.Tensor;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DEdgeSpec;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeSpec;

public class Services {

	public void connectTensorToInput(OutputNode sourceOutputNode, Layer target) {
		sourceOutputNode.connectToLayer(target);
	}

	public void connectTensorToInput(OutputNode source, InputNode inputNode) {
		connectTensorToInput(source, inputNode.getLayer());
	}

	@SuppressWarnings("restriction")
	public void unconnectFromTargetInput(Tensor tensor, DEdgeSpec targetInputNodeView) {
		InputNode targetInputNode = (InputNode) ((DNodeSpec) targetInputNodeView.getTargetNode()).getTarget();
		tensor.unconnectFromTargetInput(targetInputNode);
	}
	
	public void removeNode(Node node) {
		node.removeFromLayer();
	}
}
