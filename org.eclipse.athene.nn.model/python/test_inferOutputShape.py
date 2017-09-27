from tensorflow.contrib.keras.api.keras.layers import Conv2D, MaxPooling2D, Flatten
from tensorflow.contrib.keras.api.keras.layers import Input, LSTM, Embedding, Dense, concatenate
from tensorflow.contrib.keras.api.keras.layers import Input, LSTM, Embedding, Dense, concatenate
#from keras.layers import Conv2D, MaxPooling2D, Flatten, Layer
#from keras.layers import Input, LSTM, Embedding, Dense, concatenate
from tensorflow.contrib.keras.api.keras.models  import Model, Sequential
from tensorflow.python.layers.base import Layer

a = Input(shape=(224, 224, 3), name="input1")

conv1_ = Conv2D(64, (3, 3), activation='relu', padding='same')
maxp1Obj = MaxPooling2D((2, 2))
conv2Obj = Conv2D(1024, (1, 1), activation='relu', padding='same')

conv1_t1 = conv1(a)
o_maxp1 = maxp1(o_conv1)
o_conv2 = conv2(o_maxp1)

print(o_conv1.shape)
print(o_maxp1.shape)
print(o_conv2.shape)

