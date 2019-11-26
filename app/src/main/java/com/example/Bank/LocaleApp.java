package com.example.Bank;

import android.app.Application;

import java.util.Locale;

public class LocaleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        LocaleManager.setLocale(new Locale(LocaleManager.getPrefLangCode(this), LocaleManager.getPrefCountryCode(this)));
        LocaleManager.updateConfiguration(this, getResources().getConfiguration());
    }
}
