package jaxrs;

import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.net.URISyntaxException;

public class RestClient {

    public static void main(String[] args) throws URISyntaxException {
        Client client = ClientBuilder.newClient();
        URI uri = new URI("http://localhost:8080/helloRestService");
        WebTarget target = client.target(uri);
        Invocation invocation = target.path("hello").resolveTemplate("hello", "1").queryParam("one", "two").matrixParam("three", "four").request(MediaType.TEXT_PLAIN).buildPost(Entity.text("hohoho"));
        Response response = invocation.invoke();

        if (response.getStatusInfo().getStatusCode() == Response.Status.OK.getStatusCode()) {
            System.out.println(response.readEntity(String.class));
        }

        System.out.println(ClientBuilder.newClient().target(uri).request().get(String.class));
    }
}
