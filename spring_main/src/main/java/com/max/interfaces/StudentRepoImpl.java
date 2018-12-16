package com.max.interfaces;

import com.max.beans.Student;
import com.max.interfaces.StudentRepo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class StudentRepoImpl {//implements StudentRepo {
//
//    @PersistenceContext
//    EntityManager manager;
//
//    @Override
//    public void saveStudent(Student student) {
//        manager.persist(student);
//    }

//    @Override
//    public Student getById(int id) {
//        return (Student) manager.createQuery("select s from Student s where id = 2").getSingleResult();
//    }
}
