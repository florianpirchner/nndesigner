package org.eclipse.athene.nn.model.generator

import org.eclipse.athene.nn.model.core.Element
import org.eclipse.athene.nn.model.keras.Activation
import org.eclipse.athene.nn.model.keras.ActivityRegularization
import org.eclipse.athene.nn.model.keras.Dense
import org.eclipse.athene.nn.model.keras.Flatten
import org.eclipse.athene.nn.model.keras.Input
import org.eclipse.athene.nn.model.keras.Layer
import org.eclipse.athene.nn.model.keras.Permute
import org.eclipse.athene.nn.model.keras.RepeatVector
import org.eclipse.athene.nn.model.keras.Reshape
import org.eclipse.athene.nn.model.keras.SingleInputNode
import org.eclipse.athene.nn.model.keras.Tensor
import org.eclipse.athene.nn.model.keras.MultiInputNode

class GeneratorHelper {

	def dispatch String toImport(Element layer) {
		throw new IllegalArgumentException
	}

	def dispatch String toImport(Input layer) {
		return "from tensorflow.contrib.keras.api.keras.layers import Input"
	}

	def dispatch String toImport(Dense layer) {
		return "from tensorflow.contrib.keras.api.keras.layers import Dense"
	}

	def dispatch String toImport(Activation layer) {
		return "from tensorflow.contrib.keras.api.keras.layers import Activation"
	}

	def dispatch String toImport(Reshape layer) {
		return "from tensorflow.contrib.keras.api.keras.layers import Reshape"
	}

	def dispatch String toImport(Flatten layer) {
		return "from tensorflow.contrib.keras.api.keras.layers import Flatten"
	}

	def dispatch String toImport(Permute layer) {
		return "from tensorflow.contrib.keras.api.keras.layers import Permute"
	}

	def dispatch String toImport(RepeatVector layer) {
		return "from tensorflow.contrib.keras.api.keras.layers import RepeatVector"
	}

	def dispatch String toImport(ActivityRegularization layer) {
		return "from tensorflow.contrib.keras.api.keras.layers import ActivityRegularization"
	}
	
	def dispatch String toNewLayer(Layer layer) {
		throw new IllegalArgumentException
	}

	def dispatch String toNewLayer(Input layer) {
		return '''Input(name="«layer.name»")'''
	}

	def dispatch String toNewLayer(Dense layer) {
		return '''Dense(name="«layer.name»")'''
	}

	def dispatch String toNewLayer(Activation layer) {
		return '''Activation(name="«layer.name»")'''
	}

	def dispatch String toNewLayer(Reshape layer) {
		return '''Reshape(name="«layer.name»")'''
	}

	def dispatch String toNewLayer(Flatten layer) {
		return '''Flatten(name="«layer.name»")'''
	}

	def dispatch String toNewLayer(Permute layer) {
		return '''Permute(name="«layer.name»")'''
	}

	def dispatch String toNewLayer(RepeatVector layer) {
		return '''RepeatVector(name="«layer.name»")'''
	}

	def dispatch String toNewLayer(ActivityRegularization layer) {
		return '''ActivityRegularization(name="«layer.name»")'''
	}
	
	def  String toNewLayerAssignment(Layer layer) {
		return '''«layer.toLayerObjectVariableName» = «layer.toNewLayer»'''
	}
	
	def String toLayerObjectVariableName(Layer layer) {
		return '''«layer.name»_obj'''
	}
	
	def dispatch String toConnectLayerAssignment(SingleInputNode inputNode) {
		val layer = inputNode.layer
		val outputNode = inputNode.connectedNode
		val inputTensor = inputNode.inputTensor
		
		return '''«outputNode.outputTensor.toTensorVariableName» = «layer.toLayerObjectVariableName»(«inputTensor.toTensorVariableName»)'''
	}
	
	def dispatch String toConnectLayerAssignment(MultiInputNode inputNode) {
		
	}
	
	def String toTensorVariableName(Tensor tensor) {
		return '''«tensor.name»_t'''
	}
	
}
