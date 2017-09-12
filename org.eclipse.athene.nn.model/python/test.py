from tensorflow.contrib.keras.api.keras.layers import Conv2D, MaxPooling2D, Flatten
from tensorflow.contrib.keras.api.keras.layers import Input, LSTM, Embedding, Dense, concatenate
from tensorflow.contrib.keras.api.keras.layers import Input, LSTM, Embedding, Dense, concatenate
#from keras.layers import Conv2D, MaxPooling2D, Flatten, Layer
#from keras.layers import Input, LSTM, Embedding, Dense, concatenate
from tensorflow.contrib.keras.api.keras.models  import Model, Sequential
from tensorflow.python.layers.base import Layer

# First, let's define a vision model using a Sequential model.
# This model will encode an image into a vector.
vision_model = Sequential()


vision_model.add(Conv2D(64, (3, 3), activation='relu', padding='same', input_shape=(224, 224, 3)))
vision_model.add(Conv2D(64, (3, 3), activation='relu'))
vision_model.add(MaxPooling2D((2, 2)))
vision_model.add(Conv2D(128, (3, 3), activation='relu', padding='same'))
vision_model.add(Conv2D(128, (3, 3), activation='relu'))
vision_model.add(MaxPooling2D((2, 2)))
vision_model.add(Conv2D(256, (3, 3), activation='relu', padding='same'))
vision_model.add(Conv2D(256, (3, 3), activation='relu'))
vision_model.add(Conv2D(256, (3, 3), activation='relu'))
vision_model.add(MaxPooling2D((2, 2)))
vision_model.add(Flatten())

# Now let's get a tensor with the output of our vision model:
image_input = Input(shape=(224, 224, 3))
print(image_input)
encoded_image = vision_model(image_input)
print(encoded_image)

# Next, let's define a language model to encode the question into a vector.
# Each question will be at most 100 word long,
# and we will index words as integers from 1 to 9999.
question_input = Input(shape=(100,), dtype='int32')

temp = Embedding(input_dim=10000, output_dim=256, input_length=100)

embedded_question = temp(question_input)

encoded_question = LSTM(256)(embedded_question)

# Let's concatenate the question vector and the image vector:
merged = concatenate([encoded_question, encoded_image])

# And let's train a logistic regression over 1000 words on top:
output = Dense(1000, activation='softmax')(merged)

# This is our final model:
vqa_model = Model(inputs=[image_input, question_input], outputs=output)

print(isinstance(vqa_model, Layer))
print(isinstance(Dense(1000, activation='softmax'), Layer))
#isinstance(Vehicle(), Vehicle)