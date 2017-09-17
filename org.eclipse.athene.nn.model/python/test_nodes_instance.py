from tensorflow.contrib.keras.api.keras.layers import Conv2D, MaxPooling2D, Flatten
from tensorflow.contrib.keras.api.keras.layers import Input, LSTM, Embedding, Dense, concatenate
from tensorflow.contrib.keras.api.keras.layers import Input, LSTM, Embedding, Dense, concatenate
#from keras.layers import Conv2D, MaxPooling2D, Flatten, Layer
#from keras.layers import Input, LSTM, Embedding, Dense, concatenate
from tensorflow.contrib.keras.api.keras.models  import Model, Sequential
from tensorflow.python.layers.base import Layer

a = Input(shape=(140, 256), name="input1")
b = Input(shape=(140, 256), name="input2")

lstm = LSTM(32, name="LSTM")
encoded_a = lstm(a)
encoded_a1 = lstm(a)
encoded_a2 = lstm(a)
encoded_b = lstm(b)

deep = Dense(32, name="Dense1")
deep1_1 = deep(encoded_a)
deep1_2 = deep(encoded_a1)

deep2 = Dense(32, name="Dense2")
deep2_1 = deep2(deep1_1)
deep2_2 = deep2(deep1_2)
deep2_2 = deep2(deep2_2)

print("")
print("")
print("---- iterate inbound nodes and tensors ----")
print("")
print("")
print("LSTM")
for n in lstm.inbound_nodes:
	print("")
	print("In-Node ", id(n), n.get_config())
for n in lstm.outbound_nodes:
	print("")
	print("Out-Node ",  id(n), n.get_config())
	

print("")
print("")
print("Dense1")
for n in deep.inbound_nodes:
	print("")
	print("In-Node ",  id(n), n.get_config())
for n in deep.outbound_nodes:
	print("")
	print("Out-Node ",  id(n), n.get_config())	

print("")
print("")
print("Dense2")
for n in deep2.inbound_nodes:
	print("")
	print("In-Node ", id(n),  n.get_config())
for n in deep2.outbound_nodes:
	print("")
	print("Out-Node ", id(n),  n.get_config())	
