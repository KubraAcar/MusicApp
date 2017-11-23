package com.example.android.music;

import android.app.Activity;

/**
 * Created by Lenovo on 22.11.2017.
 */

public class Song {
    private String name;
    private String singerName;
    private String duration;

    public Song(String name, String artistname, String duration) {
        this.name = name;
        this.singerName = artistname;
        this.duration = duration;
    }

    public Song() {
    }

    public String getName() {
        return name;
    }

    public String getSingerName() {
        return singerName;
    }

    public String getDuration() {
        return duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArtistname(String artistname) {
        this.singerName = artistname;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
