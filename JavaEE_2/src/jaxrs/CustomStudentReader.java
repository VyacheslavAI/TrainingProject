package jaxrs;

import classes.Student;

import javax.ws.rs.Consumes;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Scanner;
import java.util.StringTokenizer;

@Provider
@Consumes("my/format")
public class CustomStudentReader implements MessageBodyReader<Student> {

    @Override
    public boolean isReadable(Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
        return Student.class.isAssignableFrom(aClass);
    }

    @Override
    public Student readFrom(Class<Student> aClass, Type type, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, String> multivaluedMap, InputStream inputStream) throws IOException, WebApplicationException {
        String string = convertStreamToString(inputStream);
        StringTokenizer tokenizer = new StringTokenizer(string, "/");
        Student student = new Student();
        student.setName(tokenizer.nextToken());
        student.setAge(tokenizer.nextToken());
        return student;
    }

    public String convertStreamToString(InputStream inputStream) {
        Scanner scanner = new Scanner(inputStream).useDelimiter("\\A");
        return scanner.hasNext() ? scanner.next() : "";
    }
}
