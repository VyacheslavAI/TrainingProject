package websockets;

import javax.websocket.Endpoint;
import javax.websocket.EndpointConfig;
import javax.websocket.MessageHandler;
import javax.websocket.Session;
import java.io.IOException;

public class WebSocketExampleService extends Endpoint {

    @Override
    public void onOpen(Session session, EndpointConfig endpointConfig) {
        session.addMessageHandler(new MessageHandler.Whole<String>() {
            @Override
            public void onMessage(String s) {
                System.out.println(s);
                try {
                    session.getBasicRemote().sendText("You've send text: " + s);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
