package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.Date;

/**
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
    }

    public String getText() {
        return text;
    }

    public void setText(String text) throws IOException{
        if (text.length() <= 140) {
            this.text = text;
        } else{
            throw new IOException("Tweet was too long!");
        }
    }


    // x.y in java is basicay x->y in c

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;

    }

    public Array<String> getMoods() {
        return moods;
    }

    public void setMoods(Array<String> moods) {
        this.moods = moods;
    }

    public abstract  Boolean isImportant();
}


