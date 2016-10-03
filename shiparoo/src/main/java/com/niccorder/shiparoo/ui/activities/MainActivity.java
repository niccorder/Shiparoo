package com.niccorder.shiparoo.ui.activities;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.niccorder.shiparoo.R;
import com.niccorder.shiparoo.di.HasComponent;
import com.niccorder.shiparoo.di.component.DaggerImageComponent;
import com.niccorder.shiparoo.di.component.ImageComponent;
import com.niccorder.shiparoo.di.module.ImageModule;
import com.niccorder.shiparoo.presenters.MainPresenter;
import com.niccorder.shiparoo.ui.adapters.ImageAdapter;
import com.shiparoo.domain.model.ImageModel;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import timber.log.Timber;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

public class MainActivity extends BaseActivity implements HasComponent<ImageComponent>, MainPresenter.View {


    @Inject
    MainPresenter     mPresenter;
    @BindView(R.id.progress)
    View              mProgress;
    @BindView(R.id.root)
    CoordinatorLayout mRoot;
    @BindView(R.id.toolbar)
    Toolbar           mToolbar;
    @BindView(R.id.recycler)
    RecyclerView      mRecycler;

    private ImageComponent mComponent;
    private ImageAdapter   mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        injectMembers();
        initialize();
    }

    private void injectMembers() {
        this.mComponent = DaggerImageComponent
                .builder()
                .applicationComponent(getApplicationComponent())
                .activityModule(getActivityModule())
                .imageModule(getImageModule())
                .build();
        mComponent.inject(this);
    }

    @Override
    public ImageComponent getComponent() {
        return this.mComponent;
    }

    public ImageModule getImageModule() {
        return new ImageModule();
    }

    public void initialize() {
        mPresenter.setView(this);

        setSupportActionBar(mToolbar);
        mRecycler.setAdapter(mAdapter);
    }


    @Override
    protected void onResume() {
        super.onResume();
        mPresenter.resume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mPresenter.pause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mPresenter.stop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.destroy();
    }

    @Override
    public void showProgress() {
        mProgress.setVisibility(VISIBLE);
    }

    @Override
    public void hideProgress() {
        mProgress.setVisibility(GONE);
    }

    @Override
    public void showError(Throwable throwable) {
        Timber.w(throwable);

        Snackbar.make(mRoot, throwable.getLocalizedMessage(), Snackbar.LENGTH_INDEFINITE).show();
    }

    @Override
    public void onShowImages(List<ImageModel> images) {
        Timber.i("onShowImages: " + images.size());

        mAdapter.addImages(images);
    }
}
