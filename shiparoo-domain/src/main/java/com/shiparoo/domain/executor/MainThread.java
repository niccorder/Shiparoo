package com.shiparoo.domain.executor;

import rx.Scheduler;

public interface MainThread {
    Scheduler getScheduler();
}
