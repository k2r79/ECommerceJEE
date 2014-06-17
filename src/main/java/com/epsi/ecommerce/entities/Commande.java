package com.epsi.ecommerce.entities;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class Commande
{
    @Id
    @Column(name = "ID")
    private int id;

    @Basic
    @Column(name = "\"REFERENCE\"")
    private String reference;

    @Basic
    @Column(name = "\"date\"")
    private Timestamp date;

    @Basic
    @Column(name = "PRIXTOTAL")
    private BigDecimal prixTotal;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "REFCLIENT")
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REFMOYENPAIEMENT")
    private MoyenPaiement moyenPaiement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REFEXPEDITEUR")
    private Expediteur expediteur;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REFADRESSELIVRAISON")
    private Adresse adresseLivraison;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REFADRESSEFACTURATION")
    private Adresse adresseFacturation;

    @OneToMany(mappedBy = "pk.commande")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<CommandeStatutPaiement> commandeStatutPaiements;

    @OneToMany(mappedBy = "pk.commande", fetch = FetchType.EAGER)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<CommandeStatutCommande> commandeStatutCommandes;

    @Basic
    @Column(name = "ANNULEE")
    private String annulee;

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }

    public String getReference()
    {
        return reference;
    }
    public void setReference(String reference)
    {
        this.reference = reference;
    }

    public Timestamp getDate()
    {
        return date;
    }
    public void setDate(Timestamp date)
    {
        this.date = date;
    }

    public BigDecimal getPrixTotal()
    {
        return prixTotal;
    }
    public void setPrixTotal(BigDecimal prixTotal)
    {
        this.prixTotal = prixTotal;
    }

    public Client getClient()
    {
        return client;
    }
    public void setClient(Client client)
    {
        this.client = client;
    }

    public MoyenPaiement getMoyenPaiement()
    {
        return moyenPaiement;
    }
    public void setMoyenPaiement(MoyenPaiement moyenPaiement)
    {
        this.moyenPaiement = moyenPaiement;
    }

    public Expediteur getExpediteur()
    {
        return expediteur;
    }
    public void setExpediteur(Expediteur expediteur)
    {
        this.expediteur = expediteur;
    }

    public Adresse getAdresseLivraison()
    {
        return adresseLivraison;
    }
    public void setAdresseLivraison(Adresse adresseLivraison)
    {
        this.adresseLivraison = adresseLivraison;
    }

    public Adresse getAdresseFacturation()
    {
        return adresseFacturation;
    }
    public void setAdresseFacturation(Adresse adresseFacturation)
    {
        this.adresseFacturation = adresseFacturation;
    }

    public String getAnnulee()
    {
        return annulee;
    }
    public void setAnnulee(String annulee)
    {
        this.annulee = annulee;
    }

    public List<CommandeStatutPaiement> getCommandeStatutPaiements()
    {
        return commandeStatutPaiements;
    }
    public void setCommandeStatutPaiements(List<CommandeStatutPaiement> commandeStatutPaiements)
    {
        this.commandeStatutPaiements = commandeStatutPaiements;
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
