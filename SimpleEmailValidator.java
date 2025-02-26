import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;

public class SimpleEmailValidator {
    public static void main(String[] args) {
        String jsonString = "{ \"name\": \"Rohan\", \"email\": \"rohan@example.com\" }";
        String schemaString = "{ \"type\": \"object\", \"properties\": { \"email\": {\"type\": \"string\", \"format\": \"email\"} }, \"required\": [\"email\"] }";

        try {
            Schema schema = SchemaLoader.load(new JSONObject(schemaString));
            schema.validate(new JSONObject(jsonString));
            System.out.println("Valid Email");
        } catch (Exception e) {
            System.out.println("Invalid Email: " + e.getMessage());
        }
    }
}
