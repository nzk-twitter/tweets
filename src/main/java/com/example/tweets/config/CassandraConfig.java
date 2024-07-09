package com.example.tweets.config;

import com.datastax.oss.driver.api.core.CqlSession;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CassandraConfig {

    @Value("${spring.data.cassandra.keyspace-name}")
    private String cassandraKeySpace;

    /*
     * Use the standard Cassandra driver API to create a com.datastax.oss.driver.api.core.CqlSession instance.
     */
    @Bean
    public CqlSession session() {
        return CqlSession.builder().withKeyspace(cassandraKeySpace).build();
    }

}
