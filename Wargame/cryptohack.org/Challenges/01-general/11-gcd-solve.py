def gcd(a, b):
    num1 = a
    num2 = b

    if (a <= b):
        num1 = b
        num2 = a 

    if (num1 % num2 == 0):
        return num2
    elif (num1 % num2 > 0):
        return gcd(num2, num1 % num2)

num1 = 66528
num2 = 52920 

print(f"Flag: {gcd(num1, num2)}")
