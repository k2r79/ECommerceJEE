package com.epsi.ecommerce.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
public class Expediteur
{
    private BigInteger id;
    private String libelle;
    private BigDecimal prix;

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
    @Column(name = "PRIX")
    public BigDecimal getPrix()
    {
        return prix;
    }

    public void setPrix(BigDecimal prix)
    {
        this.prix = prix;
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

        Expediteur that = (Expediteur) o;

        if (id != null ? !id.equals(that.id) : that.id != null) {
            return false;
        }
        if (libelle != null ? !libelle.equals(that.libelle) : that.libelle != null) {
            return false;
        }
        if (prix != null ? !prix.equals(that.prix) : that.prix != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (libelle != null ? libelle.hashCode() : 0);
        result = 31 * result + (prix != null ? prix.hashCode() : 0);
        return result;
    }
}
