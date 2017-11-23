package com.example.android.music;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Song one = new Song("Unfaithful", "Rihanna", "4.5 m");
        Song two = new Song("Unfaithful", "Rihanna", "4.5 m");
        //one.setEnglishText("one"); böyle de ulaşabilirim..
        ArrayList<Song> songList = new ArrayList<>();
        //oluşturduğum 2 nesneyi wordList arraylist ine ekliyorum.
        songList.add(one);
        songList.add(two);
        SongAdapter songAdapter = new SongAdapter(this, songList);
        listview = (ListView) findViewById(R.id.listview_xml);
        listview.setAdapter(songAdapter);
    }
}
