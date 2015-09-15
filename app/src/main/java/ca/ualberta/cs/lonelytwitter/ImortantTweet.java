package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.Date;

/**
 * Created by sheremet on 9/14/15.
 */
public class ImortantTweet extends Tweet implements Tweetable{

    public ImortantTweet(String tweet, Date date) {
        super(tweet, date);
    }

    public ImortantTweet(String text) throws IOException {
        super(text);
        this.setText(text);
    }

    public Boolean isImportant() {

        return Boolean.TRUE;

    }

}

