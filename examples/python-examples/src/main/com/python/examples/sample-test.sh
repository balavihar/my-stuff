#!/usr/bin/env bash
echo "adasdasd"
function testSample() {
    response = $(curl --connect-timeout 2 -H "Accept: application/json" -H "Content-Type: application/json" -H "Authorization: Basic YWRtaW46YWRtaW4=" http://localhost:8182/uta/enterprises 2>&1 | grep "200")
    echo "aaaa"
    if [[ -z "$response" ]] ; then
        return 1
    else
        return 0
    fi
}
testSample


response = $(curl --write-out %{http_code} --silent --output -I --connect-timeout 2 -H "Accept: application/json" -H "Content-Type: application/json" -H "Authorization: Basic YWRtaW46YWRtaW4=" http://localhost:8182/uta/enterprises 2>&1)
    echo "bbb"
    echo response
    echo $response
    echo "$response"
    if [[ -z "$response" ]] ; then
        echo 1
    else
        echo 0
    fi



curl --max-time 3 --connect-timeout 2 -H "Accept: application/json" -H "Content-Type: application/json" -H "Authorization: Basic YWRtaW46YWRtaW4=" http://localhost:8182/uta/enterprises 2>&1 | grep "200"

resp=$(curl --connect-timeout 1 -i -H "Accept: application/json" -H "Content-Type: application/json" -H "Authorization: Basic YWRtaW46YWRtaW4=" http://localhost:8182/uta/enterprises | grep "200")
echo $resp
if [[ -z "$resp" ]] ; then
    echo 1
else
    echo 0
fi