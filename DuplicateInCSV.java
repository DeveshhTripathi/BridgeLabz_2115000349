import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class DuplicateInCSV{
    public static void main(String[] args){
        String filePath = "data.csv";
        Map<String, String[]> recordMap = new HashMap<>();
        Set<String> duplicateIds = new HashSet<>();
        try(CSVReader reader = new CSVReader(new FileReader(filePath))){
            String[] nextLine;
            boolean firstLine = true;
            while((nextLine = reader.readNext()) != null){
                if(firstLine){
                    firstLine = false;
                    continue;
                }
                String id = nextLine[0];
                if(recordMap.containsKey(id)){
                    duplicateIds.add(id);
                }else{
                    recordMap.put(id, nextLine);
           }
        }
            if(duplicateIds.isEmpty()){
                System.out.println("No duplicate records found.");
            }else{
                System.out.println("Duplicate records found:");
                for(String id : duplicateIds){
                    System.out.println(Arrays.toString(recordMap.get(id)));
      }
   }
        }catch (IOException e){
            System.err.println("Error reading the CSV file: " + e.getMessage());
    }
  }
}
