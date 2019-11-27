package com.example.Bank;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {

    private String accNo = "12345678901";
    private String name = "Abcd Pqrs";
    private String balance = "999999";

    private View signOutButtonView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ((TextView)findViewById(R.id.AccNo2TV)).setText(accNo);
//        ((TextView)findViewById(R.id.NameTV)).setText(name);
//        ((TextView)findViewById(R.id.CurrentBalanceL)).setText(balance);
        setContentView(R.layout.activity_home_page);

        signOutButtonView = findViewById(R.id.sign_out_button_view);
        signOutButtonView.setClickable(true);
        signOutButtonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomePage.this.signOut(v);
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            confirmLogOut();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void confirmLogOut() {
        new AlertDialog.Builder(this)
                .setTitle(R.string.sign_out)
                .setMessage("क्या आप बाहर निकलना चाहते है ?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent nextActivity = new Intent(getBaseContext(), MainActivityLogin.class);
                        startActivity(nextActivity);
                        finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    public void openMoneyTranfer(View view) {
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.click);
        mp.start();
        Intent nextActivity = new Intent(this,MoneyTransfer.class);
        startActivity(nextActivity);
        finish();

    }

    public void openPassbook(View view) {
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.click);
        mp.start();
        Intent nextActivity = new Intent(this,Passbook.class);
        startActivity(nextActivity);
        finish();
    }

    public void openSettings(View view) {
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.click);
        mp.start();
        Intent nextActivity = new Intent(this,Settings.class);
        startActivity(nextActivity);
        finish();
    }

    public void showUserCards(View view) {
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.click);
        mp.start();
        Intent nextActivity = new Intent(this,Cards.class);
        startActivity(nextActivity);
        finish();
    }

    public void signOut(View view) {
        accNo = null;
        name = null;
        balance = null;
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.click);
        mp.start();
        confirmLogOut();
    }

    public void help(View view) {
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.intro);
        mp.start();
    }

    public void back(View view) {
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.click);
        mp.start();
        signOut(view);
    }
}
