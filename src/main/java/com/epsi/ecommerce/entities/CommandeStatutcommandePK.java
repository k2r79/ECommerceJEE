package com.epsi.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigInteger;

public class CommandeStatutcommandePK implements Serializable
{
    private int refcommande;
    private BigInteger refstatutcommande;

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

    @Column(name = "REFSTATUTCOMMANDE")
    @Id
    public BigInteger getRefstatutcommande()
    {
        return refstatutcommande;
    }

    public void setRefstatutcommande(BigInteger refstatutcommande)
    {
        this.refstatutcommande = refstatutcommande;
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

        CommandeStatutcommandePK that = (CommandeStatutcommandePK) o;

        if (refcommande != that.refcommande) {
            return false;
        }
        if (refstatutcommande != null ? !refstatutcommande.equals(that.refstatutcommande) : that.refstatutcommande !=
                null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = refcommande;
        result = 31 * result + (refstatutcommande != null ? refstatutcommande.hashCode() : 0);
        return result;
    }
}
