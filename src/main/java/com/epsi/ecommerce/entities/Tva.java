package com.epsi.ecommerce.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
public class Tva
{
    private BigInteger id;
    private String libelle;
    private BigDecimal valeur;

    @Id
    @Column(name = "ID")
    public BigInteger getId()
    {
        return id;
    }

    public void setId(BigInteger id)
    {
        this.id = id;
    }

    @Basic
    @Column(name = "LIBELLE")
    public String getLibelle()
    {
        return libelle;
    }

    public void setLibelle(String libelle)
    {
        this.libelle = libelle;
    }

    @Basic
    @Column(name = "VALEUR")
    public BigDecimal getValeur()
    {
        return valeur;
    }

    public void setValeur(BigDecimal valeur)
    {
        this.valeur = valeur;
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

        Tva tva = (Tva) o;

        if (id != null ? !id.equals(tva.id) : tva.id != null) {
            return false;
        }
        if (libelle != null ? !libelle.equals(tva.libelle) : tva.libelle != null) {
            return false;
        }
        if (valeur != null ? !valeur.equals(tva.valeur) : tva.valeur != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (libelle != null ? libelle.hashCode() : 0);
        result = 31 * result + (valeur != null ? valeur.hashCode() : 0);
        return result;
    }
}
