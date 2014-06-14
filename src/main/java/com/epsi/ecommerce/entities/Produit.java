package com.epsi.ecommerce.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
public class Produit
{
    private int id;

    @Id
    @javax.persistence.Column(name = "ID")
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    private String reference;

    @Basic
    @javax.persistence.Column(name = "REFERENCE")
    public String getReference()
    {
        return reference;
    }

    public void setReference(String reference)
    {
        this.reference = reference;
    }

    private String libelle;

    @Basic
    @javax.persistence.Column(name = "LIBELLE")
    public String getLibelle()
    {
        return libelle;
    }

    public void setLibelle(String libelle)
    {
        this.libelle = libelle;
    }

    private BigDecimal prix;

    @Basic
    @javax.persistence.Column(name = "PRIX")
    public BigDecimal getPrix()
    {
        return prix;
    }

    public void setPrix(BigDecimal prix)
    {
        this.prix = prix;
    }

    private int stock;

    @Basic
    @javax.persistence.Column(name = "STOCK")
    public int getStock()
    {
        return stock;
    }

    public void setStock(int stock)
    {
        this.stock = stock;
    }

    private int refcategorie;

    @Basic
    @javax.persistence.Column(name = "REFCATEGORIE")
    public int getRefcategorie()
    {
        return refcategorie;
    }

    public void setRefcategorie(int refcategorie)
    {
        this.refcategorie = refcategorie;
    }

    private int reffournisseur;

    @Basic
    @javax.persistence.Column(name = "REFFOURNISSEUR")
    public int getReffournisseur()
    {
        return reffournisseur;
    }

    public void setReffournisseur(int reffournisseur)
    {
        this.reffournisseur = reffournisseur;
    }

    private BigInteger reftva;

    @Basic
    @javax.persistence.Column(name = "REFTVA")
    public BigInteger getReftva()
    {
        return reftva;
    }

    public void setReftva(BigInteger reftva)
    {
        this.reftva = reftva;
    }

    private int seuilstock;

    @Basic
    @javax.persistence.Column(name = "SEUILSTOCK")
    public int getSeuilstock()
    {
        return seuilstock;
    }

    public void setSeuilstock(int seuilstock)
    {
        this.seuilstock = seuilstock;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Produit produit = (Produit) o;

        if (id != produit.id) {
            return false;
        }
        if (refcategorie != produit.refcategorie) {
            return false;
        }
        if (reffournisseur != produit.reffournisseur) {
            return false;
        }
        if (seuilstock != produit.seuilstock) {
            return false;
        }
        if (stock != produit.stock) {
            return false;
        }
        if (libelle != null ? !libelle.equals(produit.libelle) : produit.libelle != null) {
            return false;
        }
        if (prix != null ? !prix.equals(produit.prix) : produit.prix != null) {
            return false;
        }
        if (reference != null ? !reference.equals(produit.reference) : produit.reference != null) {
            return false;
        }
        if (reftva != null ? !reftva.equals(produit.reftva) : produit.reftva != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = id;
        result = 31 * result + (reference != null ? reference.hashCode() : 0);
        result = 31 * result + (libelle != null ? libelle.hashCode() : 0);
        result = 31 * result + (prix != null ? prix.hashCode() : 0);
        result = 31 * result + stock;
        result = 31 * result + refcategorie;
        result = 31 * result + reffournisseur;
        result = 31 * result + (reftva != null ? reftva.hashCode() : 0);
        result = 31 * result + seuilstock;
        return result;
    }
}
