#!/bin/bash

forge init $FORGE_PROJECT_DIR
cd $FORGE_PROJECT_DIR

rm -rf src test

cp /app/remappings.txt ./
cp -r /app/lib/* ./lib
cp -r /app/src ./src
forge build --optimize --via-ir

cp -rf ./out /app/out/
