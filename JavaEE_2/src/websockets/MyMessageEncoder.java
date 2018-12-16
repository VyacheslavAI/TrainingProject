package websockets;

import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

public class MyMessageEncoder implements Encoder.Text<MyMessage> {

    @Override
    public String encode(MyMessage message) {
        return message.getMessage();
    }

    @Override
    public void init(EndpointConfig config) {

    }

    @Override
    public void destroy() {

    }
}
