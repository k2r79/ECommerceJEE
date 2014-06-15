package com.epsi.ecommerce.dao;

import java.io.Serializable;
import java.util.List;

public interface Persistable<T, PK extends Serializable>
{
    public T create(T object);

    public T find(PK key);
    public List<T> findAll();

    public T update(T object);

    public void delete(T object);
}
