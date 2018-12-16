package servlets;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.io.IOException;
import java.util.Set;

@WebServlet("/spec")
public class SpecialLesson extends HttpServlet {

    @Inject
    Validator validator;

    @Inject
    Person person;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        person.name = null;
        person.age = 1;

        Set<ConstraintViolation<Person>> set = validator.validate(person);
        for (ConstraintViolation<Person> violation : set) {
            System.out.println(violation.getMessage());
            System.out.println(violation.getInvalidValue());
        }
    }
}

class Person {

    String name;
    int age;
}