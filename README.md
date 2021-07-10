## Useful commands:
* List all indexes: 
`curl -XGET 127.0.0.1:9200/${indexName}/_cat/indices`
* add mapping:
`curl -XPUT -H "Content-Type: application/json" 127.0.0.1:9200/${indexName} --data-binary @${filePath}.json`
* load data from .json file:
`curl -XPOST -H "Content-Type: application/json" 127.0.0.1:9200/${indexName}/_bulk --data-binary @${filePath}.json
`
* delete index:
`curl -X DELETE "localhost:9200/${indexName}?pretty"`