import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class UpdateCSV{
    public static void main(String[] args){
        String inputFile = "employees.csv";
        String outputFile = "updated_employees.csv";

        List<String[]> updatedRecords = new ArrayList<>();

        try(CSVReader reader = new CSVReader(new FileReader(inputFile))){
            String[] nextLine;
            boolean firstLine = true;
            while((nextLine = reader.readNext()) != null){
                if(firstLine){
                    firstLine = false;
                    updatedRecords.add(nextLine)
                    continue;
                }
                String department = nextLine[2];
                double salary = Double.parseDouble(nextLine[3]);

                if(department.equalsIgnoreCase("IT")){
                    salary *= 1.10;
                    nextLine[3] = String.format("%.2f", salary);
        }
                updatedRecords.add(nextLine);
   }
        }catch(IOException e){
            System.err.println("Error reading the CSV file: " + e.getMessage());
            return;
        }
        try(CSVWriter writer = new CSVWriter(new FileWriter(outputFile))){
            writer.writeAll(updatedRecords);
            System.out.println("Updated CSV file saved as: " + outputFile);
        }catch (IOException e){
            System.err.println("Error writing to the CSV file: " + e.getMessage());
   }
  }
}
