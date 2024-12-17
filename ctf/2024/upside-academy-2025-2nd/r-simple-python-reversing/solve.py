import subprocess

# 풀이
# 1. 문제 파일에서 패스워드 생성 시 "UP UP GO GO!" 라는 문자열을 generate_password 함수에 보냄
# 2. generate_password 함수에서는 해당 문자열을 modified_secret 변수에서 치환 연산을 한 다음
#    치환연산한 결과를 SHA256 해시로 변환 후 그 결과값을 반환함
# 3. 패스워드를 사용자로부터 입력받으면 그 결과롤 SHA256 해시로 변환하여 2번의 값과 비교함
# 4. 따라서, SHA256으로 변환하기 직전의 값을 연산하면 되므로 generate_password 함수의 modified_secret 변수의
#    연산 결과값을 패스워드로 전달하면 플래그 획득 가능
#
# 번외) modified_secret 변수 연산 정리
#    (1) [연산식] for c in secret => secret 문자열을 1글자씩 연산식으로 전달하여 그 결과를 List로 누적
#    (2) ord(c) * 3 => for문으로부터 전달받은 문자를 ASCII 코드 정수로 변환 후 그 값에 3 곱하기
#    (3) (2번 연산) % 123 => 2번 연산 결과에서 123을 나머지한 값
#    (4) max((3번 연산), 33) => 3번 연산 결과와 33 중 큰 값만 사용
#    (5) chr((4번 연산)) => 4번 연산 결과를 ASCII 문자로 변환
#    (6) "".join((1번 연산)) => 1번 연산의 결과로 나온 배열을 문자열로 변환

secret = "UP UP GO GO!"
modified_secret = "".join(chr(max((ord(c) * 3) % 123, 33)) for c in secret)

process = subprocess.Popen(['python', 'prob.py'], stdin = subprocess.PIPE, stdout=subprocess.PIPE, text=True)

stdout = process.communicate(input=modified_secret)

print(stdout[0])