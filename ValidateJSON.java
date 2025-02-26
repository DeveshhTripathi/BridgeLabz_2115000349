import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateJSON{
   public static void main(String[] args) {
       String json = "{ \"name\": \"Rohan\", \"email\": \"rohan@example.com\", \"age\": 30 }";

       if (isValidJSON(json)) {
           System.out.println("Valid JSON structure");
       } else {
           System.out.println("Invalid JSON structure");
       }
   }

   public static boolean isValidJSON(String json) {
       try {
           ObjectMapper objectMapper = new ObjectMapper();
           JsonNode jsonNode = objectMapper.readTree(json);
           return jsonNode != null;
       } catch (Exception e) {
           return false;
       }
   }
}
