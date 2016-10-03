package com.niccorder.shiparoo.ui.adapters.model;

import android.support.annotation.LayoutRes;
import android.text.TextUtils;
import android.widget.ImageView;

import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import com.bumptech.glide.Glide;
import com.niccorder.shiparoo.R;

import butterknife.BindView;

public class ImageCardModel extends EpoxyModelWithHolder<ImageCardModel.ImageCardHolder> {

    @EpoxyAttribute
    String mId;
    @EpoxyAttribute
    String description;
    @EpoxyAttribute
    String mUrl;

    @Override
    protected ImageCardHolder createNewHolder() {
        return new ImageCardHolder();
    }

    @Override
    public EpoxyModel<ImageCardHolder> id(long id) {
        return super.id(TextUtils.isEmpty(mId) ? id : mId.hashCode());
    }

    @Override
    public EpoxyModel<ImageCardHolder> layout(@LayoutRes int layoutRes) {
        return super.layout(layoutRes);
    }

    @LayoutRes
    @Override
    protected int getDefaultLayout() {
        return R.layout.layout_card_image;
    }

    @Override
    public void bind(ImageCardHolder holder) {
        Glide.clear(holder.image);
        super.bind(holder);

        Glide.with(holder.image.getContext()).load(mUrl).fallback(R.drawable.ic_dratini).crossFade().into(holder.image);
    }

    static class ImageCardHolder extends BaseHolder {
        @BindView(R.id.image)
        ImageView image;
    }
}
