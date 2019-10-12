package com.example.hci_bank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main extends AppCompatActivity {

    private String accNo = "12345678901";
    private String name = "Abcd Pqrs";
    private String balance = "999999";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((TextView)findViewById(R.id.AccNo2TV)).setText(accNo);
        ((TextView)findViewById(R.id.NameTV)).setText(name);
        ((TextView)findViewById(R.id.CurrentBalance2)).setText(balance);
        setContentView(R.layout.activity_benificiary_details);
    }

    public void openMoneyTranfer(View view) {
        Intent nextActivity = new Intent(this,MoneyTransfer.class);
        startActivity(nextActivity);
    }

    public void openPassbook(View view) {
        Intent nextActivity = new Intent(this,Passbook.class);
        startActivity(nextActivity);
    }

    public void openSettings(View view) {
        Intent nextActivity = new Intent(this,Settings.class);
        startActivity(nextActivity);
    }

    public void showUserCards(View view) {
        Intent nextActivity = new Intent(this,Cards.class);
        startActivity(nextActivity);
    }

    public void signOut(View view) {
        accNo = null;
        name = null;
        balance = null;
        Intent prevActivity = new Intent(this,MainActivityLogin.class);
        startActivity(prevActivity);
    }
}
