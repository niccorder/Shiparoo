package com.niccorder.shiparoo.threading;

import com.shiparoo.domain.executor.MainThread;

import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;

public class UiThread implements MainThread {

    @Override
    public Scheduler getScheduler() {
        return AndroidSchedulers.mainThread();
    }
}
