package com.example.Bank;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MoneyTransfer extends AppCompatActivity {
    private View addbeneView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_money_transfer);
        addbeneView = findViewById(R.id.activity_benificiary_add_button);
        addbeneView.setClickable(true);
        addbeneView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MoneyTransfer.this.addbene(v);
            }
        });
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

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.money_transfer);
        mp.start();

    }

    public void addbene(View view) {
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.click);
        mp.start();
        Intent nextActivity = new Intent(this, BenificiaryDetails.class);
        startActivity(nextActivity);
        finish();
    }
}
