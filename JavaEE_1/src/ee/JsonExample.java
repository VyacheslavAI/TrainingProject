package ee;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonValue;
import java.io.IOException;
import java.util.List;

public class JsonExample {

    public static void main(String[] args) throws IOException {
        JsonObject object = new JsonExample().getJson();
        JsonObject student = object.getJsonObject("Student");
        System.out.println(student.getString("name"));
        System.out.println(student.getInt("age"));

        JsonObject address = student.getJsonObject("address");
        System.out.println(address.getString("city"));
        System.out.println(address.getString("street"));

        List<JsonValue> examsValues = student.getJsonArray("exams");

        for (JsonValue value : examsValues)
            System.out.println(value.toString());
    }

    public JsonObject getJson() {
        JsonObject object = Json.createObjectBuilder()
                .add("Student", Json.createObjectBuilder()
                        .add("name", "Slava")
                        .add("age", 22)
                        .add("address", Json.createObjectBuilder()
                                .add("city", "Moscow")
                                .add("street", "Lenina")
                        )
                        .add("exams", Json.createArrayBuilder()
                                .add("math")
                                .add("chemistry")
                                .add("english")
                        )
                ).build();

        return object;
    }
}