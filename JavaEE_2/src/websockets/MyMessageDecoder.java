package websockets;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

public class MyMessageDecoder implements Decoder.Text<MyMessage> {

    @Override
    public MyMessage decode(String message) throws DecodeException {
        return new MyMessage(message);
    }

    @Override
    public boolean willDecode(String message) {
        return true;
    }

    @Override
    public void init(EndpointConfig config) {

    }

    @Override
    public void destroy() {

    }
}
