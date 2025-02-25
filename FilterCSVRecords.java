import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
public class FilterCSVRecords{
    public static void main(String[] args){
        String filePath = "students.csv";
        try(CSVReader reader = new CSVReader(new FileReader(filePath))){
            String[] nextLine;
            boolean firstLine = true;
            System.out.println("Students with marks > 80:");
            while ((nextLine = reader.readNext()) != null){
                if(firstLine){ 
                    firstLine = false;
                    continue;
      }
                int marks = Integer.parseInt(nextLine[3]);
                if(marks > 80){
                    System.out.println("ID: " + nextLine[0] + ", Name: " +nextLine[1]+ ", Age: "+ nextLine[2]+", Marks: "+ nextLine[3]);
   }
  }
        }catch(IOException e){
            System.err.println("Error reading the CSV file: " + e.getMessage());
        }catch(NumberFormatException e){
            System.err.println("Error parsing marks: " + e.getMessage());
    }
  }
}
