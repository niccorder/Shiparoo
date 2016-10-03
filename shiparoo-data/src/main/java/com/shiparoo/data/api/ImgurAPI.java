package com.shiparoo.data.api;

import com.shiparoo.data.entity.GalleryAlbumEntity;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface ImgurAPI {
    @GET("gallery/{section}/{sort}/{page}")
    Observable<GalleryAlbumEntity> getGalleryPage(
            @Path("section") final String section,
            @Path("sort") final String sortBy,
            @Path("page") final Integer page);
}
