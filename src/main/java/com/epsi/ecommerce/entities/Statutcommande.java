package com.epsi.ecommerce.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

@Entity
public class Statutcommande
{
    private BigInteger id;
    private String libelle;

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

    @Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Statutcommande that = (Statutcommande) o;

        if (id != null ? !id.equals(that.id) : that.id != null) {
            return false;
        }
        if (libelle != null ? !libelle.equals(that.libelle) : that.libelle != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (libelle != null ? libelle.hashCode() : 0);
        return result;
    }
}
