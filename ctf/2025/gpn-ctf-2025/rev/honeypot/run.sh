#!/bin/bash

set +m

pgid=$(ps -o pgid= $$ | xargs)

sleep infinity & sleeppid=$!
trap "kill $sleeppid" SIGUSR1

run_governor() {
  java --enable-native-access=ALL-UNNAMED -jar $1 "$sleeppid" "-$pgid"
}

run_governor "$1" &

waitpid $sleeppid

echo "Enter your favourite way of printing your flag"

TARGET=flag

while :; do
    read -n 1 direction
    echo

    case $direction in
      h)
        head $TARGET &
        ;;
      t)
        tail $TARGET &
        ;;
      c)
        cat $TARGET &
        ;;
      b)
        base64 $TARGET | base64 -d &
        ;;
      *)
        echo "Invalid"
        kill -9 -- "-$pgid"
        ;;
    esac
done