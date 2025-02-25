import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
public class ReadLargeCSVFile{
    public static void main(String[] args){
        String filePath = "large_CSVdataFile.csv";
        int batchSize = 100;
        int totalRecords = 0;
        try(CSVReader reader = new CSVReader(new FileReader(filePath))){
            String[] nextLine;
            boolean firstLine = true;
            int batchCount = 0;
            while((nextLine = reader.readNext()) != null){
                if(firstLine){
                    firstLine = false;
                    continue;
                }
                totalRecords++;
                batchCount++;
                if(batchCount == batchSize){
                    System.out.println("Processed " + totalRecords + " records so far...");
                    batchCount = 0;
      }
   }
            System.out.println("Total records processed: " + totalRecords);
        } catch(IOException e){
            System.err.println("Error reading the CSV file: " + e.getMessage());
    }
  }
}
