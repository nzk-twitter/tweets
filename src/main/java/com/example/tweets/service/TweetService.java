package com.example.tweets.service;

import com.example.tweets.TweetsApplication;
import com.example.tweets.entity.Tweet;
import com.example.tweets.repository.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class TweetService {

    @Autowired
    private TweetRepository tweetRepository;

    public Tweet createTweet(Tweet tweet) {
        return tweetRepository.save(tweet);
    }

    public List<Tweet> getAllTweets(){
        return tweetRepository.findAll();
    }
}
