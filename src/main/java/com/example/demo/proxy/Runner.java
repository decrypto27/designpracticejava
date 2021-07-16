package com.example.demo.proxy;

public class Runner {

    public static final String PROFILE = "";

    public static void main(String args[]) throws Exception{

        TwitterProxy twitterProxy = (TwitterProxy) SecurityProxy.newInstance(new TwitterProxyImpl());
        twitterProxy.printTweets(PROFILE);
        twitterProxy.putTweet("PROFILE");
    }

}
