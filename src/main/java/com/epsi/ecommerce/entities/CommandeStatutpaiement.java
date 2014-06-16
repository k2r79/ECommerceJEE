package com.epsi.ecommerce.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "COMMANDE_STATUTPAIEMENT")
@AssociationOverrides({
    @AssociationOverride(name = "pk.commande", joinColumns = @JoinColumn(name = "REFCOMMANDE")),
    @AssociationOverride(name = "pk.statutPaiement", joinColumns = @JoinColumn(name = "REFSTATUTPAIEMENT")) })
public class CommandeStatutPaiement
{
    @EmbeddedId
    private CommandeStatutPaiementPK pk = new CommandeStatutPaiementPK();

    @Basic
    @Column(name = "\"date\"")
    private Timestamp date;

    @Basic
    @Column(name = "FINPAIEMENT")
    private String finPaiement;

    public CommandeStatutPaiementPK getPk()
    {
        return pk;
    }
    public void setPk(CommandeStatutPaiementPK pk)
    {
        this.pk = pk;
    }

    public Timestamp getDate()
    {
        return date;
    }
    public void setDate(Timestamp date)
    {
        this.date = date;
    }

    public String getFinPaiement()
    {
        return finPaiement;
    }
    public void setFinPaiement(String finPaiement)
    {
        this.finPaiement = finPaiement;
    }

    public Commande getCommande()
    {
        return pk.getCommande();
    }
    public void setCommande(Commande commande)
    {
        pk.setCommande(commande);
    }

    public StatutPaiement getStatutPaiement()
    {
        return pk.getStatutPaiement();
    }
    public void setStatutPaiement(StatutPaiement statutPaiement)
    {
        pk.setStatutPaiement(statutPaiement);
    }
}
