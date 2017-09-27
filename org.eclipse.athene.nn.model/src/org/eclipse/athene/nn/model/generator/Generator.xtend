package org.eclipse.athene.nn.model.generator

import org.eclipse.athene.nn.model.core.Design
import org.eclipse.athene.nn.model.keras.InputNode
import org.eclipse.athene.nn.model.keras.Layer
import org.eclipse.emf.ecore.util.EcoreUtil

class Generator extends GeneratorHelper {

	def String generate(Design design) {

		val imports = '''
			«FOR element : design.elements»
				«element.toImport»
			«ENDFOR»
			
		'''

		val layers = '''
			«FOR layer : design.elements.filter[it instanceof Layer].map[it as Layer]»
				«layer.toNewLayer»
			«ENDFOR»
			
		'''

		val inputNodes = newArrayList()
		for (inputNode : IteratorExtensions.toIterable(EcoreUtil.getAllContents(design, true)).filter [
			it instanceof InputNode
		].map[it as InputNode]) {
			inputNodes.add(inputNode)
		}

		val tensors = '''
			«FOR inputNode : inputNodes»
				«inputNode.toConnectLayerAssignment»
			«ENDFOR»
		'''

		return ""
	}

}
