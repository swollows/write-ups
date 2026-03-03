# ASCII write-up
# 1. ord to chr each chacracters in list
# 2. join the list of plain flag text list

ENC_FLAG = [99, 114, 121, 112, 116, 111, 123, 65, 83, 67, 73, 73, 95, 112, 114, 49, 110, 116, 52, 98, 108, 51, 125]
FLAG = "".join([chr(elem) for in ENC_FLAG])

print(FLAG)
