package com.niccorder.shiparoo.presentation.presenters.base;

public interface BasePresenter {
    void resume();

    void pause();

    void stop();

    void destroy();

    void onError(String message);
}
