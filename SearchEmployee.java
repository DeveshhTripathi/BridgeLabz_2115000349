import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class SearchEmployee{
    public static void main(String[] args){
        String filePath = "employees.csv";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee name to search: ");
        String searchName = scanner.nextLine();
        boolean found = false;
        try(CSVReader reader = new CSVReader(new FileReader(filePath))){
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null){
                if (nextLine[1].equalsIgnoreCase(searchName)){
                    System.out.println("Department: " + nextLine[2] + ", Salary: " + nextLine[3]);
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("Employee not found.");
         }
    }catch(IOException e){
            System.err.println("Error reading CSV: " + e.getMessage());
   }
 }
}
