package ca.ualberta.cs.lonelytwitter;

<<<<<<< HEAD
import java.util.Date;

/**
 * Created by joshua2 on 9/16/15.
 */
public class NormalTweet extends Tweet {
=======
import java.io.IOException;
import java.util.Date;

/**
 * Created by sheremet on 9/14/15.
 */
public class NormalTweet extends Tweet implements Tweetable {

>>>>>>> 2c6c05bbddb6c3e8ee4320d4153bfa60dec0cf6d
    public NormalTweet(String tweet, Date date) {
        super(tweet, date);
    }

<<<<<<< HEAD
    public NormalTweet(String tweet) {
        super(tweet);
    }

    public Boolean isImportant() {
        return Boolean.FALSE;
    }
=======

    public NormalTweet(String text) throws IOException {
        super(text);
    }

    public Boolean isImportant() {

        return Boolean.FALSE;

    }


>>>>>>> 2c6c05bbddb6c3e8ee4320d4153bfa60dec0cf6d
}
