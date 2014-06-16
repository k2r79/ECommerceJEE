package com.epsi.ecommerce.entities;

import javax.persistence.ManyToOne;
import java.io.Serializable;

public class CommandeStatutPaiementPK implements Serializable
{
    @ManyToOne
    private Commande commande;

    @ManyToOne
    private StatutPaiement statutPaiement;

    public Commande getCommande()
    {
        return commande;
    }
    public void setCommande(Commande commande)
    {
        this.commande = commande;
    }

    public StatutPaiement getStatutPaiement()
    {
        return statutPaiement;
    }
    public void setStatutPaiement(StatutPaiement statutPaiement)
    {
        this.statutPaiement = statutPaiement;
    }
}
