#!/usr/bin/env bash
# tries a single raw payload, prints len + result
PAYLOAD="$1"
LEN=$(printf '%s' "$PAYLOAD" | wc -c | tr -d ' ')
ENC=$(python3 -c "import urllib.parse,sys; print(urllib.parse.quote(sys.argv[1], safe=''))" "$PAYLOAD")
RESP=$(curl -sS "http://localhost:8080/prob.php?pw=$ENC")
SOLVED=$(echo "$RESP" | grep -o 'SOLVED\|nice try\|not solved' | head -1)
PTS=$(echo "$RESP" | grep -oE 'points=[0-9]+' | head -1)
echo "[$SOLVED] len=$LEN  $PTS  payload=$PAYLOAD"
