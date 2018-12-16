package websockets;

import javax.websocket.*;
import java.io.IOException;
import java.net.URI;

@ClientEndpoint(decoders = MyMessageDecoder.class, encoders = MyMessageEncoder.class)
public class MyClient {

    @OnOpen
    public void onOpen() {
        System.out.println("client connection is open");
    }

    @OnMessage
    public void onMessage(Session session, String message) throws IOException {
        System.out.println(message);
    }

    @OnError
    public void onError(Session session, Throwable t) {
        t.printStackTrace();
    }

    @OnClose
    public void onClose() {
        System.out.println("client connection is closed");
    }

    public static void main(String[] args) throws IOException, DeploymentException, InterruptedException, EncodeException {
        WebSocketContainer webSocketContainer = ContainerProvider.getWebSocketContainer();
        Session session = webSocketContainer.connectToServer(MyClient.class, URI.create("ws://localhost:8080/messageWebSocket/HelloSlava"));
        session.getBasicRemote().sendObject(new MyMessage("hello Max"));
        Thread.sleep(100);
        session.close();
    }
}
