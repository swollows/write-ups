def exgcd(a ,b):
    num1 = None
    num2 = None

    if (a <= b):
        num1 = b
        num2 = a

    if (num1 % num2 == 0):
        return 
