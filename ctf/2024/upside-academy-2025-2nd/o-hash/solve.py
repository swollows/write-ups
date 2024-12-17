import hashlib
import string

# 풀이
# 1. 문제로 주어진 해시 데이터를 이용해서 shake_128 함수로 연산한 결과와 일치하는 평문 찾기
# 2. 해시 결과를 변환할 때 2글자씩 변환하므로 2글자 단위로 연산하도록 코드 작성

FLAG_HASH = [
    '3b0bd3fe89516316105da99938edbbe2',
    'b83723991d66d3b6db0b70858da5a5f5',
    '8a6fcf5a86900c9a3bddae512690dbff',
    '3fcbee34a62f392ba7e0e901b81bc726',
    'fd1d52f6a36647ee0553fab3b4f0a13b',
    '7783ed57a5353194bc7de43393c9ad66',
    '1a175ffe22c3dd482cfdf18713b4dcc5',
    '38faab2978a712b10912e297bf0b4e89',
    'c138d468134fe10b7cc79963fb8c68bc',
    'e0f824b437cc4fdb87ee8e41f8a26a2f',
    '245cdfbad6cc7bbf7f86c69bb5266b8e',
    'e16bf8eeaa3d4686c29d2323f7594bcd',
    '1a175ffe22c3dd482cfdf18713b4dcc5',
    'abfea26b14753ace72fd337cda9f3769',
    '1c222f8c3527e2fd2c3ebf27be27dc11',
    '18b61711485a4237de9dafd120d1341c',
    'd14624408d85b3c7c26b456dfa53f7ea',
    'f048f4ebdc99c876081450cfa68f7ecc',
    '3180fa46486ac779788d935938778ae2',
    '52a95eb9a1d6f8608320db27b6aae032',
    '5766fd9136d7a005d32ed86ef63a5168',
    'abe6a87835c82e73dc265b49dab2801d',
    '6af32032d6ee3c8e2a4d06e055a83332',
    '9731eaeb53053cc621afc99d4922c536',
    '74271277021802eee82e6429c0b767b5',
    '064b28aa936ba631e920a192e0141111',
    '51fc99ca21d0ddff692a9314a19574b8',
    '42cbf2a6b8af53669e596a051817fe74',
    '940412e9db4dcfab601fe1e7dcaf0b7e',
    'cc806a8e95115d0673b9268db353e080',
    'e0f824b437cc4fdb87ee8e41f8a26a2f',
    'd5f22624c1c6e69ea2dc7ff9d9e288d9',
    '9d738896cd5926dada86cebb7056cc1e',
    'c159413e91eca051a342239e3df3b07b'
]

FLAG = ''
PRINTABLE_STR = string.printable

for hash in FLAG_HASH:
    f_stop = 0
    for elem01 in PRINTABLE_STR:
        for elem02 in PRINTABLE_STR:
            tmp = hashlib.shake_128((elem01 + elem02).encode('utf-8')).hexdigest(16)
            if tmp == hash:
                FLAG += elem01 + elem02
                f_stop = 1
        if f_stop == 1:
            break

print(FLAG)