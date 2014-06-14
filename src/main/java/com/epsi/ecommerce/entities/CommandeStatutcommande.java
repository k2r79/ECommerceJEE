package com.epsi.ecommerce.entities;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Table(name = "COMMANDE_STATUTCOMMANDE", schema = "ECOMMERCE", catalog = "")
@IdClass(CommandeStatutcommandePK.class)
public class CommandeStatutcommande
{
    private int refcommande;
    private BigInteger refstatutcommande;
    private Timestamp date;
    private String finlivraison;

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
    @Column(name = "REFSTATUTCOMMANDE")
    public BigInteger getRefstatutcommande()
    {
        return refstatutcommande;
    }

    public void setRefstatutcommande(BigInteger refstatutcommande)
    {
        this.refstatutcommande = refstatutcommande;
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
    @Column(name = "FINLIVRAISON")
    public String getFinlivraison()
    {
        return finlivraison;
    }

    public void setFinlivraison(String finlivraison)
    {
        this.finlivraison = finlivraison;
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

        CommandeStatutcommande that = (CommandeStatutcommande) o;

        if (refcommande != that.refcommande) {
            return false;
        }
        if (date != null ? !date.equals(that.date) : that.date != null) {
            return false;
        }
        if (finlivraison != null ? !finlivraison.equals(that.finlivraison) : that.finlivraison != null) {
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
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (finlivraison != null ? finlivraison.hashCode() : 0);
        return result;
    }
}
