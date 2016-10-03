package com.shiparoo.domain.repository;

import com.shiparoo.domain.model.ImageModel;

import java.util.List;

import rx.Observable;

public interface ImageRepository {

    Observable<List<ImageModel>> getHomepageImages(final int pageIndex);
}
