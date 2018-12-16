package com.max.test.impl;

import com.max.beans.User;
import com.max.test.interfaces.TestRepo;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;

//@Repository
public class TestRepoImpl {//implements TestRepo {

//    @Autowired
//    SessionFactory sessionFactory;

//    @Override
//    public void saveUser(User user) {
//        sessionFactory.getCurrentSession().save(user);
//    }
//
//    @Override
//    public User findUser() {
//        TypedQuery<User> query = sessionFactory.getCurrentSession()
//                .createQuery("from User", User.class);
//        return query.getSingleResult();
//    }
}
