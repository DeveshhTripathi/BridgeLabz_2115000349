import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
public class WriteCSVFile{
    public static void main(String[] args){
        String filePath = "employees.csv";
        String[][] employees ={
                {"101", "Rohan", "HR", "58000"},
                {"102", "Rahul", "IT", "62000"},
                {"103", "Raju", "Finance", "55000"},
                {"104", "David", "Marketing", "50000"},
                {"105", "Raman", "Sales", "57500"}
        };
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))){
            writer.writeNext(new String[]{"ID", "Name", "Department", "Salary"});

            for(String[] employee : employees){
                writer.writeNext(employee);
    }
            System.out.println("CSV file created successfully!");
        }catch(IOException e){
            System.err.println("Error writing the CSV file: " + e.getMessage());
   }
  }
}
