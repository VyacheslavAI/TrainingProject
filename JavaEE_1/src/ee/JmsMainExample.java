package ee;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.broker.BrokerFactory;
import org.apache.activemq.broker.BrokerService;

import javax.jms.*;
import java.util.Date;

public class JmsMainExample {
    public static void main(String[] args) throws Exception {
        BrokerService brokerService = BrokerFactory.createBroker("broker:tcp://localhost:61616");
        brokerService.start();

        Connection connection = null;

        try {
            ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
            connection = connectionFactory.createConnection();

            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);


            Queue queue = session.createQueue("customerQueue");
//            Topic topic = session.createTopic("customerTopic");
            Message msg = session.createTextMessage("message was sent at: " + new Date());

            MessageProducer producer = session.createProducer(queue);
            MessageConsumer consumer = session.createConsumer(queue);

            connection.start();

            producer.send(msg);

            TextMessage textMessage = (TextMessage) consumer.receive();
            System.out.println(textMessage.getText());

            Thread.sleep(500);

            session.close();

        } finally {
            if (connection != null)
                connection.close();
                brokerService.stop();
        }

    }
}
