'''
function checkGAN($array) {
	static $poly = [ 1, 5, 13, 31, 131, 131, 137, 7, 43, 1];
	$sum = 1;
	for ($i = 0; $i < 8; ) {
		$sum *= $poly[$i]; 
		$sum += $array[$i++];
	}
	return ($sum % 10) == $array[8];
}
'''

import requests

sol_url = "https://www.wechall.net/challenge/training/encodings/checksums/index.php?_t=time()&defaultgan=123456789"
WC = "17998104-12786-VfKrTIjbSko90Xgs"

cookie = {'WC':WC}
data = {}

array = [ 1, 2, 3, 4, 5, 6, 7, 8]
poly = [ 1, 5, 13, 31, 131, 131, 137, 7, 43, 1]
sum = 1

for i in range(8):
    sum *= poly[i]
    sum += array[i]
    data['gan[' + str(i) + ']'] = array[i]

data['gan[8]'] = (sum % 10)

print(data)

resp = requests.post(url=sol_url, data=data, cookies=cookie)

if resp.text.find('Your answer is correct'):
    print('Correct! Problem solved.')
else:
    print('Beep! Wrong answer! Try Again!')
