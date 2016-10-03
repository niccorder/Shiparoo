package com.niccorder.shiparoo.ui.adapters;

import android.content.Context;

import com.airbnb.epoxy.EpoxyAdapter;
import com.airbnb.epoxy.EpoxyModel;
import com.shiparoo.domain.model.ImageModel;

import java.util.Collection;
import java.util.List;

import timber.log.Timber;

public class ImageAdapter extends EpoxyAdapter {

    private Context mContext;

    public ImageAdapter(Context context) {
        super();
        mContext = context;

        hasStableIds();
        enableDiffing();
    }

    public void addImages(List<ImageModel> images) {
        Timber.i("addingImages: %d", images.size());

//        ImageCardModel model = new ImageCardModel_(mContext);
    }

    @Override
    protected void addModel(EpoxyModel<?> modelToAdd) {
        super.addModel(modelToAdd);
    }

    @Override
    protected void addModels(EpoxyModel<?>... modelsToAdd) {
        super.addModels(modelsToAdd);
    }

    @Override
    protected void addModels(Collection<? extends EpoxyModel<?>> modelsToAdd) {
        super.addModels(modelsToAdd);
    }
}
