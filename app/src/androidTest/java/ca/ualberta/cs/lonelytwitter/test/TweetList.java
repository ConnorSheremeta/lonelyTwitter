package ca.ualberta.cs.lonelytwitter.test;

import java.util.ArrayList;

import ca.ualberta.cs.lonelytwitter.Tweet;

/**
 * Created by sheremet on 9/28/15.
 */
public class TweetList extends RuntimeException {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();


    public void add(Tweet tweet){
        if (!tweets.contains(tweet)) {
            tweets.add(tweet);
        }else{

            throw new IllegalArgumentException(e);
        }
    }
    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }


    public Boolean contains(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public Boolean hasTweet(Tweet tweet){
        return contains(tweet);

    }

    public int getCount() {
        int i = 1;

        return i;
    }

    public void removeTweet(Tweet tweet) {
        delete(tweet);
    }
}
