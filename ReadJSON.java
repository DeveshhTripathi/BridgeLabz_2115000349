import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ReadJSON {
   public static void main(String[] args){
       try {
           ObjectMapper objectMapper = new ObjectMapper();
           JsonNode jsonNode = objectMapper.readTree(new File("C:\\Users\\deves\\IdeaProjects\\JsonMeven\\src\\main\\java\\data.json"));

           String name = jsonNode.get("name").asText();
           String email = jsonNode.get("email").asText();

           System.out.println("Name: " + name);
           System.out.println("Email: " + email);
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
}
