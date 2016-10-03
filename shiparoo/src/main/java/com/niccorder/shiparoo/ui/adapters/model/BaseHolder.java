package com.niccorder.shiparoo.ui.adapters.model;

import android.support.annotation.CallSuper;
import android.view.View;

import com.airbnb.epoxy.EpoxyHolder;

import butterknife.ButterKnife;

public class BaseHolder extends EpoxyHolder {
    @CallSuper
    @Override
    protected void bindView(View itemView) {
        ButterKnife.bind(itemView);
    }
}
