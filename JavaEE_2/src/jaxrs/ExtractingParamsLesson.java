package jaxrs;

import javax.ws.rs.*;

@Path("/extract")
@Produces("text/plain")
public class ExtractingParamsLesson {

    @GET
    @Path("/{id}")
    public String returnId(@PathParam("id") String id) {
        return id;
    }

    @GET
    @Path("/id/{id}")
    public String returnById(@PathParam("id") String id) {
        return "id value is " + id;
    }

    @GET
    @Path("/userName/{name: [a-zA-Z]*}")
    public String returnName(@PathParam("name") String name) {
        return "name value is " + name;
    }

    @GET
    @Path("/sessionID")
    public String returnSessionID(@DefaultValue("null") @CookieParam("sessionID") String id) {
        return id;
    }

    @GET
    @Path("/age/")
    public String returnAge(@QueryParam("age") int age) {
        return "user old is " + age;
    }

    @GET
    @Path("/city/")
    public String returnCity(@DefaultValue("Moscow") @MatrixParam("city") String city) {
        return "user city is " + city;
    }

    @GET
    @Path("/userAgent")
    public String returnAgent(@HeaderParam("User-Agent") String agent) {
        return agent;
    }

    @POST
    @Path("/form")
    public String returnText(@FormParam("test") String test) {
        return "test value is " + test;
    }
}
