#!/bin/bash

message=$1

cd src/main/java/com/spring_boot_core && git add -A && git commit -m "$message"

branch=$(git branch --show-current)

git push origin "$branch"
