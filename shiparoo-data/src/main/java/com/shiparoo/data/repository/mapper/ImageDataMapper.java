package com.shiparoo.data.repository.mapper;

import com.shiparoo.data.entity.ImageEntity;
import com.shiparoo.domain.model.ImageModel;

import java.util.ArrayList;
import java.util.List;

public final class ImageDataMapper {
    private ImageDataMapper() {}

    public static ImageModel transform(ImageEntity imageEntity) {
        return new ImageModel()
                .withId(imageEntity.getId())
                .withId(imageEntity.getId())
                .withWidth(imageEntity.getWidth())
                .withHeight(imageEntity.getHeight())
                .withTitle(imageEntity.getTitle() == null ? (String) imageEntity.getTitle() : null)
                .withType(imageEntity.getType())
                .withAnimated(imageEntity.getAnimated());
    }

    public static List<ImageModel> transform(List<ImageEntity> imageEntities) {
        List<ImageModel> imageList = new ArrayList<>(30);
        for (int i = 0; i < imageEntities.size(); ++i)
            if (imageEntities.get(i) != null) imageList.add(transform(imageEntities.get(i)));

        return imageList;
    }
}
