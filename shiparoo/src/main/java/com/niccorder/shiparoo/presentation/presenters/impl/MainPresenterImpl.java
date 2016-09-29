package com.niccorder.shiparoo.presentation.presenters.impl;

import com.niccorder.shiparoo.domain.executor.Executor;
import com.niccorder.shiparoo.domain.executor.MainThread;
import com.niccorder.shiparoo.domain.interactors.SampleInteractor;
import com.niccorder.shiparoo.presentation.presenters.MainPresenter;
import com.niccorder.shiparoo.presentation.presenters.base.AbstractPresenter;

public class MainPresenterImpl extends AbstractPresenter
    implements MainPresenter, SampleInteractor.Callback {

    private MainPresenter.View mView;

    public MainPresenterImpl(Executor executor, MainThread mainThread, View view) {
        super(executor, mainThread);
        mView = view;
    }

    @Override public void resume() {

    }

    @Override public void pause() {

    }

    @Override public void stop() {

    }

    @Override public void destroy() {

    }

    @Override public void onError(String message) {

    }
}
