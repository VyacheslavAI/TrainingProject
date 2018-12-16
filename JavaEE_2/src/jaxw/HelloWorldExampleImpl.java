package jaxw;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.WebServiceContext;

@WebService(endpointInterface = "jaxw.HelloWorldExample", serviceName = "sayHello")
@SOAPBinding(style = SOAPBinding.Style.RPC, use = SOAPBinding.Use.LITERAL)
public class HelloWorldExampleImpl {

    @Resource
    WebServiceContext context;

    public String sayHello() {
        return "Hello World";
    }

    @WebMethod(exclude = true)
    public String doJob() {
        return "Hello World";
    }

}
