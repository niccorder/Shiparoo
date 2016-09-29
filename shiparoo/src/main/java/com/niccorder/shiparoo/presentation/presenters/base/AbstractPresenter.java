package com.niccorder.shiparoo.presentation.presenters.base;

import com.niccorder.shiparoo.domain.executor.Executor;
import com.niccorder.shiparoo.domain.executor.MainThread;

public abstract class AbstractPresenter {
    protected Executor mExecutor;
    protected MainThread mMainThread;

    public AbstractPresenter(Executor executor, MainThread mainThread) {
        mExecutor = executor;
        mMainThread = mainThread;
    }
}
