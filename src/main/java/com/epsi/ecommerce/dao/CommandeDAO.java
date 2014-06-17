package com.epsi.ecommerce.dao;

import com.epsi.ecommerce.entities.Commande;
import com.epsi.ecommerce.entities.dto.StatistiqueCommande;

import java.util.List;

public interface CommandeDAO
{
    public Commande create(Commande object);

    public Commande find(Integer key);
    public List<Commande> findAll();
    public List<StatistiqueCommande> findStatistics();

    public Commande update(Commande object);

    public void delete(Commande object);
}
