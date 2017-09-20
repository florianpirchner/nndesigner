from tensorflow.contrib.keras.api.keras.layers import Conv2D, MaxPooling2D, Flatten
from tensorflow.contrib.keras.api.keras.layers import Input, LSTM, Embedding, Dense, concatenate
from tensorflow.contrib.keras.api.keras.layers import Input, LSTM, Embedding, Dense, concatenate, Add
#from keras.layers import Conv2D, MaxPooling2D, Flatten, Layer
#from keras.layers import Input, LSTM, Embedding, Dense, concatenate
from tensorflow.contrib.keras.api.keras.models  import Model, Sequential
from tensorflow.python.layers.base import Layer

input1 = Input(shape=(16,))
x1 = Dense(8, activation='relu')(input1)
input2 = Input(shape=(32,))
x2 = Dense(8, activation='relu')(input2)
added = Add()([x1, x2])  # equivalent to added = keras.layers.add([x1, x2])

print("")
print("")
print("---- iterate inbound nodes and tensors ----")
print("")
print("")
print("added")
for n in added.inbound_nodes:
	print("")
	print("In-Node ", id(n), n.get_config())
for n in added.outbound_nodes:
	print("")
	print("Out-Node ",  id(n), n.get_config())


out = Dense(4)(added)
model = Model(inputs=[input1, input2], outputs=out)

