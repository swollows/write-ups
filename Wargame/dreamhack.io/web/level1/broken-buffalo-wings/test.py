from sys import argv

def read_url(paramters, cookie={"name": "name", "value": "value"}):
    parameter = ""

    if paramters[1][0] == "/":
        parameter = paramters[1][1:]
    else : 
        parameter = paramters[1]
    
    print(paramters)
    print(parameter)
    print(cookie)

read_url(argv, {"name": "flag", "value": 'FLAG'})
print(argv)