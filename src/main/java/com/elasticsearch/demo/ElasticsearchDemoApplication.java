package com.elasticsearch.demo;

import com.elasticsearch.demo.sevices.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElasticsearchDemoApplication implements CommandLineRunner {
    @Autowired private SearchService searchService;

    public static void main(String[] args) {
        SpringApplication.run(ElasticsearchDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        searchService.searchWithClient();
    }
}
