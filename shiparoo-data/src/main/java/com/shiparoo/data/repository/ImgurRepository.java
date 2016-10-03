package com.shiparoo.data.repository;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.shiparoo.data.api.ImgurAPI;
import com.shiparoo.data.entity.Imgur;
import com.shiparoo.data.exception.NoNetworkException;
import com.shiparoo.data.repository.mapper.ImageDataMapper;
import com.shiparoo.domain.model.ImageModel;
import com.shiparoo.domain.repository.ImageRepository;

import java.util.List;

import javax.inject.Inject;

import rx.Observable;

public class ImgurRepository implements ImageRepository {

    private Context  mContext;
    private ImgurAPI mApi;

    @Inject
    public ImgurRepository(Context context, ImgurAPI api) {
        this.mContext = context;
        this.mApi = api;
    }

    @Override
    public Observable<List<ImageModel>> getHomepageImages(int pageIndex) {
        return Observable.create(subscriber -> {
            if (!isThereInternetConnection()) {
                subscriber.onError(new NoNetworkException(mContext));
                return;
            }

            try {
                mApi.getGalleryPage(Imgur.Section.HOT.toString(), Imgur.Sort.TOP.toString(), pageIndex)
                    .doOnNext(galleryAlbum -> {
                        if (!galleryAlbum.getSuccess()) {
                            //TODO
                            subscriber.onError(new NetworkErrorException());
                            return;
                        }

                        subscriber.onNext(ImageDataMapper.transform(galleryAlbum.getData().getImages()));
                    })
                    .doOnError(subscriber::onError);
            } catch (Throwable t) {
                subscriber.onError(t);
            }
        });
    }

    private boolean isThereInternetConnection() {
        boolean isConnected;

        ConnectivityManager connectivityManager =
                (ConnectivityManager) mContext.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        isConnected = (networkInfo != null && networkInfo.isConnectedOrConnecting());

        return isConnected;
    }
}
