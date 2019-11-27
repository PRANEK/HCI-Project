package com.example.Bank;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MoneyTransfer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_transfer);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            return backPress();
        }
        return super.onKeyDown(keyCode, event);
    }

    private boolean backPress() {
        Intent nextActivity = new Intent(this, HomePage.class);
        startActivity(nextActivity);
        finish();
        return true;
    }

    public void back(View view) {
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.click);
        mp.start();
        backPress();
    }

    public void help(View view) {
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.intro);
        mp.start();
    }
}
