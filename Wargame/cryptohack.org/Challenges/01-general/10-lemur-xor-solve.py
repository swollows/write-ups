import numpy as np
from PIL import Image

# Open images
im1 = Image.open("./10-lemur-xor-img/flag.png")
im2 = Image.open("./10-lemur-xor-img/lemur.png")

arr1 = np.array(im1)
arr2 = np.array(im2)

dim = arr1.shape
xor12 = np.zeros((dim[0], dim[1], dim[2]))

for i in range(0, dim[0]):
    for j in range(0, dim[1]):
        for h in range(0, dim[2]):
            xor12[i, j, h] = arr1[i, j, h] ^ arr2[i, j, h]

xorImage = Image.fromarray(xor12.astype(np.uint8))

xorImage.show()
