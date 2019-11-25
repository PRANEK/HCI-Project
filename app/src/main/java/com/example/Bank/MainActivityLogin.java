package com.example.Bank;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityLogin extends AppCompatActivity {

    private String username = null;
    private String password = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public void signInBank(View view) {
        username = ((EditText)findViewById(R.id.UserNameET)).getText().toString();
        password = ((EditText)findViewById(R.id.PasswordTV)).getText().toString();
        if(username!=null && password!=null){
            username = null;
            password = null;
            Intent nextActivity = new Intent(this, HomePage.class);
            startActivity(nextActivity);
            finish();
        }
    }

    public void resetPassword(View view) {
        Intent nextActivity = new Intent(this,ForgotPassword.class);
        startActivity(nextActivity);
        finish();
    }
}
