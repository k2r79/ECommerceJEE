package com.epsi.ecommerce.dao;

import com.epsi.ecommerce.entities.Client;

import java.util.List;

public interface ClientDAO
{
    public Client create(Client object);

    public Client find(Integer key);
    public List<Client> findAll();

    public Client update(Client object);

    public void delete(Client object);
}
