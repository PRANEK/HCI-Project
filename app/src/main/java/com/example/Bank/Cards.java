package com.example.Bank;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Cards extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            backPress();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void backPress() {
        Intent nextActivity = new Intent(this, HomePage.class);
        startActivity(nextActivity);
        finish();
    }

    public void help(View view) {
    }

    public void back(View view) {
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.click);
        mp.start();
        backPress();
    }
}
