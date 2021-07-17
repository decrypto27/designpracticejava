package com.example.demo.proxy;

public class Runner {

    public static final String PROFILE = "Ganda baccha";

    public static void main(String args[]) {

        TwitterProxy twitterProxy = (TwitterProxy) SecurityProxy.newInstance(new TwitterProxyImpl());
        twitterProxy.printTweets(PROFILE);
        twitterProxy.putTweet(PROFILE);
    }

}
