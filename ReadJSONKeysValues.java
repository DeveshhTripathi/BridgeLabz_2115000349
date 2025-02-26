import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.Iterator;
import java.util.Map;

public class ReadJSONKeysValues {
    public static void main(String[] args) {
        try {
            File file = new File("data.json");

            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(file);

            printKeysAndValues(jsonNode);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printKeysAndValues(JsonNode jsonNode) {
        Iterator<Map.Entry<String, JsonNode>> fields = jsonNode.fields();
        while (fields.hasNext()) {
            Map.Entry<String, JsonNode> field = fields.next();
            System.out.println("Key: " + field.getKey() + ", Value: " + field.getValue());
        }
    }
}
