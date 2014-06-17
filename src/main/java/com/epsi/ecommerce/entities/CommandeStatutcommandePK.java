package com.epsi.ecommerce.entities;

import javax.persistence.ManyToOne;
import java.io.Serializable;

public class CommandeStatutCommandePK implements Serializable
{
    @ManyToOne
    private Commande commande;

    @ManyToOne
    private StatutCommande statutCommande;

    public Commande getCommande()
    {
        return commande;
    }
    public void setCommande(Commande commande)
    {
        this.commande = commande;
    }

    public StatutCommande getStatutCommande()
    {
        return statutCommande;
    }
    public void setStatutCommande(StatutCommande statutCommande)
    {
        this.statutCommande = statutCommande;
    }
}
