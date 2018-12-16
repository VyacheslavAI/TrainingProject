package jaxw;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class CallHelloWorldExample {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/sayHelloWorld");
        QName qName = new QName("http://jaxw/", "HelloWorldExampleImplService");
        Service service = Service.create(url, qName);
        HelloWorldExample port = service.getPort(HelloWorldExample.class);
        System.out.println(port.sayHello());
    }
}
