package com.elasticsearch.demo.sevices;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Service;

import static java.util.Collections.singletonMap;
import static org.elasticsearch.action.support.WriteRequest.RefreshPolicy.IMMEDIATE;

@Service
@RequiredArgsConstructor
public class SearchService {
    private final ElasticsearchOperations elasticsearchTemplate;
    private final RestHighLevelClient client;

    @SneakyThrows
    public void searchWithTemplate() {
//        elasticsearchTemplate.indexOps(Article.class).create();
    }

    @SneakyThrows
    public void searchWithClient() {
        IndexRequest request = new IndexRequest("shakespeare")
                .id("1")
                .source(singletonMap("feature", "high-level-rest-client"))
                .setRefreshPolicy(IMMEDIATE);
        IndexResponse response = client.index(request, RequestOptions.DEFAULT);
        String responseText = response.toString();
    }
}
