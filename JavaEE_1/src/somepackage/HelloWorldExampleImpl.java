package somepackage;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class HelloWorldExampleImpl {

    public String sayHello() {
        return "Hello World";
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost/sayHelloWorld", new HelloWorldExampleImpl());
    }
}
