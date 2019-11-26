package com.example.Bank;

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
        //TODO: Add functionality
    }

    public void hindiChosen(View view) {
        //TODO: Add functionality
    }

    public void back(View view) {
        onBackPressed(); // TODO: change if onKeyDown used
    }

    public void help(View view) {
    }
}