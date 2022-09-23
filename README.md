# swagger-verify-api-contract
use swagger OAS to make sure server api does not introduce breaking changes

## Initial plan
1. generate the api specifications for current code
2. compare this with api specifications in swagger hub

## Issue
- api specification compare plugin run before the api specification generate plugin

## Workaround
- run maven commands twise
1. skip api diff plugin and run only api generate plugin. now there is an api specification file
2. run maven command again and run the diff plugin
