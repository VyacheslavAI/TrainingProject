package ee;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
public class ExampleBean {

    @PersistenceContext
    EntityManager manager;

    public void saveStudent() {
        manager.persist(new Student("max"));
    }
}

