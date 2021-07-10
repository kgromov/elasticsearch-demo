package com.elasticsearch.demo.repositories;

import com.elasticsearch.demo.domain.Quote;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface QuoteRepository extends ElasticsearchRepository<Quote, String> {
  /*  Page<Quote> findByQuotesByTextEntry(String name, Pageable pageable);

    @Query("{\"bool\": {\"must\": [{\"match\": {\"text_entry\": \"?0\"}}]}}")
    Page<Quote> findByQuotesByTextEntryUsingCustomQuery(String name, Pageable pageable);*/
}
