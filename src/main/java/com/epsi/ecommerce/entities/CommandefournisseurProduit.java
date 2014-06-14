package com.epsi.ecommerce.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "COMMANDEFOURNISSEUR_PRODUIT", schema = "ECOMMERCE", catalog = "")
@IdClass(CommandefournisseurProduitPK.class)
public class CommandefournisseurProduit
{
    private int refcommandefournisseur;
    private int refproduit;
    private int quantite;
    private BigDecimal prix;
    private BigDecimal tva;

    @Id
    @Column(name = "REFCOMMANDEFOURNISSEUR")
    public int getRefcommandefournisseur()
    {
        return refcommandefournisseur;
    }

    public void setRefcommandefournisseur(int refcommandefournisseur)
    {
        this.refcommandefournisseur = refcommandefournisseur;
    }

    @Id
    @Column(name = "REFPRODUIT")
    public int getRefproduit()
    {
        return refproduit;
    }

    public void setRefproduit(int refproduit)
    {
        this.refproduit = refproduit;
    }

    @Basic
    @Column(name = "QUANTITE")
    public int getQuantite()
    {
        return quantite;
    }

    public void setQuantite(int quantite)
    {
        this.quantite = quantite;
    }

    @Basic
    @Column(name = "PRIX")
    public BigDecimal getPrix()
    {
        return prix;
    }

    public void setPrix(BigDecimal prix)
    {
        this.prix = prix;
    }

    @Basic
    @Column(name = "TVA")
    public BigDecimal getTva()
    {
        return tva;
    }

    public void setTva(BigDecimal tva)
    {
        this.tva = tva;
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

        CommandefournisseurProduit that = (CommandefournisseurProduit) o;

        if (quantite != that.quantite) {
            return false;
        }
        if (refcommandefournisseur != that.refcommandefournisseur) {
            return false;
        }
        if (refproduit != that.refproduit) {
            return false;
        }
        if (prix != null ? !prix.equals(that.prix) : that.prix != null) {
            return false;
        }
        if (tva != null ? !tva.equals(that.tva) : that.tva != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = refcommandefournisseur;
        result = 31 * result + refproduit;
        result = 31 * result + quantite;
        result = 31 * result + (prix != null ? prix.hashCode() : 0);
        result = 31 * result + (tva != null ? tva.hashCode() : 0);
        return result;
    }
}
