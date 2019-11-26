package com.example.Bank;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
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

    public void changePassword(View view) {
        Intent nextActivity = new Intent(this, ForgotPassword.class);
        startActivity(nextActivity);
        finish();
    }

    public void changeLanguage(View view) {
        Intent nextActivity = new Intent(this, ChangeLanguage.class);
        startActivity(nextActivity);
        finish();
    }

    public void help(View view) {
    }

    public void back(View view) {
        backPress();
    }
}
