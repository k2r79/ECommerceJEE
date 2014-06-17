package com.epsi.ecommerce.services;

import com.epsi.ecommerce.entities.Commande;
import com.epsi.ecommerce.entities.dto.StatistiqueCommande;

import java.util.List;

public interface CommandeService
{
    public List<Commande> getAll();

    public List<StatistiqueCommande> getStatistics();
}
