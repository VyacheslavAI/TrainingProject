import entities.hierarchie.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        try (SessionFactory factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
             Session session = factory.openSession()) {

            session.beginTransaction();
            NativeQuery nativeQuery = session.createNativeQuery("select * from Car", Car.class);
            List<Car> cars = nativeQuery.getResultList();
            for (Car car : cars) {
                System.out.println("id " + car.getId() + " number " + car.getNumber());
            }
            session.getTransaction().commit();
        }
    }
}
