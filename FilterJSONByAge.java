import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

public class FilterJSONByAge {
    public static void main(String[] args) {
        String json = "[{\"name\": \"Rohan\", \"age\": 26}, " +
                      "{\"name\": \"Amit\", \"age\": 24}, " +
                      "{\"name\": \"Priyam\", \"age\": 29}, " +
                      "{\"name\": \"Suresh\", \"age\": 22}]";

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonArray = objectMapper.readTree(json);

            List<JsonNode> filteredUsers = new ArrayList<>();

            for (JsonNode user : jsonArray) {
                if (user.get("age").asInt() > 25) {
                    filteredUsers.add(user);
                }
            }

            String filteredJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(filteredUsers);
            System.out.println("Filtered JSON:\n" + filteredJson);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
