package com.epsi.ecommerce.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Configuration
{
    private int id;
    private String cle;
    private String valeur;

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
    @Column(name = "CLE")
    public String getCle()
    {
        return cle;
    }

    public void setCle(String cle)
    {
        this.cle = cle;
    }

    @Basic
    @Column(name = "VALEUR")
    public String getValeur()
    {
        return valeur;
    }

    public void setValeur(String valeur)
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

        Configuration that = (Configuration) o;

        if (id != that.id) {
            return false;
        }
        if (cle != null ? !cle.equals(that.cle) : that.cle != null) {
            return false;
        }
        if (valeur != null ? !valeur.equals(that.valeur) : that.valeur != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = id;
        result = 31 * result + (cle != null ? cle.hashCode() : 0);
        result = 31 * result + (valeur != null ? valeur.hashCode() : 0);
        return result;
    }
}
