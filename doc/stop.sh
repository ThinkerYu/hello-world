#!/usr/bin/env bash
echo "**********************stop application begining**********************"
curl -X POST http://127.0.0.1:8001/management/shutdown
echo -e ""
echo "**********************stop application finished**********************"