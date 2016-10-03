package com.niccorder.shiparoo;

import android.app.Application;

import com.niccorder.shiparoo.di.component.ApplicationComponent;
import com.niccorder.shiparoo.di.component.DaggerApplicationComponent;
import com.niccorder.shiparoo.di.module.ApplicationModule;

import timber.log.Timber;
import timber.log.Timber.DebugTree;

public class ShiparooApp extends Application {

    private ApplicationComponent mComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        initializeInjector();
        initializeLogger();
    }

    private void initializeInjector() {
        this.mComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    private void initializeLogger() {
        if (BuildConfig.DEBUG) Timber.plant(new DebugTree());
        //TODO
        //if (BuildConfig.CRASHLYTICS) Timber.plant(new CrashlyticsTree());
    }

    public ApplicationComponent getApplicationComponent() {
        return this.mComponent;
    }

}
