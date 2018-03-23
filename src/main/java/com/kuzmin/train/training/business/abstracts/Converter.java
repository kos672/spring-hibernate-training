package com.kuzmin.train.training.business.abstracts;

public abstract class Converter<E, D> {
    public abstract D convert(E entity);
}
