package websockets;

import javax.websocket.Endpoint;
import javax.websocket.server.ServerApplicationConfig;
import javax.websocket.server.ServerEndpointConfig;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CustomServletAppConfigProvider {//implements ServerApplicationConfig {
//
//    @Override
//    public Set<ServerEndpointConfig> getEndpointConfigs(Set<Class<? extends Endpoint>> set) {
//
//        Set<ServerEndpointConfig> result = new HashSet<>();
//
//        for (Class aClass : set) {
//            if (aClass.equals(WebSocketExampleService.class)) {
//                result.add(ServerEndpointConfig.Builder.create(WebSocketExampleService.class, "/echoMessage").build());
//            }
//        }
//
//        return result;
//    }
//
//    @Override
//    public Set<Class<?>> getAnnotatedEndpointClasses(Set<Class<?>> set) {
//        return Collections.emptySet();
//    }
}
