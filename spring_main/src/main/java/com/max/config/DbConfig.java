package com.max.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jndi.JndiObjectFactoryBean;

import javax.sql.DataSource;

@Configuration
@ComponentScan
@Import(MyHibernateConfig.class)
//@Import(MyJpaConfig.class)
//@EnableJpaRepositories(value = "com.max.interfaces", repositoryImplementationPostfix = "Impl")
public class DbConfig {


//    @Bean
//    public JndiObjectFactoryBean getDataSource() {
//        JndiObjectFactoryBean dataSource = new JndiObjectFactoryBean();
//        dataSource.setJndiName("jdbc/testDB");
//        dataSource.setResourceRef(true);
//        dataSource.setProxyInterface(DataSource.class);
//        return dataSource;
//    }


//    @Bean
//    public BasicDataSource getDataSource() {
//        BasicDataSource dataSource = new BasicDataSource();
//        dataSource.setDriverClassName("org.h2.Driver");
//        dataSource.setUrl("jdbc:h2:~/test");
//        dataSource.setUsername("sa");
//        dataSource.setPassword("");
//        dataSource.setInitialSize(5);
//        dataSource.setMaxActive(10);
//
//        return dataSource;
//    }

//    @Bean
//    public DriverManagerDataSource getDataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("org.h2.Driver");
//        dataSource.setUrl("jdbc:h2:~/test");
//        dataSource.setUsername("sa");
//        dataSource.setPassword("");
//        return dataSource;
//    }

//    @Bean
//    public NamedParameterJdbcTemplate namedParameterJdbcTemplate(DataSource dataSource) {
//        return new NamedParameterJdbcTemplate(dataSource);
//    }


    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/Testing?useLegacyDatetimeCode=false&serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        return dataSource;
    }

//    @Bean
//    public DataSource getDataSource() {
//        return new EmbeddedDatabaseBuilder()
//                .setType(EmbeddedDatabaseType.H2)
//                .addScript("classpath:myScript.sql")
//                .build();
//    }

//    @Bean
//    public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }
}
