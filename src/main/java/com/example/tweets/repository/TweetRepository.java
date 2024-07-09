package com.example.tweets.repository;

import com.example.tweets.entity.Tweet;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TweetRepository extends CassandraRepository<Tweet, UUID> {

}
