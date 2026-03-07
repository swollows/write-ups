# XOR properties write-up
# 1. XOR has commutative and associate properties
# 2. So, you just do KEY1 ^ KEY2 ^ KEY3 in any align to FLAG then you can get Plain Text 

KEY1 = 0xa6c8b6733c9b22de7bc0253266a3867df55acde8635e19c73313
KEY2_xor_KEY3 = 0xc1545756687e7573db23aa1c3452a098b71a7fbf0fddddde5fc1

FLAG = (bytes.fromhex(format(0x04ee9855208a2cd59091d04767ae47963170d1660df7f56f5faf ^ KEY1 ^ KEY2_xor_KEY3, "x"))).decode("utf-8")

print(FLAG)
