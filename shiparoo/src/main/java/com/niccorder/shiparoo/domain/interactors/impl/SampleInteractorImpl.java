package com.niccorder.shiparoo.domain.interactors.impl;

import com.niccorder.shiparoo.domain.executor.Executor;
import com.niccorder.shiparoo.domain.executor.MainThread;
import com.niccorder.shiparoo.domain.interactors.SampleInteractor;
import com.niccorder.shiparoo.domain.interactors.base.AbstractInteractor;
import com.niccorder.shiparoo.domain.repository.Repository;

public class SampleInteractorImpl extends AbstractInteractor implements SampleInteractor {

    private SampleInteractor.Callback mCallback;
    private Repository mRepository;

    public SampleInteractorImpl(Executor threadExecutor, MainThread mainThread, Callback callback,
        Repository repository) {
        super(threadExecutor, mainThread);
        mCallback = callback;
        mRepository = repository;
    }

    @Override public void run() {
        // TODO: Implement this with your business logic
    }
}
