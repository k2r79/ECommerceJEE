package com.epsi.ecommerce.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class StatutCommande
{
    @Id
    @Column(name = "ID")
    private int id;

    @Basic
    @Column(name = "LIBELLE")
    private String libelle;

    @OneToMany(mappedBy = "pk.statutCommande", fetch = FetchType.LAZY)
    private List<CommandeStatutCommande> commandeStatutCommandes;

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

    public List<CommandeStatutCommande> getCommandeStatutCommandes()
    {
        return commandeStatutCommandes;
    }
    public void setCommandeStatutCommandes(List<CommandeStatutCommande> commandeStatutCommandes)
    {
        this.commandeStatutCommandes = commandeStatutCommandes;
    }
}
