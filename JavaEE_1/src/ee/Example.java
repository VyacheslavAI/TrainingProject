package ee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Example {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("example");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();
        manager.persist(new Student("Max"));
        manager.persist(new Student("Slava"));
        manager.getTransaction().commit();

        manager.getTransaction().begin();
        manager.persist(new Student("newName"));
        manager.persist(new Student("something value"));


        manager.close();
        factory.close();
    }
}
