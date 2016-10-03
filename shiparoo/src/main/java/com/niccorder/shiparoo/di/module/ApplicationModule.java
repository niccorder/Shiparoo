package com.niccorder.shiparoo.di.module;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.niccorder.shiparoo.ShiparooApp;
import com.niccorder.shiparoo.threading.UiThread;
import com.shiparoo.data.api.ImgurAPI;
import com.shiparoo.data.executor.NetworkExecutionThread;
import com.shiparoo.data.repository.ImgurRepository;
import com.shiparoo.domain.executor.MainThread;
import com.shiparoo.domain.executor.NetworkExecutor;
import com.shiparoo.domain.repository.ImageRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Dagger module that provides objects which will live during the application lifecycle.
 */
@Module
public class ApplicationModule {
    private final ShiparooApp application;

    public ApplicationModule(ShiparooApp application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return this.application;
    }

    @Provides
    @Singleton
    NetworkExecutor provideThreadExecutor() {
        return new NetworkExecutionThread();
    }

    @Provides
    @Singleton
    MainThread provideMainThread() {
        return new UiThread();
    }

    @Provides
    @Singleton
    OkHttpClient provideOkhttpClient() {
        return new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor())
                .addNetworkInterceptor(new HttpLoggingInterceptor())
                .build();
    }

    @Provides
    @Singleton
    Retrofit provideRetrofit(OkHttpClient client) {
        return new Retrofit.Builder()
                .baseUrl("https://api.imgur.com/3/")
                .client(client)
                .validateEagerly(true)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Provides
    @Singleton
    Glide provideGlide(Context context) {
        return Glide.get(context);
    }

    @Provides
    @Singleton
    ImageRepository provideImageRepository(Context context, Retrofit retrofit) {
        return new ImgurRepository(context, retrofit.create(ImgurAPI.class));
    }
}