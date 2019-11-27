package com.example.Bank;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityLogin extends AppCompatActivity {

    private String username;
    private String password;
    private View signInButtonView;
    private View resetPasswordButtonView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signInButtonView = findViewById(R.id.sign_in_button_view);
        resetPasswordButtonView = findViewById(R.id.reset_password_button_view);

        signInButtonView.setClickable(true);
        resetPasswordButtonView.setClickable(true);

        signInButtonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivityLogin.this.signInBank(v);
            }
        });

        resetPasswordButtonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivityLogin.this.resetPassword(v);
            }
        });
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
        Log.d("error", "Hii");
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.click);
        mp.start();
        username = ((EditText)findViewById(R.id.UsernameET)).getText().toString();
        password = ((EditText)findViewById(R.id.PassET)).getText().toString();
        if(username!=null && password!=null){
            username = null;
            password = null;
            Intent nextActivity = new Intent(this, HomePage.class);
            startActivity(nextActivity);
            finish();
        }
    }

    public void resetPassword(View view) {
        Log.d("error", "hello");
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.click);
        mp.start();
        Intent nextActivity = new Intent(this,ForgotPassword.class);
        startActivity(nextActivity);
        finish();
    }

    public void back(View view) {
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.click);
        mp.start();
        finish();
    }

    public void help(View view) {
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.login);
        mp.start();
    }
}
