package com.example.demo.proxy;

public class TwitterStub implements TwitterProxy{
    @Override
    public void putTweet(String s) {
        System.out.println("hello");
    }

    @Override
    public void printTweets(String profile) {
        System.out.println("world");
    }
}
