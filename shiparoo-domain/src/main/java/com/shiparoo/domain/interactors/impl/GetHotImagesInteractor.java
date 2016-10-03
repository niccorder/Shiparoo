package com.shiparoo.domain.interactors.impl;

import com.shiparoo.domain.executor.MainThread;
import com.shiparoo.domain.executor.NetworkExecutor;
import com.shiparoo.domain.interactors.base.AbstractInteractor;
import com.shiparoo.domain.repository.ImageRepository;

import rx.Observable;

public class GetHotImagesInteractor extends AbstractInteractor {

    private ImageRepository mRepository;
    private int             mIndex;

    public GetHotImagesInteractor(NetworkExecutor networkExecutor, MainThread mainThread, ImageRepository repository) {
        super(networkExecutor, mainThread);

        mRepository = repository;
    }

    public Observable getNextPage() {
        return mRepository.getHomepageImages(mIndex++);
    }

    @Override
    protected Observable buildUseCaseObservable() {
        return this.mRepository.getHomepageImages(1);
    }

}
