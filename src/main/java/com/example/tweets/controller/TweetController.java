package com.example.tweets.controller;

import com.example.tweets.TweetsApplication;
import com.example.tweets.entity.Tweet;
import com.example.tweets.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TweetController {

    @Autowired
    private TweetService tweetService;

    @GetMapping("/")
    public List<Tweet> getAllTweets(){
        return tweetService.getAllTweets();
    }

    @PostMapping("/")
    public Tweet createTweet(@RequestBody Tweet tweet){
        return tweetService.createTweet(tweet);
    }
}
