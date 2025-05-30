#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import pandas as pd
import re
from datetime import datetime

def parse_cef_line(line):
    """Parse a single CEF log line and extract key-value pairs"""
    # CEF 형식: CEF:Version|Device Vendor|Device Product|Device Version|Signature ID|Name|Severity|Extension
    
    # 타임스탬프와 CEF 부분 분리
    timestamp_match = re.match(r'^(\d{4}-\d{2}-\d{2}T\d{2}:\d{2}:\d{2})\s+(.*)$', line.strip())
    if not timestamp_match:
        return None
    
    timestamp = timestamp_match.group(1)
    cef_part = timestamp_match.group(2)
    
    # CEF 헤더 파싱
    cef_match = re.match(r'^CEF:(\d+)\|([^|]*)\|([^|]*)\|([^|]*)\|([^|]*)\|([^|]*)\|(\d+)\|(.*)$', cef_part)
    if not cef_match:
        return None
    
    version = cef_match.group(1)
    device_vendor = cef_match.group(2)
    device_product = cef_match.group(3)
    device_version = cef_match.group(4)
    signature_id = cef_match.group(5)
    name = cef_match.group(6)
    severity = cef_match.group(7)
    extension = cef_match.group(8)
    
    # Extension 부분에서 키-값 쌍 추출
    extension_dict = {}
    
    # 정규표현식으로 키=값 패턴 찾기
    pattern = r'(\w+)=([^\s]+(?:\s+[^\s=]+)*?)(?=\s+\w+=|\s*$)'
    matches = re.findall(pattern, extension)
    
    for key, value in matches:
        extension_dict[key] = value.strip()
    
    # 결과 딕셔너리 구성
    result = {
        'timestamp': timestamp,
        'cef_version': version,
        'device_vendor': device_vendor,
        'device_product': device_product,
        'device_version': device_version,
        'signature_id': signature_id,
        'event_name': name,
        'severity': severity,
        'src_ip': extension_dict.get('src', ''),
        'dst_ip': extension_dict.get('dst', ''),
        'src_port': extension_dict.get('spt', ''),
        'dst_port': extension_dict.get('dpt', ''),
        'protocol': extension_dict.get('proto', ''),
        'action': extension_dict.get('act', ''),
        'filename': extension_dict.get('fileName', ''),
        'username': extension_dict.get('cs1', ''),
        'password': extension_dict.get('cs2', ''),
        'event_hash': extension_dict.get('eventHash', ''),
        'threat_type': extension_dict.get('cs1Label', '') if extension_dict.get('cs1Label') == 'threatType' else '',
        'threat_value': extension_dict.get('cs1', '') if extension_dict.get('cs1Label') == 'threatType' else ''
    }
    
    return result

def main():
    """Main function to convert CEF log to Excel"""
    try:
        print("CEF 로그 파일을 읽는 중...")
        
        with open('network-log.txt', 'r', encoding='utf-8') as f:
            lines = f.readlines()
        
        parsed_data = []
        
        print("CEF 로그를 파싱하는 중...")
        for i, line in enumerate(lines):
            if line.strip():
                parsed_line = parse_cef_line(line)
                if parsed_line:
                    parsed_data.append(parsed_line)
                    if (i + 1) % 50 == 0:
                        print(f"처리된 라인: {i + 1}/{len(lines)}")
        
        # pandas DataFrame으로 변환
        print("DataFrame으로 변환 중...")
        df = pd.DataFrame(parsed_data)
        
        # Excel 파일로 저장
        print("Excel 파일로 저장 중...")
        df.to_excel('network_log_analysis.xlsx', index=False, sheet_name='CEF_Logs')
        
        print(f"변환 완료!")
        print(f"총 {len(parsed_data)}개의 로그 엔트리가 처리되었습니다.")
        print(f"파일이 'network_log_analysis.xlsx'로 저장되었습니다.")
        
        # 기본 통계 정보 출력
        print("\n=== 기본 통계 ===")
        print(f"고유 소스 IP 개수: {df['src_ip'].nunique()}")
        print(f"고유 대상 IP 개수: {df['dst_ip'].nunique()}")
        print(f"이벤트 유형별 개수:")
        print(df['event_name'].value_counts().head(10))
        
    except Exception as e:
        print(f"오류가 발생했습니다: {e}")

if __name__ == "__main__":
    main() 