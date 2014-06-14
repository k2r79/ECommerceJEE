package com.epsi.ecommerce.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigInteger;

public class CommandeStatutpaiementPK implements Serializable
{
    private int refcommande;
    private BigInteger refstatutpaiement;

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

    @Column(name = "REFSTATUTPAIEMENT")
    @Id
    public BigInteger getRefstatutpaiement()
    {
        return refstatutpaiement;
    }

    public void setRefstatutpaiement(BigInteger refstatutpaiement)
    {
        this.refstatutpaiement = refstatutpaiement;
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

        CommandeStatutpaiementPK that = (CommandeStatutpaiementPK) o;

        if (refcommande != that.refcommande) {
            return false;
        }
        if (refstatutpaiement != null ? !refstatutpaiement.equals(that.refstatutpaiement) : that.refstatutpaiement !=
                null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = refcommande;
        result = 31 * result + (refstatutpaiement != null ? refstatutpaiement.hashCode() : 0);
        return result;
    }
}
