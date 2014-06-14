package com.epsi.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class CommandefournisseurProduitPK implements Serializable
{
    private int refcommandefournisseur;
    private int refproduit;

    @Column(name = "REFCOMMANDEFOURNISSEUR")
    @Id
    public int getRefcommandefournisseur()
    {
        return refcommandefournisseur;
    }

    public void setRefcommandefournisseur(int refcommandefournisseur)
    {
        this.refcommandefournisseur = refcommandefournisseur;
    }

    @Column(name = "REFPRODUIT")
    @Id
    public int getRefproduit()
    {
        return refproduit;
    }

    public void setRefproduit(int refproduit)
    {
        this.refproduit = refproduit;
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

        CommandefournisseurProduitPK that = (CommandefournisseurProduitPK) o;

        if (refcommandefournisseur != that.refcommandefournisseur) {
            return false;
        }
        if (refproduit != that.refproduit) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = refcommandefournisseur;
        result = 31 * result + refproduit;
        return result;
    }
}
