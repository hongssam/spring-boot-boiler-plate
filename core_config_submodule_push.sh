#!/bin/bash

message=$1

cd src/main/resources/spring_boot_config && git add -A && git commit -m "$message"

branch=$(git branch --show-current)

git push origin "$branch"
