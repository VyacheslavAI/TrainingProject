package jaxrs;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/helloRestService")
public class HelloWorld {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    public String sayHello() {
        throw new RuntimeException("qewr");
    }

    @POST
    @Produces("text/plain")
    public String delete() throws Exception {
        throw new Exception();
    }
}