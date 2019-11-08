package com.example.hci_bank;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {

    private String accNo = "12345678901";
    private String name = "Abcd Pqrs";
    private String balance = "999999";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ((TextView)findViewById(R.id.AccNo2TV)).setText(accNo);
//        ((TextView)findViewById(R.id.NameTV)).setText(name);
//        ((TextView)findViewById(R.id.CurrentBalanceL)).setText(balance);
        setContentView(R.layout.activity_home_page);
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
                .setTitle("Sign Out")
                .setMessage("Are you sure you want to exit?")
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
        Intent nextActivity = new Intent(this,MoneyTransfer.class);
        startActivity(nextActivity);
        finish();

    }

    public void openPassbook(View view) {
        Intent nextActivity = new Intent(this,Passbook.class);
        startActivity(nextActivity);
        finish();
    }

    public void openSettings(View view) {
        Intent nextActivity = new Intent(this,Settings.class);
        startActivity(nextActivity);
        finish();
    }

    public void showUserCards(View view) {
        Intent nextActivity = new Intent(this,Cards.class);
        startActivity(nextActivity);
        finish();
    }

    public void signOut(View view) {
        accNo = null;
        name = null;
        balance = null;
        confirmLogOut();
    }
}
