package jaxrs;

import classes.Student;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/entityProvider")
public class EntityProviderLesson {

    @GET
    @Produces("my/format")
    public Student getCustomStudent() {
        return new Student("Max", "22");
    }

    @POST
    @Path("/getName")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes("my/format")
    public String getCustomStudent(Student student) {
        return student.getName();
    }
}
