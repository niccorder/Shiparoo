package com.niccorder.shiparoo.di.component;


import android.support.v7.app.AppCompatActivity;

import com.niccorder.shiparoo.di.PerActivity;
import com.niccorder.shiparoo.di.module.ActivityModule;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    AppCompatActivity activity();
}
