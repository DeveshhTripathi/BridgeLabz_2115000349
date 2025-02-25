import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
public class ValidateCSVData{
    public static void main(String[] args){
        String filePath = "employees.csv";

        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        String phoneRegex = "^[0-9]{10}$";

        Pattern emailPattern = Pattern.compile(emailRegex);
        Pattern phonePattern = Pattern.compile(phoneRegex);

        try(CSVReader reader = new CSVReader(new FileReader(filePath))){
         String[] nextLine;
        boolean firstLine = true;
            while((nextLine = reader.readNext()) != null){
                if(firstLine){
                 firstLine = false;
                 continue;
                }
                String email = nextLine[2];
                String phone = nextLine[3];

                boolean isEmailValid = emailPattern.matcher(email).matches();
                boolean isPhoneValid = phonePattern.matcher(phone).matches();
                if(!isEmailValid || !isPhoneValid){
                    System.out.println("Invalid Row: " + String.join(", ", nextLine));
                    if(!isEmailValid){
                        System.out.println("Invalid email format.");
                    }
                    if(!isPhoneValid){
                        System.out.println("Phone number must be 10 digits.");
                }
            }
     }
        }catch (IOException e){
            System.err.println("Error reading the CSV file: " + e.getMessage());
    }
  }
}
