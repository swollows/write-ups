import PIL.Image as pilimg
import numpy as np

# Read flag.png
img_flag = pilimg.open("./10-lemur-xor-img/flag.png")

# Read lemur.png
img_lemur = pilimg.open("./10-lemur-xor-img/lemur.png")

print(img_flag.shape)
print(img_lemur.shape)
