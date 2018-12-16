import com.max.beans.User;
import com.max.test.interfaces.TestRepo;
import org.hibernate.SessionFactory;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.test.annotation.Commit;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.Properties;

@RunWith(SpringRunner.class)
@ContextConfiguration
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DbTest {

    @Autowired
    TestRepo testRepo;

    @Test
    @Transactional//rollback
    @Commit
//    @Rollback
    public void asaveUser() {
        testRepo.saveUser(new User("Slava"));
    }

    @Test
    @Transactional
    public void bfindUser() {
        User user = testRepo.findUser();
        System.out.println(user.getName());
    }


    @Configuration
    @ComponentScan("com.max.test")
    @EnableTransactionManagement
    static class DbConfig {
        @Bean
        public DataSource getDataSource() {
            DriverManagerDataSource dataSource = new DriverManagerDataSource();
            dataSource.setDriverClassName("com.mysql.jdbc.Driver");
            dataSource.setUrl("jdbc:mysql://localhost:3306/Testing?useLegacyDatetimeCode=false&serverTimezone=UTC");
            dataSource.setUsername("root");
            dataSource.setPassword("root");

            return dataSource;
        }

        @Bean
        public LocalSessionFactoryBean getSession(DataSource dataSource) {
            LocalSessionFactoryBean bean = new LocalSessionFactoryBean();
            bean.setDataSource(dataSource);
            bean.setPackagesToScan(new String[]{"com.max.beans"});
            Properties properties = new Properties();
            properties.put("hibernate.show_sql", "true");
            properties.put("hibernate.hbm2ddl.auto", "create-drop");
            properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");

            bean.setHibernateProperties(properties);
            return bean;
        }

        @Bean
        public HibernateTransactionManager getManager(SessionFactory sessionFactory) {
            HibernateTransactionManager manager = new HibernateTransactionManager();
            manager.setSessionFactory(sessionFactory);
            return manager;
        }
    }
}
