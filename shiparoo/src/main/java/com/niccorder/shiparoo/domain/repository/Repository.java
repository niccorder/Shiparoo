package com.niccorder.shiparoo.domain.repository;

import com.niccorder.shiparoo.domain.model.SampleModel;

public interface Repository {

    boolean insert(SampleModel model);

    boolean update(SampleModel model);

    SampleModel get(Object id);

    boolean delete(SampleModel model);
}
