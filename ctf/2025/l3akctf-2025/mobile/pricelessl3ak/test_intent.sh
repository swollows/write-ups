#!/bin/bash

# APK 설치 (필요한 경우)
# adb install ctf/2025/l3akctf-2025/mobile/pricelessl3ak/app.apk

PACKAGE="no.l3akctf.pricelessl3ak"
ACTIVITY="h1832fla12"

echo "=== 1단계: BINGO 액션으로 data.enc 로드 ==="
adb shell am start -n "$PACKAGE/.$ACTIVITY" -a "BINGO"

echo "=== 2단계: 다양한 Intent flags로 BANGO 액션 시도 ==="

# 일반적인 Android Intent flags
FLAGS=(
    0x10000000
    0x20000000  
    0x40000000
    0x80000000
    0x01000000
    0x02000000
    0x04000000
    0x08000000
    0x00100000
    0x00200000
    0x00400000
    0x00800000
    0x00010000
    0x00020000
    0x00040000
    0x00080000
    0x00001000
    0x00002000
    0x00004000
    0x00008000
    0x00000100
    0x00000200
    0x00000400
    0x00000800
    0x00000010
    0x00000020
    0x00000040
    0x00000080
    0x00000001
    0x00000002
    0x00000004
    0x00000008
)

# 특별한 값들도 추가
SPECIAL_FLAGS=(1337 4919 4920 4921 2025)

for flag in "${FLAGS[@]}" "${SPECIAL_FLAGS[@]}"; do
    echo "Trying flag: $flag (0x$(printf '%x' $flag))"
    
    # BANGO 액션으로 Intent 전송
    adb shell am start -n "$PACKAGE/.$ACTIVITY" \
        -a "BANGO" \
        -f "$flag" \
        --es "f" "test_flag_extraction"
    
    sleep 1
    
    # Logcat에서 결과 확인
    adb logcat -d | grep -i "l3ak\|flag\|error" | tail -5
    echo "---"
done

echo "=== Logcat 전체 로그 확인 ==="
adb logcat -d | grep -i "l3ak" 