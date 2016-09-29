package com.niccorder.shiparoo.presentation.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;
import com.niccorder.shiparoo.R;
import com.niccorder.shiparoo.presentation.presenters.MainPresenter.View;

public class MainActivity extends AppCompatActivity implements View {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @Override public void showProgress() {

    }

    @Override public void hideProgress() {

    }

    @Override public void showError(String message) {

    }
}
