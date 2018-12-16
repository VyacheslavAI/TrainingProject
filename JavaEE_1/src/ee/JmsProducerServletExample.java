package ee;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.jms.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;


@WebServlet("/jmsproducer")
public class JmsProducerServletExample extends HttpServlet {

    @Resource(name = "MyNewQueue")
    Queue queue;

    @Inject
    @JMSConnectionFactory("MyNewFactory")
    JMSContext context;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        context.createProducer().send(queue, "Message was sent at: " + new Date());
    }
}