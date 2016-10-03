package com.niccorder.shiparoo.di.module;

import com.niccorder.shiparoo.di.PerActivity;
import com.niccorder.shiparoo.presenters.MainPresenter;
import com.niccorder.shiparoo.presenters.impl.MainPresenterImpl;
import com.shiparoo.domain.executor.MainThread;
import com.shiparoo.domain.executor.NetworkExecutor;
import com.shiparoo.domain.interactors.impl.GetHotImagesInteractor;
import com.shiparoo.domain.repository.ImageRepository;

import dagger.Module;
import dagger.Provides;

@Module
public class ImageModule {

    @Provides
    @PerActivity
    GetHotImagesInteractor hotImagesInteractor(ImageRepository repository, NetworkExecutor executor,
                                               MainThread mainThread) {
        return new GetHotImagesInteractor(executor, mainThread, repository);
    }

    @Provides
    @PerActivity
    MainPresenter provideMainPresenter(GetHotImagesInteractor interactor) {
        return new MainPresenterImpl(interactor);
    }
}
