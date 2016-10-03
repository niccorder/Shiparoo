package com.niccorder.shiparoo.ui;


public interface BaseView {

    void showProgress();

    void hideProgress();

    void showError(Throwable throwable);
}
