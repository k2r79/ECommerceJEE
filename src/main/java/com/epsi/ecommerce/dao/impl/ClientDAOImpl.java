package com.epsi.ecommerce.dao.impl;

import com.epsi.ecommerce.dao.AbstractDAO;
import com.epsi.ecommerce.dao.ClientDAO;
import com.epsi.ecommerce.entities.Client;
import org.springframework.stereotype.Repository;

@Repository("ClientDAO")
public class ClientDAOImpl extends AbstractDAO<Client, Integer> implements ClientDAO
{
    protected ClientDAOImpl()
    {
        super(Client.class);
    }
}
