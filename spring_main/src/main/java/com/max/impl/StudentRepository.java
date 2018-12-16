package com.max.impl;

import com.max.beans.Student;
import com.max.interfaces.StudentRepo;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//@Repository
@Transactional
public class StudentRepository {//implements StudentRepo {



//    @Autowired
//    SessionFactory sessionFactory;
//
//    @Override
//    public void saveStudent(Student student) {
//        sessionFactory.getCurrentSession().save(student);
//    }
}
