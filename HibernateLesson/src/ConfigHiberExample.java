import entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConfigHiberExample {

    public static void main(String[] args) {
        Configuration configuration = new Configuration()
                .setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/Testing")
                .setProperty("hibernate.connection.username", "root")
                .setProperty("hibernate.connection.password", "root")
                .setProperty("hibernate.dialect", "org.hibernate.dialect.MariaDBDialect")
                .configure();

        try (SessionFactory factory = configuration.buildSessionFactory();
             Session session = factory.openSession()) {
            session.beginTransaction();
            session.save(new Student("Slava"));
            session.getTransaction().commit();
        }
    }
}
