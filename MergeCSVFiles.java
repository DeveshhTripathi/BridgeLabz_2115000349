import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.*;
import java.util.*;
public class MergeCSVFiles{
    public static void main(String[] args){
        String file1 = "students1.csv";
        String file2 = "students2.csv";
        String outputFile = "merged_students.csv";
        Map<String, String[]> studentData = new HashMap<>();
        try(CSVReader reader1 = new CSVReader(new FileReader(file1))){
            String[] nextLine;
            boolean firstLine=true;

            while((nextLine = reader1.readNext()) != null){
                if(firstLine){
                    firstLine = false;
                    continue;
            }
                studentData.put(nextLine[0], nextLine); 
         }
      }catch (IOException e){
            System.err.println("Error reading file 1: " + e.getMessage());
        }
        try(CSVReader reader2 = new CSVReader(new FileReader(file2))){
            String[] nextLine;
            boolean firstLine = true;
            while((nextLine = reader2.readNext()) != null){
                if(firstLine){
                    firstLine = false;
                    continue;
                }
                if(studentData.containsKey(nextLine[0])){
                    String[] student = studentData.get(nextLine[0]);
                    studentData.put(nextLine[0], new String[]{student[0], student[1], student[2], nextLine[1], nextLine[2]});
          }
        }
        }catch(IOException e){
            System.err.println("Error reading file 2: " + e.getMessage());
        }
        try(CSVWriter writer = new CSVWriter(new FileWriter(outputFile))){
            writer.writeNext(new String[]{"ID", "Name", "Age", "Marks", "Grade"});
            for(String[] student : studentData.values()){
                writer.writeNext(student);
    }
            System.out.println("Merged data successfully written to " + outputFile);
        }catch (IOException e){
            System.err.println("Error writing merged file: " + e.getMessage());
    }
  }
}
