package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

import java.util.Date;

/**
 * Created by sheremet on 9/14/15.
 */
public abstract class CurrentMood {
    private Date date;
    private String mood;

    public CurrentMood(Date date, String mood) {
        this.date = date;
        this.mood = mood;
    }

    public CurrentMood(String mood) {
        this.mood = mood;
        date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    pubic String getMoodRepr(Object mood){
        if (equals(getMood(mood),"happy")){
            return ("I am very happy");
        }else{
            return ("I am very sad");
        }
    }

}
