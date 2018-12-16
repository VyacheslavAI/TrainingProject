package ee;

import javax.json.Json;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonParser;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

public class JsonStreamExample {

    public static void main(String[] args) throws IOException {
        StringWriter writer = getWriter();

        FileWriter fileWriter = new FileWriter("StudentAnswer.json");
        fileWriter.write(writer.toString());
        fileWriter.close();
//
//        StringReader reader = new StringReader(writer.toString());
//
//        Scanner scanner = new Scanner(new FileReader("StudentAnswer.json"));
//        while(scanner.hasNext())
//            System.out.println(scanner.next());
//
//        JsonParser stringParser = Json.createParser(reader);
        JsonParser fileParser = Json.createParser(new FileReader("StudentAnswer.json"));

        while (fileParser.hasNext()) {
            JsonParser.Event event = fileParser.next();

//            System.out.println(event);

            if (event.equals(JsonParser.Event.KEY_NAME)
                    || event.equals(JsonParser.Event.VALUE_NUMBER)
                    || event.equals(JsonParser.Event.VALUE_STRING))
                System.out.println(fileParser.getString());
        }
    }

    public static StringWriter getWriter() {
        StringWriter writer = new StringWriter();
        JsonGenerator generator = Json.createGenerator(writer);
        generator.writeStartObject()
                .writeStartObject("Student")
                .write("name", "Slava")
                .write("age", 25)
                .writeStartObject("address")
                .write("city", "New York")
                .write("street", "26")
                .writeEnd()
                .writeStartArray("exams")
                .write("math")
                .write("english")
                .write("chemistry")
                .writeEnd()
                .writeEnd()
                .writeEnd()
                .close();

        return writer;
    }
}
