package ee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.SQLException;


public class MainExample {

    public static void main(String[] args) throws SQLException, InterruptedException {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("example");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();
        Student max = new Student("Jackson");
        manager.persist(max);
        manager.getTransaction().commit();

        manager.close();
        factory.close();
    }
}