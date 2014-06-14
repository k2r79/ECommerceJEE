package com.epsi.ecommerce.entities;

import com.epsi.ecommerce.utils.HibernateSessionUtil;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

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
    private BigInteger refcivilite;

    // REFCIVILITE
    private Timestamp datedenaissance;

    public void setId(int id)
    {
        this.id = id;
    }

    @Id
    @Column(name = "ID")
    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    @Basic
    @Column(name = "PSEUDO")
    public String getPseudo()
    {
        return pseudo;
    }

    public void setPseudo(String pseudo)
    {
        this.pseudo = pseudo;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    @Basic
    @Column(name = "NOM")
    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    @Basic
    @Column(name = "PRENOM")
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

    @Basic
    @Column(name = "REFCIVILITE")
    public BigInteger getRefcivilite()
    {
        return refcivilite;
    }

    public void setRefcivilite(BigInteger refcivilite)
    {
        this.refcivilite = refcivilite;
    }

    @Basic
    @Column(name = "DATEDENAISSANCE")
    public Timestamp getDatedenaissance()
    {
        return datedenaissance;
    }

    public void setDatedenaissance(Timestamp datedenaissance)
    {
        this.datedenaissance = datedenaissance;
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

        Client client = (Client) o;

        if (id != client.id) {
            return false;
        }
        if (datedenaissance != null ? !datedenaissance.equals(client.datedenaissance) : client.datedenaissance !=
                null) {
            return false;
        }
        if (email != null ? !email.equals(client.email) : client.email != null) {
            return false;
        }
        if (nom != null ? !nom.equals(client.nom) : client.nom != null) {
            return false;
        }
        if (prenom != null ? !prenom.equals(client.prenom) : client.prenom != null) {
            return false;
        }
        if (pseudo != null ? !pseudo.equals(client.pseudo) : client.pseudo != null) {
            return false;
        }
        if (refcivilite != null ? !refcivilite.equals(client.refcivilite) : client.refcivilite != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (pseudo != null ? pseudo.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (prenom != null ? prenom.hashCode() : 0);
        result = 31 * result + (refcivilite != null ? refcivilite.hashCode() : 0);
        result = 31 * result + (datedenaissance != null ? datedenaissance.hashCode() : 0);
        return result;
    }
}
