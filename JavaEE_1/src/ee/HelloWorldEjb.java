package ee;

import javax.ejb.Stateless;

@Stateless
//@Stateful
//@Singleton
public class HelloWorldEjb {

    public String sayHello() {
        return "Hello, World!";
    }
}
