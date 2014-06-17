package com.epsi.ecommerce.services.impl;

import com.epsi.ecommerce.dao.CommandeDAO;
import com.epsi.ecommerce.entities.Commande;
import com.epsi.ecommerce.entities.dto.StatistiqueCommande;
import com.epsi.ecommerce.services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service("CommandeService")
public class CommandeServiceImpl implements CommandeService
{
    @Autowired
    private CommandeDAO commandeDAO;

    @Override
    public List<Commande> getAll()
    {
        return commandeDAO.findAll();
    }

    @Override
    @ResponseBody
    public List<StatistiqueCommande> getStatistics()
    {
        return commandeDAO.findStatistics();
    }
}
