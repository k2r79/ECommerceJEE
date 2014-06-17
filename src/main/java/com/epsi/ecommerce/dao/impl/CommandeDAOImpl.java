package com.epsi.ecommerce.dao.impl;

import com.epsi.ecommerce.dao.AbstractDAO;
import com.epsi.ecommerce.dao.CommandeDAO;
import com.epsi.ecommerce.entities.Commande;
import com.epsi.ecommerce.entities.dto.StatistiqueCommande;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository("CommandeDAO")
public class CommandeDAOImpl extends AbstractDAO<Commande, Integer> implements CommandeDAO
{
    protected CommandeDAOImpl()
    {
        super(Commande.class);
    }

    @Override
    public List<StatistiqueCommande> findStatistics()
    {
        Date parsedDateDebut = null;
        try {
            parsedDateDebut = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2013");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        final Date dateDebut = parsedDateDebut;
        final Date dateFin = new Date();
        List<Object[]> results = (List<Object[]>) getHibernateTemplate().execute(new HibernateCallback()
        {
           @Override
           public List<Object[]> doInHibernate(org.hibernate.Session session) throws HibernateException, SQLException
           {
               Query query = session.createSQLQuery("SELECT * FROM TABLE(SELECT COMMANDE_PACKAGE.nombreCommandesPeriode(TO_DATE(:dateDebut, 'yyyy-MM-dd'), TO_DATE(:dateFin, 'yyyy-MM-dd')) FROM DUAL)")
                       .setDate("dateDebut", dateDebut)
                       .setDate("dateFin", dateFin);

               return query.list();
           }
        });

        List<StatistiqueCommande> statistiquesCommandes = new ArrayList<StatistiqueCommande>();
        for (Object[] result : results) {
            StatistiqueCommande statistiqueCommande = new StatistiqueCommande();
            statistiqueCommande.setNombreTotal((Integer) result[0]);
            statistiqueCommande.setNombreNonLivrees((Integer) result[1]);
            statistiqueCommande.setNombreImpayees((Integer) result[2]);

            statistiquesCommandes.add(statistiqueCommande);
        }

        return statistiquesCommandes;
    }
}