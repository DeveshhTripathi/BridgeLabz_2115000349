import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class MergeJSONFiles {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            
            JsonNode json1 = objectMapper.readTree(new File("file1.json"));
            JsonNode json2 = objectMapper.readTree(new File("file2.json"));

            JsonNode mergedJson = json1.deepMerge(json2);

            System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(mergedJson));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
