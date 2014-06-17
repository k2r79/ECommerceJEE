package com.epsi.ecommerce.entities.dto;

public class StatistiqueCommande
{
    private int nombreTotal;
    private int nombreNonLivrees;
    private int nombreImpayees;

    public int getNombreTotal()
    {
        return nombreTotal;
    }
    public void setNombreTotal(int nombreTotal)
    {
        this.nombreTotal = nombreTotal;
    }

    public int getNombreNonLivrees()
    {
        return nombreNonLivrees;
    }
    public void setNombreNonLivrees(int nombreNonLivrees)
    {
        this.nombreNonLivrees = nombreNonLivrees;
    }

    public int getNombreImpayees()
    {
        return nombreImpayees;
    }
    public void setNombreImpayees(int nombreImpayees)
    {
        this.nombreImpayees = nombreImpayees;
    }
}
