package com.example.android.music;

import android.app.Activity;

/**
 * Created by Lenovo on 22.11.2017.
 */

public class Song {
    private String name;
    private String singer;
    private String duration;

    public Song(String name, String artistname, String duration) {
        this.name = name;
        this.singer = artistname;
        this.duration = duration;
    }

    public Song() {
    }

    public String getName() {
        return name;
    }

    public String getSingerName() {
        return singer;
    }

    public String getDuration() {
        return duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArtistname(String artistname) {
        this.singer = artistname;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
