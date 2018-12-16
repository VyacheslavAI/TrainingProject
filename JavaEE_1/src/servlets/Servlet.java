package servlets;

import ee.TempEjb;

import javax.ejb.EJB;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/hello")
public class Servlet extends HttpServlet {

    @EJB
    TempEjb tempEjb;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write(tempEjb.getName());
    }

    public static void main(String[] args) {

        Map<String, Object> properties = new HashMap<>();

            try (EJBContainer container = EJBContainer.createEJBContainer()) {
            TempEjb tempEjb = (TempEjb) container.getContext().lookup("java:global/TempEjb");
            System.out.println(tempEjb.getName());
        } catch(NamingException e) {
            e.printStackTrace();
        }
    }
}
