package com.example.Bank;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class BenificiaryDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benificiary_details);
    }

    private void backPress() {
        Intent nextActivity = new Intent(this, MoneyTransfer.class);
        startActivity(nextActivity);
        finish();
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
