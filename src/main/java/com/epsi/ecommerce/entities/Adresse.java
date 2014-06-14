package com.epsi.ecommerce.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adresse
{
    private int id;

    @Id
    @javax.persistence.Column(name = "ID")
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    private String libelle;

    @Basic
    @javax.persistence.Column(name = "LIBELLE")
    public String getLibelle()
    {
        return libelle;
    }

    public void setLibelle(String libelle)
    {
        this.libelle = libelle;
    }

    private String nom;

    @Basic
    @javax.persistence.Column(name = "NOM")
    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    private String prenom;

    @Basic
    @javax.persistence.Column(name = "PRENOM")
    public String getPrenom()
    {
        return prenom;
    }

    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    private String adresse;

    @Basic
    @javax.persistence.Column(name = "ADRESSE")
    public String getAdresse()
    {
        return adresse;
    }

    public void setAdresse(String adresse)
    {
        this.adresse = adresse;
    }

    private String complement;

    @Basic
    @javax.persistence.Column(name = "COMPLEMENT")
    public String getComplement()
    {
        return complement;
    }

    public void setComplement(String complement)
    {
        this.complement = complement;
    }

    private String ville;

    @Basic
    @javax.persistence.Column(name = "VILLE")
    public String getVille()
    {
        return ville;
    }

    public void setVille(String ville)
    {
        this.ville = ville;
    }

    private String codepostal;

    @Basic
    @javax.persistence.Column(name = "CODEPOSTAL")
    public String getCodepostal()
    {
        return codepostal;
    }

    public void setCodepostal(String codepostal)
    {
        this.codepostal = codepostal;
    }

    private String pays;

    @Basic
    @javax.persistence.Column(name = "PAYS")
    public String getPays()
    {
        return pays;
    }

    public void setPays(String pays)
    {
        this.pays = pays;
    }

    private String commentaire;

    @Basic
    @javax.persistence.Column(name = "COMMENTAIRE")
    public String getCommentaire()
    {
        return commentaire;
    }

    public void setCommentaire(String commentaire)
    {
        this.commentaire = commentaire;
    }

    private Integer refclient;

    @Basic
    @javax.persistence.Column(name = "REFCLIENT")
    public Integer getRefclient()
    {
        return refclient;
    }

    public void setRefclient(Integer refclient)
    {
        this.refclient = refclient;
    }

    private Integer reffournisseur;

    @Basic
    @javax.persistence.Column(name = "REFFOURNISSEUR")
    public Integer getReffournisseur()
    {
        return reffournisseur;
    }

    public void setReffournisseur(Integer reffournisseur)
    {
        this.reffournisseur = reffournisseur;
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

        Adresse adresse1 = (Adresse) o;

        if (id != adresse1.id) {
            return false;
        }
        if (adresse != null ? !adresse.equals(adresse1.adresse) : adresse1.adresse != null) {
            return false;
        }
        if (codepostal != null ? !codepostal.equals(adresse1.codepostal) : adresse1.codepostal != null) {
            return false;
        }
        if (commentaire != null ? !commentaire.equals(adresse1.commentaire) : adresse1.commentaire != null) {
            return false;
        }
        if (complement != null ? !complement.equals(adresse1.complement) : adresse1.complement != null) {
            return false;
        }
        if (libelle != null ? !libelle.equals(adresse1.libelle) : adresse1.libelle != null) {
            return false;
        }
        if (nom != null ? !nom.equals(adresse1.nom) : adresse1.nom != null) {
            return false;
        }
        if (pays != null ? !pays.equals(adresse1.pays) : adresse1.pays != null) {
            return false;
        }
        if (prenom != null ? !prenom.equals(adresse1.prenom) : adresse1.prenom != null) {
            return false;
        }
        if (refclient != null ? !refclient.equals(adresse1.refclient) : adresse1.refclient != null) {
            return false;
        }
        if (reffournisseur != null ? !reffournisseur.equals(adresse1.reffournisseur) : adresse1.reffournisseur != null) {
            return false;
        }
        if (ville != null ? !ville.equals(adresse1.ville) : adresse1.ville != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = id;
        result = 31 * result + (libelle != null ? libelle.hashCode() : 0);
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (prenom != null ? prenom.hashCode() : 0);
        result = 31 * result + (adresse != null ? adresse.hashCode() : 0);
        result = 31 * result + (complement != null ? complement.hashCode() : 0);
        result = 31 * result + (ville != null ? ville.hashCode() : 0);
        result = 31 * result + (codepostal != null ? codepostal.hashCode() : 0);
        result = 31 * result + (pays != null ? pays.hashCode() : 0);
        result = 31 * result + (commentaire != null ? commentaire.hashCode() : 0);
        result = 31 * result + (refclient != null ? refclient.hashCode() : 0);
        result = 31 * result + (reffournisseur != null ? reffournisseur.hashCode() : 0);
        return result;
    }
}
