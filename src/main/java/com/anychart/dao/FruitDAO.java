package com.anychart.dao;

import com.anychart.models.Fruit;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by igor on 9/27/16.
 */
@Component
public class FruitDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    public List<Fruit> getFruits(int count) {
        return sessionFactory.getCurrentSession().createCriteria(Fruit.class).addOrder(Order.desc("value")).setMaxResults(count).list();
    }
}
