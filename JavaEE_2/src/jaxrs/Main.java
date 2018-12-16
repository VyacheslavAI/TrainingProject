package jaxrs;

import javax.ws.rs.core.UriBuilder;

public class Main {

    public static void main(String[] args) {
        System.out.println(UriBuilder.fromUri("http://localhost:8080")
                .path("asdf")
                .path("qwer")
                .queryParam("one", "two")
                .matrixParam("three", "four")

                .toTemplate());
    }
}
