package com.epsi.ecommerce.dao.impl;

import com.epsi.ecommerce.dao.AbstractDAO;
import com.epsi.ecommerce.dao.CommandeDAO;
import com.epsi.ecommerce.entities.Commande;
import org.springframework.stereotype.Repository;

@Repository("CommandeDAO")
public class CommandeDAOImpl extends AbstractDAO<Commande, Integer> implements CommandeDAO
{
    protected CommandeDAOImpl()
    {
        super(Commande.class);
    }
}