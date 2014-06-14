package com.epsi.ecommerce.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
public class Commande
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

    private Timestamp date;

    @Basic
    @javax.persistence.Column(name = "date")
    public Timestamp getDate()
    {
        return date;
    }

    public void setDate(Timestamp date)
    {
        this.date = date;
    }

    private BigDecimal prixtotal;

    @Basic
    @javax.persistence.Column(name = "PRIXTOTAL")
    public BigDecimal getPrixtotal()
    {
        return prixtotal;
    }

    public void setPrixtotal(BigDecimal prixtotal)
    {
        this.prixtotal = prixtotal;
    }

    private int refclient;

    @Basic
    @javax.persistence.Column(name = "REFCLIENT")
    public int getRefclient()
    {
        return refclient;
    }

    public void setRefclient(int refclient)
    {
        this.refclient = refclient;
    }

    private BigInteger refmoyenpaiement;

    @Basic
    @javax.persistence.Column(name = "REFMOYENPAIEMENT")
    public BigInteger getRefmoyenpaiement()
    {
        return refmoyenpaiement;
    }

    public void setRefmoyenpaiement(BigInteger refmoyenpaiement)
    {
        this.refmoyenpaiement = refmoyenpaiement;
    }

    private BigInteger refexpediteur;

    @Basic
    @javax.persistence.Column(name = "REFEXPEDITEUR")
    public BigInteger getRefexpediteur()
    {
        return refexpediteur;
    }

    public void setRefexpediteur(BigInteger refexpediteur)
    {
        this.refexpediteur = refexpediteur;
    }

    private int refadresselivraison;

    @Basic
    @javax.persistence.Column(name = "REFADRESSELIVRAISON")
    public int getRefadresselivraison()
    {
        return refadresselivraison;
    }

    public void setRefadresselivraison(int refadresselivraison)
    {
        this.refadresselivraison = refadresselivraison;
    }

    private int refadressefacturation;

    @Basic
    @javax.persistence.Column(name = "REFADRESSEFACTURATION")
    public int getRefadressefacturation()
    {
        return refadressefacturation;
    }

    public void setRefadressefacturation(int refadressefacturation)
    {
        this.refadressefacturation = refadressefacturation;
    }

    private String annulee;

    @Basic
    @javax.persistence.Column(name = "ANNULEE")
    public String getAnnulee()
    {
        return annulee;
    }

    public void setAnnulee(String annulee)
    {
        this.annulee = annulee;
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

        Commande commande = (Commande) o;

        if (id != commande.id) {
            return false;
        }
        if (refadressefacturation != commande.refadressefacturation) {
            return false;
        }
        if (refadresselivraison != commande.refadresselivraison) {
            return false;
        }
        if (refclient != commande.refclient) {
            return false;
        }
        if (annulee != null ? !annulee.equals(commande.annulee) : commande.annulee != null) {
            return false;
        }
        if (date != null ? !date.equals(commande.date) : commande.date != null) {
            return false;
        }
        if (prixtotal != null ? !prixtotal.equals(commande.prixtotal) : commande.prixtotal != null) {
            return false;
        }
        if (reference != null ? !reference.equals(commande.reference) : commande.reference != null) {
            return false;
        }
        if (refexpediteur != null ? !refexpediteur.equals(commande.refexpediteur) : commande.refexpediteur != null) {
            return false;
        }
        if (refmoyenpaiement != null ? !refmoyenpaiement.equals(commande.refmoyenpaiement) : commande
                .refmoyenpaiement != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = id;
        result = 31 * result + (reference != null ? reference.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (prixtotal != null ? prixtotal.hashCode() : 0);
        result = 31 * result + refclient;
        result = 31 * result + (refmoyenpaiement != null ? refmoyenpaiement.hashCode() : 0);
        result = 31 * result + (refexpediteur != null ? refexpediteur.hashCode() : 0);
        result = 31 * result + refadresselivraison;
        result = 31 * result + refadressefacturation;
        result = 31 * result + (annulee != null ? annulee.hashCode() : 0);
        return result;
    }
}
