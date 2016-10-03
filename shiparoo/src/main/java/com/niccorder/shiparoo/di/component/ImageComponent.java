package com.niccorder.shiparoo.di.component;

import com.niccorder.shiparoo.di.PerActivity;
import com.niccorder.shiparoo.di.module.ActivityModule;
import com.niccorder.shiparoo.di.module.ImageModule;
import com.niccorder.shiparoo.presenters.MainPresenter;
import com.niccorder.shiparoo.ui.activities.MainActivity;
import com.shiparoo.domain.interactors.impl.GetHotImagesInteractor;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = {ActivityModule.class, ImageModule.class})
public interface ImageComponent extends ActivityComponent {
    void inject(MainActivity activity);

    GetHotImagesInteractor getHotImagesInteractor();
    MainPresenter mainPresenter();
}
