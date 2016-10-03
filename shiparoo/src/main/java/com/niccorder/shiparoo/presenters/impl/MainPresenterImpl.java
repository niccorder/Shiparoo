package com.niccorder.shiparoo.presenters.impl;

import com.niccorder.shiparoo.presenters.MainPresenter;
import com.shiparoo.domain.interactors.impl.GetHotImagesInteractor;
import com.shiparoo.domain.model.ImageModel;

import java.util.List;

import javax.inject.Inject;

import rx.Subscriber;
import timber.log.Timber;

public class MainPresenterImpl implements MainPresenter {

    private GetHotImagesInteractor mInteractor;
    private MainPresenter.View     mView;

    private int mPageSize;

    @Inject
    public MainPresenterImpl(GetHotImagesInteractor interactor) {
        mPageSize = 0;
        mInteractor = interactor;
    }

    @Override
    public void setView(View view) {
        mView = view;
    }

    @Override
    public void resume() {
        this.onNextImagesRequested();
    }

    @Override
    public void pause() {
    }

    @Override
    public void stop() {
    }

    @Override
    public void destroy() {
    }

    class Callback extends Subscriber<List<ImageModel>> {
        @Override
        public void onCompleted() {
            Timber.i("onCompleted");
        }

        @Override
        public void onError(Throwable e) {
            Timber.e(e);
            MainPresenterImpl.this.mView.showError(e);
        }

        @Override
        public void onNext(List<ImageModel> imageModels) {
            Timber.i("onImagesReceived: %d", imageModels.size());

            MainPresenterImpl.this.mView.onShowImages(imageModels);
        }
    }

    @Override
    public void onRefresh() {
        mPageSize = 0;
    }

    @Override
    public void onNextImagesRequested() {
        Timber.i("onNextImagesRequested");

        mInteractor.execute(new Callback());
    }
}
