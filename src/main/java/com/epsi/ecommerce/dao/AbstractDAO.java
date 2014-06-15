package com.epsi.ecommerce.dao;

import com.epsi.ecommerce.commons.HibernateSessionUtils;

import java.io.Serializable;
import java.util.List;

public abstract class AbstractDAO<T, PK extends Serializable> extends HibernateSessionUtils implements Persistable<T, PK>
{
    private Class TClass;

    protected AbstractDAO(Class<T> TClass)
    {
        this.TClass = TClass;
    }

    @Override
    public T create(T object)
    {
        return null;
    }

    @Override
    public T find(PK key)
    {
        return null;
    }

    @Override
    public List<T> findAll()
    {
        return (List<T>) getHibernateTemplate().find("FROM " + TClass.getCanonicalName());
    }

    @Override
    public T update(T object)
    {
        return null;
    }

    @Override
    public void delete(T object)
    {

    }
}
