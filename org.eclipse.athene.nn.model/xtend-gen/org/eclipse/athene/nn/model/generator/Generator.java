package org.eclipse.athene.nn.model.generator;

import java.util.ArrayList;
import org.eclipse.athene.nn.model.core.Design;
import org.eclipse.athene.nn.model.core.Element;
import org.eclipse.athene.nn.model.generator.GeneratorHelper;
import org.eclipse.athene.nn.model.keras.InputNode;
import org.eclipse.athene.nn.model.keras.Layer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class Generator extends GeneratorHelper {
  public String generate(final Design design) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Element> _elements = design.getElements();
      for(final Element element : _elements) {
        String _import = this.toImport(element);
        _builder.append(_import);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    final String imports = _builder.toString();
    StringConcatenation _builder_1 = new StringConcatenation();
    {
      final Function1<Element, Boolean> _function = (Element it) -> {
        return Boolean.valueOf((it instanceof Layer));
      };
      final Function1<Element, Layer> _function_1 = (Element it) -> {
        return ((Layer) it);
      };
      Iterable<Layer> _map = IterableExtensions.<Element, Layer>map(IterableExtensions.<Element>filter(design.getElements(), _function), _function_1);
      for(final Layer layer : _map) {
        String _newLayer = this.toNewLayer(layer);
        _builder_1.append(_newLayer);
        _builder_1.newLineIfNotEmpty();
      }
    }
    _builder_1.newLine();
    final String layers = _builder_1.toString();
    final ArrayList<InputNode> inputNodes = CollectionLiterals.<InputNode>newArrayList();
    final Function1<Object, Boolean> _function_2 = (Object it) -> {
      return Boolean.valueOf((it instanceof InputNode));
    };
    final Function1<Object, InputNode> _function_3 = (Object it) -> {
      return ((InputNode) it);
    };
    Iterable<InputNode> _map_1 = IterableExtensions.<Object, InputNode>map(IterableExtensions.<Object>filter(IteratorExtensions.<Object>toIterable(EcoreUtil.<Object>getAllContents(design, true)), _function_2), _function_3);
    for (final InputNode inputNode : _map_1) {
      inputNodes.add(inputNode);
    }
    StringConcatenation _builder_2 = new StringConcatenation();
    {
      for(final InputNode inputNode_1 : inputNodes) {
        String _connectLayerAssignment = this.toConnectLayerAssignment(inputNode_1);
        _builder_2.append(_connectLayerAssignment);
        _builder_2.newLineIfNotEmpty();
      }
    }
    final String tensors = _builder_2.toString();
    return "";
  }
}
