package servlets;

import ee.Bean;
import ee.Student;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/example")
public class ServletExample extends HttpServlet {

    @EJB
    Bean bean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        bean.saveStudent(new Student("MyWinStudentNumberTHREE"));
    }
}
