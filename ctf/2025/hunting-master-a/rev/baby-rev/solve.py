XOR_KEY = [0x55, 0x32, 0x22, 0x11]
NUMBERS = [29, 103, 108, 92, 20, 73, 96, 81, 6, 3, 65, 78, 39, 87, 116, 84, 39, 7, 3, 127, 18, 79]

FLAG = ""

for i in range(len(NUMBERS)):
    FLAG += chr(NUMBERS[i] ^ XOR_KEY[i % 4])

print(f"flag: {FLAG}")