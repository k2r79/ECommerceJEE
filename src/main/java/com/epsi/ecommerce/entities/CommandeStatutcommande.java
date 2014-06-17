package com.epsi.ecommerce.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "COMMANDE_STATUTCOMMANDE")
@AssociationOverrides({
        @AssociationOverride(name = "pk.commande", joinColumns = @JoinColumn(name = "REFCOMMANDE")),
        @AssociationOverride(name = "pk.statutCommande", joinColumns = @JoinColumn(name = "REFSTATUTCOMMANDE")) })
public class CommandeStatutCommande
{
    @EmbeddedId
    private CommandeStatutCommandePK pk = new CommandeStatutCommandePK();

    @Basic
    @Column(name = "\"date\"")
    private Timestamp date;

    @Basic
    @Column(name = "FINLIVRAISON")
    private String finlivraison;

    public CommandeStatutCommandePK getPk()
    {
        return pk;
    }
    public void setPk(CommandeStatutCommandePK pk)
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

    public String getFinlivraison()
    {
        return finlivraison;
    }
    public void setFinlivraison(String finlivraison)
    {
        this.finlivraison = finlivraison;
    }

    public Commande getCommande()
    {
        return pk.getCommande();
    }
    public void setCommande(Commande commande)
    {
        pk.setCommande(commande);
    }

    public StatutCommande getStatutCommande()
    {
        return pk.getStatutCommande();
    }
    public void setStatutCommande(StatutCommande statutCommande)
    {
        pk.setStatutCommande(statutCommande);
    }
}
