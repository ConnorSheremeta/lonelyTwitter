package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.Date;

/**
<<<<<<< HEAD
 * Created by joshua2 on 9/16/15.
 */
public abstract class Tweet extends Object implements Tweetable {
    private String text;
    protected Date date;

    public Tweet(String tweet, Date date) throws TweetTooLongException {
        this.setText(tweet);
        this.date = date;
    }

    public Tweet(String tweet) throws TweetTooLongException {
        this.setText(tweet);
        this.date = new Date();
=======
 * Created by sheremet on 9/14/15.
 */
//dont allow tweet.txt = "", we want getter and setter methods
public abstract class Tweet {

    private String text;
    private Date date;
    private Array<String> moods;

    public Tweet(String text, Date date, Array<String> moods) {
        this.text = text;
        this.date = date;
        this.moods = moods;
    }

    public Tweet(String text) {
        this.text = text;
        date = new Date();
>>>>>>> 2c6c05bbddb6c3e8ee4320d4153bfa60dec0cf6d
    }

    public String getText() {
        return text;
    }

<<<<<<< HEAD
    public void setText(String text) throws TweetTooLongException {
        if (text.length() <= 140) {
            this.text = text;
        } else {
            throw new TweetTooLongException();
        }
    }

=======
    public void setText(String text) throws IOException{
        if (text.length() <= 140) {
            this.text = text;
        } else{
            throw new IOException("Tweet was too long!");
        }
    }


    // x.y in java is basicay x->y in c

>>>>>>> 2c6c05bbddb6c3e8ee4320d4153bfa60dec0cf6d
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
<<<<<<< HEAD
    }

    public abstract Boolean isImportant();

    @Override
    public String toString() {
        return date.toString() + " || " + this.text;
    }

}
=======

    }

    public Array<String> getMoods() {
        return moods;
    }

    public void setMoods(Array<String> moods) {
        this.moods = moods;
    }

    public abstract  Boolean isImportant();
}


>>>>>>> 2c6c05bbddb6c3e8ee4320d4153bfa60dec0cf6d
