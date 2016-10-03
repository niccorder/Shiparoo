package com.niccorder.shiparoo.di.component;

import android.content.Context;

import com.niccorder.shiparoo.di.module.ApplicationModule;
import com.niccorder.shiparoo.navigation.Navigator;
import com.niccorder.shiparoo.ui.activities.BaseActivity;
import com.shiparoo.domain.executor.MainThread;
import com.shiparoo.domain.executor.NetworkExecutor;
import com.shiparoo.domain.repository.ImageRepository;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(BaseActivity baseActivity);

    Context context();
    NetworkExecutor threadExecutor();
    MainThread mainThread();
    OkHttpClient okttpClient();
    Retrofit retrofit();
    ImageRepository imageRepository();
    Navigator navigator();
}
