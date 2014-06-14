package com.epsi.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class CommandeproduitPK implements Serializable
{
    private int refcommande;
    private int refproduit;

    @Column(name = "REFCOMMANDE")
    @Id
    public int getRefcommande()
    {
        return refcommande;
    }

    public void setRefcommande(int refcommande)
    {
        this.refcommande = refcommande;
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

        CommandeproduitPK that = (CommandeproduitPK) o;

        if (refcommande != that.refcommande) {
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
        int result = refcommande;
        result = 31 * result + refproduit;
        return result;
    }
}
