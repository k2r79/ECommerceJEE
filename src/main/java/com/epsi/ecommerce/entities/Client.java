package com.epsi.ecommerce.entities;

import com.epsi.ecommerce.utils.HibernateSessionUtil;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="CLIENT")
public class Client extends HibernateSessionUtil
{
    @Id
    @Column(name="ID")
    @GeneratedValue
    private long id;

    @Column(name="PSEUDO")
    private String pseudo;

    @Column(name="EMAIL")
    private String email;

    @Column(name="NOM")
    private String nom;

    @Column(name="PRENOM")
    private String prenom;

    @Column(name="DATEDENAISSANCE")
    @Temporal(TemporalType.DATE)
    private Date dateDeNaissance;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "REFCIVILITE")
    private Civilite civilite;

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    private List<Commande> commandes;

    public long getId()
    {
        return id;
    }
    public void setId(long id)
    {
        this.id = id;
    }

    public String getPseudo()
    {
        return pseudo;
    }
    public void setPseudo(String pseudo)
    {
        this.pseudo = pseudo;
    }

    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getNom()
    {
        return nom;
    }
    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getPrenom()
    {
        return prenom;
    }
    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    public Date getDateDeNaissance()
    {
        return dateDeNaissance;
    }
    public void setDateDeNaissance(Date dateDeNaissance)
    {
        this.dateDeNaissance = dateDeNaissance;
    }

    public Civilite getCivilite()
    {
        return civilite;
    }
    public void setCivilite(Civilite civilite)
    {
        this.civilite = civilite;
    }

    public List<Commande> getCommandes()
    {
        return commandes;
    }
    public void setCommandes(List<Commande> commandes)
    {
        this.commandes = commandes;
    }

    public String getNomComplet()
    {
        return prenom + " " + nom;
    }
}
