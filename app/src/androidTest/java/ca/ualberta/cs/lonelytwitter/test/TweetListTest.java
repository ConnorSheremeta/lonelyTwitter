package ca.ualberta.cs.lonelytwitter.test;

import android.test.ActivityInstrumentationTestCase2;

import junit.framework.TestCase;

import ca.ualberta.cs.lonelytwitter.NormalTweet;
import ca.ualberta.cs.lonelytwitter.Tweet;

/**
 * Created by sheremet on 9/28/15.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testAddTweet(){

        TweetList list = new TweetList();
        list.add(new NormalTweet("test"));


    }

    public void testDelete(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        list.delete(tweet);
        assertFalse(list.contains(tweet));
    }

    public void testContains(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        assertTrue(list.contains(tweet));
    }

    public void testDuplicate(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);

        try {
            list.add(tweet);
        }catch(IllegalArgumentException e) {
            assertTrue(true);
        }
        assertTrue(false);



    }

    public void testHasTweet(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));


    }

    public void testgetCount(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        Tweet tweet2 = new NormalTweet("test2");
        list.add(tweet2);
        assertEquals(2,list.getCount());
    }

    public void testremoveTweet(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        list.removeTweet(tweet);
        assertEquals(list.getCount(),0);
    }

    public void testGetTweets(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        Tweet tweet2 = new NormalTweet("test2");
        list.add(tweet2);
        assertEquals(getTweets(list), list);

    }

    private TweetList getTweets(TweetList list) {
        return null;
    }

}