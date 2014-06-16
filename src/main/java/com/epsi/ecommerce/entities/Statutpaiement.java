package com.epsi.ecommerce.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class StatutPaiement
{
    @Id
    @Column(name = "ID")
    private int id;

    @Basic
    @Column(name = "LIBELLE")
    private String libelle;

    @OneToMany(mappedBy = "pk.statutPaiement", fetch = FetchType.LAZY)
    private List<CommandeStatutPaiement> commandeStatutPaiements;

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }

    public String getLibelle()
    {
        return libelle;
    }
    public void setLibelle(String libelle)
    {
        this.libelle = libelle;
    }

    public List<CommandeStatutPaiement> getCommandeStatutPaiements()
    {
        return commandeStatutPaiements;
    }
    public void setCommandeStatutPaiements(List<CommandeStatutPaiement> commandeStatutPaiements)
    {
        this.commandeStatutPaiements = commandeStatutPaiements;
    }
}
