import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class ConvertJsonToXml {
    public static void main(String[] args) {
        String json = "{ \"name\": \"Rohan\", \"age\": 26, \"email\": \"rohan@example.com\" }";

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(json);

            XmlMapper xmlMapper = new XmlMapper();
            String xml = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);

            System.out.println(xml);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
