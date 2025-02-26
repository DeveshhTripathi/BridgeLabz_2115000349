import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJSON {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            String json1 = "{ \"name\": \"Rohan\", \"email\": \"rohan@example.com\" }";
            JsonNode node1 = objectMapper.readTree(json1);

            String json2 = "{ \"age\": 30, \"city\": \"Mathura\" }";
            JsonNode node2 = objectMapper.readTree(json2);

            ObjectNode mergedNode = objectMapper.createObjectNode();
            mergedNode.setAll((ObjectNode) node1);
            mergedNode.setAll((ObjectNode) node2);

            String mergedJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(mergedNode);
            System.out.println("Merged JSON:\n" + mergedJson);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
