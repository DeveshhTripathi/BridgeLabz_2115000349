import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
public class CountCSVRows{
    public static void main(String[] args){
        String filePath = "employees.csv";
        int recordCount = 0;
        try(CSVReader reader = new CSVReader(new FileReader(filePath))){
          List<String[]> records = reader.readAll();
            if(!records.isEmpty()){
             recordCount = records.size() - 1;
         }
            System.out.println("Total records without including Header : " + recordCount);
        } catch (IOException e){
            System.err.println("Error reading the CSV file: " + e.getMessage());
   }
 }
}
