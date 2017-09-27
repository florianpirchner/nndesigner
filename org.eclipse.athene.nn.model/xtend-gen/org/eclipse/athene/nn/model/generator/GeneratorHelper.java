package org.eclipse.athene.nn.model.generator;

import java.util.Arrays;
import org.eclipse.athene.nn.model.core.Element;
import org.eclipse.athene.nn.model.keras.Activation;
import org.eclipse.athene.nn.model.keras.ActivityRegularization;
import org.eclipse.athene.nn.model.keras.Dense;
import org.eclipse.athene.nn.model.keras.Flatten;
import org.eclipse.athene.nn.model.keras.Input;
import org.eclipse.athene.nn.model.keras.InputNode;
import org.eclipse.athene.nn.model.keras.Layer;
import org.eclipse.athene.nn.model.keras.MultiInputNode;
import org.eclipse.athene.nn.model.keras.OutputNode;
import org.eclipse.athene.nn.model.keras.Permute;
import org.eclipse.athene.nn.model.keras.RepeatVector;
import org.eclipse.athene.nn.model.keras.Reshape;
import org.eclipse.athene.nn.model.keras.SingleInputNode;
import org.eclipse.athene.nn.model.keras.Tensor;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class GeneratorHelper {
  protected String _toImport(final Element layer) {
    throw new IllegalArgumentException();
  }
  
  protected String _toImport(final Input layer) {
    return "from tensorflow.contrib.keras.api.keras.layers import Input";
  }
  
  protected String _toImport(final Dense layer) {
    return "from tensorflow.contrib.keras.api.keras.layers import Dense";
  }
  
  protected String _toImport(final Activation layer) {
    return "from tensorflow.contrib.keras.api.keras.layers import Activation";
  }
  
  protected String _toImport(final Reshape layer) {
    return "from tensorflow.contrib.keras.api.keras.layers import Reshape";
  }
  
  protected String _toImport(final Flatten layer) {
    return "from tensorflow.contrib.keras.api.keras.layers import Flatten";
  }
  
  protected String _toImport(final Permute layer) {
    return "from tensorflow.contrib.keras.api.keras.layers import Permute";
  }
  
  protected String _toImport(final RepeatVector layer) {
    return "from tensorflow.contrib.keras.api.keras.layers import RepeatVector";
  }
  
  protected String _toImport(final ActivityRegularization layer) {
    return "from tensorflow.contrib.keras.api.keras.layers import ActivityRegularization";
  }
  
  protected String _toNewLayer(final Layer layer) {
    throw new IllegalArgumentException();
  }
  
  protected String _toNewLayer(final Input layer) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Input(name=\"");
    String _name = layer.getName();
    _builder.append(_name);
    _builder.append("\")");
    return _builder.toString();
  }
  
  protected String _toNewLayer(final Dense layer) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Dense(name=\"");
    String _name = layer.getName();
    _builder.append(_name);
    _builder.append("\")");
    return _builder.toString();
  }
  
  protected String _toNewLayer(final Activation layer) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Activation(name=\"");
    String _name = layer.getName();
    _builder.append(_name);
    _builder.append("\")");
    return _builder.toString();
  }
  
  protected String _toNewLayer(final Reshape layer) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Reshape(name=\"");
    String _name = layer.getName();
    _builder.append(_name);
    _builder.append("\")");
    return _builder.toString();
  }
  
  protected String _toNewLayer(final Flatten layer) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Flatten(name=\"");
    String _name = layer.getName();
    _builder.append(_name);
    _builder.append("\")");
    return _builder.toString();
  }
  
  protected String _toNewLayer(final Permute layer) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Permute(name=\"");
    String _name = layer.getName();
    _builder.append(_name);
    _builder.append("\")");
    return _builder.toString();
  }
  
  protected String _toNewLayer(final RepeatVector layer) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("RepeatVector(name=\"");
    String _name = layer.getName();
    _builder.append(_name);
    _builder.append("\")");
    return _builder.toString();
  }
  
  protected String _toNewLayer(final ActivityRegularization layer) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ActivityRegularization(name=\"");
    String _name = layer.getName();
    _builder.append(_name);
    _builder.append("\")");
    return _builder.toString();
  }
  
  public String toNewLayerAssignment(final Layer layer) {
    StringConcatenation _builder = new StringConcatenation();
    String _layerObjectVariableName = this.toLayerObjectVariableName(layer);
    _builder.append(_layerObjectVariableName);
    _builder.append(" = ");
    String _newLayer = this.toNewLayer(layer);
    _builder.append(_newLayer);
    return _builder.toString();
  }
  
  public String toLayerObjectVariableName(final Layer layer) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = layer.getName();
    _builder.append(_name);
    _builder.append("_obj");
    return _builder.toString();
  }
  
  protected String _toConnectLayerAssignment(final SingleInputNode inputNode) {
    final Layer layer = inputNode.getLayer();
    final OutputNode outputNode = inputNode.getConnectedNode();
    final Tensor inputTensor = inputNode.getInputTensor();
    StringConcatenation _builder = new StringConcatenation();
    String _tensorVariableName = this.toTensorVariableName(outputNode.getOutputTensor());
    _builder.append(_tensorVariableName);
    _builder.append(" = ");
    String _layerObjectVariableName = this.toLayerObjectVariableName(layer);
    _builder.append(_layerObjectVariableName);
    _builder.append("(");
    String _tensorVariableName_1 = this.toTensorVariableName(inputTensor);
    _builder.append(_tensorVariableName_1);
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _toConnectLayerAssignment(final MultiInputNode inputNode) {
    return null;
  }
  
  public String toTensorVariableName(final Tensor tensor) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = tensor.getName();
    _builder.append(_name);
    _builder.append("_t");
    return _builder.toString();
  }
  
  public String toImport(final Element layer) {
    if (layer instanceof Activation) {
      return _toImport((Activation)layer);
    } else if (layer instanceof ActivityRegularization) {
      return _toImport((ActivityRegularization)layer);
    } else if (layer instanceof Dense) {
      return _toImport((Dense)layer);
    } else if (layer instanceof Flatten) {
      return _toImport((Flatten)layer);
    } else if (layer instanceof Input) {
      return _toImport((Input)layer);
    } else if (layer instanceof Permute) {
      return _toImport((Permute)layer);
    } else if (layer instanceof RepeatVector) {
      return _toImport((RepeatVector)layer);
    } else if (layer instanceof Reshape) {
      return _toImport((Reshape)layer);
    } else if (layer != null) {
      return _toImport(layer);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(layer).toString());
    }
  }
  
  public String toNewLayer(final Layer layer) {
    if (layer instanceof Activation) {
      return _toNewLayer((Activation)layer);
    } else if (layer instanceof ActivityRegularization) {
      return _toNewLayer((ActivityRegularization)layer);
    } else if (layer instanceof Dense) {
      return _toNewLayer((Dense)layer);
    } else if (layer instanceof Flatten) {
      return _toNewLayer((Flatten)layer);
    } else if (layer instanceof Input) {
      return _toNewLayer((Input)layer);
    } else if (layer instanceof Permute) {
      return _toNewLayer((Permute)layer);
    } else if (layer instanceof RepeatVector) {
      return _toNewLayer((RepeatVector)layer);
    } else if (layer instanceof Reshape) {
      return _toNewLayer((Reshape)layer);
    } else if (layer != null) {
      return _toNewLayer(layer);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(layer).toString());
    }
  }
  
  public String toConnectLayerAssignment(final InputNode inputNode) {
    if (inputNode instanceof MultiInputNode) {
      return _toConnectLayerAssignment((MultiInputNode)inputNode);
    } else if (inputNode instanceof SingleInputNode) {
      return _toConnectLayerAssignment((SingleInputNode)inputNode);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(inputNode).toString());
    }
  }
}
