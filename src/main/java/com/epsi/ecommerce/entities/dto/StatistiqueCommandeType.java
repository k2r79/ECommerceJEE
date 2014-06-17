package com.epsi.ecommerce.entities.dto;

import oracle.sql.STRUCT;
import oracle.sql.StructDescriptor;
import org.hibernate.HibernateException;
import org.hibernate.usertype.UserType;

import java.io.Serializable;
import java.sql.*;

public class StatistiqueCommandeType implements UserType
{
    @Override
    public int[] sqlTypes()
    {
        return new int[] { Types.STRUCT };
    }

    @Override
    public Class returnedClass()
    {
        return StatistiqueCommande.class;
    }

    @Override
    public boolean equals(Object o, Object o2) throws HibernateException
    {
        if (o == o2) {
            return true;
        }

        if (o == null || o2 == null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode(Object o) throws HibernateException
    {
        return 0;
    }

    @Override
    public Object nullSafeGet(ResultSet resultSet, String[] strings, Object o) throws HibernateException, SQLException
    {
        final Struct struct = (Struct) resultSet.getObject(strings[0]);

        if (resultSet.wasNull()) {
            return null;
        }

        final StatistiqueCommande stats = new StatistiqueCommande();

        stats.setNombreTotal((Integer) struct.getAttributes()[0]);
        stats.setNombreNonLivrees((Integer) struct.getAttributes()[1]);
        stats.setNombreImpayees((Integer) struct.getAttributes()[2]);

        return stats;
    }

    @Override
    public void nullSafeSet(PreparedStatement preparedStatement, Object o, int i) throws HibernateException, SQLException
    {
        if (o == null) {
            preparedStatement.setNull(i, Types.STRUCT, "T_COMMANDES_PERIODE");
        } else {
            final StatistiqueCommande stat = (StatistiqueCommande) o;
            final Object[] values = new Object[] {
                stat.getNombreTotal(),
                stat.getNombreNonLivrees(),
                stat.getNombreImpayees()
            };
            final Connection connection = preparedStatement.getConnection();
            final STRUCT struct = new STRUCT(StructDescriptor.createDescriptor("T_COMMANDES_PERIODE", connection), connection, values);

            preparedStatement.setObject(i, struct, Types.STRUCT);
        }
    }

    @Override
    public Object deepCopy(Object o) throws HibernateException
    {
        if (o == null) {
            return null;
        }

        final StatistiqueCommande stat = (StatistiqueCommande) o;
        final StatistiqueCommande clone = new StatistiqueCommande();

        clone.setNombreTotal(stat.getNombreTotal());
        clone.setNombreNonLivrees(stat.getNombreNonLivrees());
        clone.setNombreImpayees(stat.getNombreImpayees());

        return clone;
    }

    @Override
    public boolean isMutable()
    {
        return false;
    }

    @Override
    public Serializable disassemble(Object o) throws HibernateException
    {
        return null;
    }

    @Override
    public Object assemble(Serializable serializable, Object o) throws HibernateException
    {
        return null;
    }

    @Override
    public Object replace(Object o, Object o2, Object o3) throws HibernateException
    {
        return null;
    }
}
