package com.epsi.ecommerce.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
public class Commandefournisseur
{
    private int id;
    private int reffournisseur;
    private Timestamp date;
    private BigDecimal prixtotal;

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
    @Column(name = "REFFOURNISSEUR")
    public int getReffournisseur()
    {
        return reffournisseur;
    }

    public void setReffournisseur(int reffournisseur)
    {
        this.reffournisseur = reffournisseur;
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
    @Column(name = "PRIXTOTAL")
    public BigDecimal getPrixtotal()
    {
        return prixtotal;
    }

    public void setPrixtotal(BigDecimal prixtotal)
    {
        this.prixtotal = prixtotal;
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

        Commandefournisseur that = (Commandefournisseur) o;

        if (id != that.id) {
            return false;
        }
        if (reffournisseur != that.reffournisseur) {
            return false;
        }
        if (date != null ? !date.equals(that.date) : that.date != null) {
            return false;
        }
        if (prixtotal != null ? !prixtotal.equals(that.prixtotal) : that.prixtotal != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = id;
        result = 31 * result + reffournisseur;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (prixtotal != null ? prixtotal.hashCode() : 0);
        return result;
    }
}
