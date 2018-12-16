package servlets;

import ee.Student;

import javax.annotation.Resource;
import javax.ejb.ApplicationException;
import javax.ejb.SessionContext;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
public class ExamplePersistBean {

    @PersistenceContext
    EntityManager manager;

    @Resource
    SessionContext sessionContext;

    public void saveStudent() throws Exception {
        manager.persist(new Student("Max"));
//        sessionContext.setRollbackOnly();
//        throw new RuntimeException();
//        throw new MyException();
        throw new Exception();
    }
}

@ApplicationException(rollback = true)
class MyException extends Exception {

}
