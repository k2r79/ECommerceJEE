package com.epsi.ecommerce.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fournisseur
{
    private int id;
    private String nom;
    private int refadresse;

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
    @Column(name = "NOM")
    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    @Basic
    @Column(name = "REFADRESSE")
    public int getRefadresse()
    {
        return refadresse;
    }

    public void setRefadresse(int refadresse)
    {
        this.refadresse = refadresse;
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

        Fournisseur that = (Fournisseur) o;

        if (id != that.id) {
            return false;
        }
        if (refadresse != that.refadresse) {
            return false;
        }
        if (nom != null ? !nom.equals(that.nom) : that.nom != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = id;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + refadresse;
        return result;
    }
}
