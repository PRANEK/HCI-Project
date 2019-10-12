package com.example.hci_bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivityLogin extends AppCompatActivity {

    private String username = null;
    private String password = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
    }

    public void signInBank(View view) {
        username = ((EditText)findViewById(R.id.UserNameET)).getText().toString();
        password = ((EditText)findViewById(R.id.PasswordTV)).getText().toString();
        if(username!=null && password!=null){
            username = null;
            password = null;
            Intent nextActivity = new Intent(this,Main.class);
            startActivity(nextActivity);
        }
    }

    public void resetPassword(View view) {
        Intent nextActivity = new Intent(this,ForgotPassword.class);
        startActivity(nextActivity);
    }
}
