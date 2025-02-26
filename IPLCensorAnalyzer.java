Import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IPLCensorAnalyzer{
    public static void main(String[] args) throws Exception{
        processJson("ipl_data.json", "ipl_censored.json");
        processCsv("ipl_data.csv", "ipl_censored.csv");
    }

    public static void processJson(String inputFile, String outputFile) throws Exception{
        ObjectMapper objectMapper = new ObjectMapper();
        List<Map<String, Object>> matches = objectMapper.readValue(new File(inputFile),
                TypeFactory.defaultInstance().constructCollectionType(List.class, Map.class));

        List<Map<String, Object>> censoredMatches = matches.stream().map(IPLCensorAnalyzer::censorData).collect(Collectors.toList());

        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputFile), censoredMatches);
    }

    public static void processCsv(String inputFile, String outputFile) throws Exception {
        CsvMapper csvMapper = new CsvMapper();
        CsvSchema schema = CsvSchema.emptySchema().withHeader();
        List<Map<String, String>> records = csvMapper.readerFor(Map.class).with(schema).readValues(new File(inputFile)).readAll();

        List<Map<String, String>> censoredRecords = records.stream().map(IPLCensorAnalyzer::censorDataCsv).collect(Collectors.toList());

        CsvSchema outputSchema = schema.withColumnSeparator(',');
        csvMapper.writer(outputSchema.withHeader()).writeValue(new File(outputFile), censoredRecords);
    }

    public static Map<String, Object> censorData(Map<String, Object> match) {
        match.put("team1", maskTeamName((String) match.get("team1")));
        match.put("team2", maskTeamName((String) match.get("team2")));
        match.put("winner", maskTeamName((String) match.get("winner")));
        match.put("player_of_match", "REDACTED");
        return match;
    }

    public static Map<String, String> censorDataCsv(Map<String, String> match) {
        match.put("team1", maskTeamName(match.get("team1")));
        match.put("team2", maskTeamName(match.get("team2")));
        match.put("winner", maskTeamName(match.get("winner")));
        match.put("player_of_match", "REDACTED");
        return match;
    }

    public static String maskTeamName(String teamName) {
        int index = teamName.indexOf(" ");
        return (index != -1) ? teamName.substring(0, index) + " ***" : teamName;
    }
}
