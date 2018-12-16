package websockets;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@ServerEndpoint(value = "/messageWebSocket/{param}", encoders = MyMessageEncoder.class, decoders = MyMessageDecoder.class)
public class MessageWebSocket {

    @OnOpen
    public void onOpen() {
        System.out.println("server connection is open");
    }

    @OnMessage
    public void onMessage(Session session, String message, @PathParam("param") String param) throws IOException {
        session.getBasicRemote().sendText(param);
    }


    @OnError
    public void onError(Session session, Throwable t) {
        t.printStackTrace();
    }

    @OnClose
    public void onClose() {
        System.out.println("server connection is closed");
    }
}
