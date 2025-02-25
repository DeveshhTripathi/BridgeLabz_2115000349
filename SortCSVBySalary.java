import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class SortCSVBySalary{
    public static void main(String[] args){
        String filePath = "employees.csv";
        List<String[]> records = new ArrayList<>();

        try(CSVReader reader = new CSVReader(new FileReader(filePath))){
            String[] nextLine;
            boolean firstLine = true;
            String[] header = null;

            while((nextLine = reader.readNext()) != null){
                if(firstLine){
                    firstLine = false;
                    header = nextLine;
                    continue;
                }
                records.add(nextLine);
   }
        }catch(IOException e){
            System.err.println("Error reading the CSV file: " + e.getMessage());
            return;
  }
        records.sort((a, b) -> Double.compare(Double.parseDouble(b[3]), Double.parseDouble(a[3])));

        System.out.println("Top 5 Highest Paid Employees:");
        System.out.println(Arrays.toString(new String[]{"ID", "Name", "Department", "Salary"}));
        for (int i = 0; i < Math.min(5, records.size()); i++) {
            System.out.println(Arrays.toString(records.get(i)));
    }
 }
}
