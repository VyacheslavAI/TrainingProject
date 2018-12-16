package ee;

import javax.annotation.Resource;
import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.*;


@MessageDriven(mappedName = "MyNewQueue")
@JMSConnectionFactoryDefinition(interfaceName = "javax.jms.ConnectionFactory", name = "MyNewFactory")
//@JMSDestinationDefinition(interfaceName = "javax.jms.Queue", name = "MyNewQueue")
public class MessageDrivenBean implements MessageListener {

    @Inject
    @JMSConnectionFactory("MyNewFactory")
    JMSContext context;

    @Resource(name = "MyNewQueue")
    Queue queue;

    @Override
    public void onMessage(Message message) {
        try {
            System.out.println(message.getBody(String.class));
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
