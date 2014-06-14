package com.epsi.ecommerce.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categorie
{
    private int id;
    private String libelle;
    private Integer refparent;

    @Id
    @Column(name = "ID")
    public int getId()
    {
        return id;
    }

    public void setId(int id)
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
    @Column(name = "REFPARENT")
    public Integer getRefparent()
    {
        return refparent;
    }

    public void setRefparent(Integer refparent)
    {
        this.refparent = refparent;
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

        Categorie categorie = (Categorie) o;

        if (id != categorie.id) {
            return false;
        }
        if (libelle != null ? !libelle.equals(categorie.libelle) : categorie.libelle != null) {
            return false;
        }
        if (refparent != null ? !refparent.equals(categorie.refparent) : categorie.refparent != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = id;
        result = 31 * result + (libelle != null ? libelle.hashCode() : 0);
        result = 31 * result + (refparent != null ? refparent.hashCode() : 0);
        return result;
    }
}
