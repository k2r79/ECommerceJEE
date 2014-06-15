package com.epsi.ecommerce.services.impl;

import com.epsi.ecommerce.dao.ClientDAO;
import com.epsi.ecommerce.entities.Client;
import com.epsi.ecommerce.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ClientService")
public class ClientServiceImpl implements ClientService
{
    @Autowired
    private ClientDAO clientDAO;

    @Override
    public List<Client> getAll()
    {
        return clientDAO.findAll();
    }
}
