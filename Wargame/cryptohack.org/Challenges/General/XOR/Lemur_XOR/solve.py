import numpy as np
from PIL import Image

im1 = Image.open("flag.png")
im2 = Image.open("lemur.png")

n1 = np.array(im1) * 255
n2 = np.array(im2) * 255

#our images have a mode of RGB which is assumed to be an 8-bit int
dec_flag = np.bitwise_xor(n1, n2).astype(np.uint8)

Image.fromarray(dec_flag).save('dec_flag.png')