from tensorflow.contrib.keras.api.keras.layers import Conv2D, MaxPooling2D, Flatten
from tensorflow.contrib.keras.api.keras.layers import Input, LSTM, Embedding, Dense, concatenate
from tensorflow.contrib.keras.api.keras.layers import Input, LSTM, Embedding, Dense, concatenate
#from keras.layers import Conv2D, MaxPooling2D, Flatten, Layer
#from keras.layers import Input, LSTM, Embedding, Dense, concatenate
from tensorflow.contrib.keras.api.keras.models  import Model, Sequential
from tensorflow.python.layers.base import Layer

model = Sequential()
dense1 = Dense(32, name="dense1", input_shape=(500,))
model.add(dense1)
dense2 = Dense(10, name="dense2", activation='softmax')
model.add(dense2)


model(Input(shape=(140, 256), name="input1"));
model(Input(shape=(140, 256), name="input2"));

print("")
print("")
print("---- iterate inbound nodes and tensors ----")
print("")
print("")
print("dense1")
for n in dense1.inbound_nodes:
	print("")
	print("In-Node ", id(n), n.get_config())

	for t in n.input_tensors :
		print("        In-Tensor ",  t)

for n in dense1.outbound_nodes:
	print("")
	print("Out-Node ",  id(n), n.get_config())
	
	for t in n.output_tensors :
		print("        Out-Tensor ",  t)	

print("")
print("")
print("dense2")
for n in dense2.inbound_nodes:
	print("")
	print("In-Node ", id(n), n.get_config())

	for t in n.input_tensors :
		print("        In-Tensor ",  t)

for n in dense2.outbound_nodes:
	print("")
	print("Out-Node ",  id(n), n.get_config())

	for t in n.output_tensors :
		print("        Out-Tensor ",  t)	


