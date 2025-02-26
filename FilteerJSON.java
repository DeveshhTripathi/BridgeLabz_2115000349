import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

public class FilteerJSON {
   public static void main(String[] args) {
       String json = "[{\"name\": \"Rohan\", \"age\": 22}, " +
               "{\"name\": \"Amit\", \"age\": 28}, " +
               "{\"name\": \"Priyam\", \"age\": 30}, " +
               "{\"name\": \"Suresh\", \"age\": 24}]";

       try {
           ObjectMapper objectMapper = new ObjectMapper();
           JsonNode jsonArray = objectMapper.readTree(json);

           List<JsonNode> filteredRecords = new ArrayList<>();

           for (JsonNode node : jsonArray) {
               if (node.get("age").asInt() > 25) {
                   filteredRecords.add(node);
               }
           }

           String filteredJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(filteredRecords);
           System.out.println("Filtered JSON:\n" + filteredJson);

       } catch (Exception e) {
           e.printStackTrace();
       }
   }
}
