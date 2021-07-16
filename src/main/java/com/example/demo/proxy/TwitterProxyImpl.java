package com.example.demo.proxy;

import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;

public class TwitterProxyImpl implements TwitterProxy {
    private static Twitter twitter;

    static {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("")
                .setOAuthConsumerSecret("")
                .setOAuthAccessToken("3964549877-")
                .setOAuthAccessTokenSecret("");
        TwitterFactory tf = new TwitterFactory(cb.build());
        twitter = tf.getInstance();
    }

    @Override
    public void putTweet(String s) {
        try {
            Status status = twitter.updateStatus("Rocking twitter4j");
        } catch (TwitterException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void printTweets(String profile) {
        StringBuilder builder = new StringBuilder();
        try {
            Query query = new Query(profile);
            QueryResult result;
            do {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();
                for (Status tweet : tweets) {
                    builder.append("@" + tweet.getUser().getScreenName() + " - " + tweet.getText() + " - " +
                            tweet.getCreatedAt());
                    builder.append("\n");
                }
            } while ((query = result.nextQuery()) != null);

        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
        }
        System.out.println(builder);
    }
}
