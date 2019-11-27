package com.example.Bank;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ChangeLanguage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_lang);

    }

    public void englishChosen(View view) {
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.click);
        mp.start();
        //TODO: Add functionality
    }

    public void hindiChosen(View view) {
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.click);
        mp.start();
        //TODO: Add functionality
    }

    public void back(View view) {
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.click);
        mp.start();
        onBackPressed(); // TODO: change if onKeyDown used
    }

    public void help(View view) {
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.intro);
        mp.start();
    }
}