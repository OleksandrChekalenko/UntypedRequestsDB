package com.test.bu.dao;

import com.test.bu.dao.interfaces.RequestsDao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class RequestsDaoImpl implements RequestsDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List firstQuery() {
        return entityManager.createQuery("SELECT o.name, r.price, r.count, op.name, op.id FROM Requests r, Offers o, Operators op\n" +
                " WHERE  r.count>'2'  and  (op.id = '10' or op.id = '12')", Object[].class)
                .getResultList();
    }


    @Override
    public List secondQuery() {
        return entityManager.createQuery("SELECT o.name, r.count, r.price from Offers o, Requests r GROUP BY r.price, r.count, o.name",
                Object[].class).getResultList();
    }
}
