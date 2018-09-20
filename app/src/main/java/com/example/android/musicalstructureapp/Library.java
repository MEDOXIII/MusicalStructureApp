package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Library extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.library);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Song Name :  " + "Alone", "Artist Name :  " + "Alan Walker "));
        songs.add(new Song("Song Name :  " + "Perfect", "Artist Name :  " + "Ed Sheeran"));
        songs.add(new Song("Song Name :  " + "Fix You", "Artist Name :  " + "Coldplay"));
        songs.add(new Song("Song Name :  " + "Whatever It Takes", "Artist Name :  " + "Imagine Dragons"));
        songs.add(new Song("Song Name :  " + "Symphony", "Artist Name :  " + "Clean Bandit"));
        songs.add(new Song("Song Name :  " + "rather be", "Artist Name :  " + "Clean Bandit"));
        songs.add(new Song("Song Name :  " + "Faded", "Artist Name :  " + "Alan Walker "));


        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


        TextView goBack = (TextView) findViewById(R.id.back);

        goBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent goBackIntent = new Intent(Library.this, MainActivity.class);
                startActivity(goBackIntent);
            }
        });
    }

}