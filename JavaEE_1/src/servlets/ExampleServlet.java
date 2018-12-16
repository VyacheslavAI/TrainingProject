package servlets;

import ee.Student;

import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import java.io.IOException;

@WebServlet("/exampleJtaServlet")
public class ExampleServlet extends HttpServlet {

    @Inject
    StudentDb studentDb;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            studentDb.saveStudent();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}



class SomeStudent {
    String name;
}




@RequestScoped
@Transactional(value = Transactional.TxType.REQUIRED, rollbackOn = {MyException.class}, dontRollbackOn = {RuntimeException.class})
class StudentDb {

    @PersistenceContext
    EntityManager manager;

    public void saveStudent() throws MyException {
        manager.persist(new Student("Our"));
        throw new RuntimeException();
    }
}