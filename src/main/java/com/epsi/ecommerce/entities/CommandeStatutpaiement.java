package com.epsi.ecommerce.entities;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Table(name = "COMMANDE_STATUTPAIEMENT", schema = "ECOMMERCE", catalog = "")
@IdClass(CommandeStatutpaiementPK.class)
public class CommandeStatutpaiement
{
    private int refcommande;
    private BigInteger refstatutpaiement;
    private Timestamp date;
    private String finpaiement;

    @Id
    @Column(name = "REFCOMMANDE")
    public int getRefcommande()
    {
        return refcommande;
    }

    public void setRefcommande(int refcommande)
    {
        this.refcommande = refcommande;
    }

    @Id
    @Column(name = "REFSTATUTPAIEMENT")
    public BigInteger getRefstatutpaiement()
    {
        return refstatutpaiement;
    }

    public void setRefstatutpaiement(BigInteger refstatutpaiement)
    {
        this.refstatutpaiement = refstatutpaiement;
    }

    @Basic
    @Column(name = "date")
    public Timestamp getDate()
    {
        return date;
    }

    public void setDate(Timestamp date)
    {
        this.date = date;
    }

    @Basic
    @Column(name = "FINPAIEMENT")
    public String getFinpaiement()
    {
        return finpaiement;
    }

    public void setFinpaiement(String finpaiement)
    {
        this.finpaiement = finpaiement;
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

        CommandeStatutpaiement that = (CommandeStatutpaiement) o;

        if (refcommande != that.refcommande) {
            return false;
        }
        if (date != null ? !date.equals(that.date) : that.date != null) {
            return false;
        }
        if (finpaiement != null ? !finpaiement.equals(that.finpaiement) : that.finpaiement != null) {
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
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (finpaiement != null ? finpaiement.hashCode() : 0);
        return result;
    }
}
