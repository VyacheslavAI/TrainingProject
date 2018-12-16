package com.max.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(basePackages = {"com.max.interfaces"}, repositoryImplementationPostfix = "Impl")
public class MyJpaConfig {

//    @Bean("entityManagerFactory")
//    public LocalEntityManagerFactoryBean getEMFactory() {
//        LocalEntityManagerFactoryBean bean = new LocalEntityManagerFactoryBean();
//        bean.setPersistenceUnitName("localJpa");
//        return bean;
//    }
//
//    @Bean("transactionManager")
//    public JpaTransactionManager jpaTransactionManager() {
//        return new JpaTransactionManager();
//    }
}
