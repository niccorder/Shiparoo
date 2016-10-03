package com.niccorder.shiparoo.presenters;

import com.niccorder.shiparoo.presenters.base.BasePresenter;
import com.niccorder.shiparoo.ui.BaseView;
import com.shiparoo.domain.model.ImageModel;

import java.util.List;

public interface MainPresenter extends BasePresenter {

    void onRefresh();

    void onNextImagesRequested();

    void setView(View view);

    interface View extends BaseView {

        void onShowImages(List<ImageModel> images);
    }

}
