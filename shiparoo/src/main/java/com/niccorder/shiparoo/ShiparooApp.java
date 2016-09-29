package com.niccorder.shiparoo;

import android.app.Application;
import timber.log.Timber;
import timber.log.Timber.DebugTree;

public class ShiparooApp extends Application {
    @Override public void onCreate() {
        super.onCreate();

        Timber.plant(new DebugTree());
    }
}
