package servlets;

import ee.ManagedTransactionBean;
import ee.Student;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.*;
import java.io.IOException;

@WebServlet("/beanManagedServlet")
public class BeanManagedServletLesson extends HttpServlet {

    @PersistenceContext
    EntityManager manager;

    @Resource
    UserTransaction transaction;

    @EJB
    ManagedTransactionBean bean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        bean.saveStudent();
    }
}
