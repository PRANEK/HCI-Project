package com.example.Bank;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ForgotPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            return backPress();
        }
        return super.onKeyDown(keyCode, event);
    }

    private boolean backPress() {
        Intent nextActivity = new Intent(this, MainActivityLogin.class);
        startActivity(nextActivity);
        finish();
        return true;
    }

    public void help(View view) {
    }

    public void back(View view) {
        backPress();
    }
}
