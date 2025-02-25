import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.util.Base64;
import java.util.List;
class Employee{
    public int id;
    public String name;
    public String email;
    public String salary;
    public Employee(int id, String name, String email, String salary){
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
  }
}
public class EncryptDecryptCSV{
    private static final String SECRET_KEY = "MySecretAESKey12";
    public static void main(String[] args){
        String csvFilePath = "employees_encrypted.csv";
        Employee[] employees ={
            new Employee(101, "Rohan", encrypt("alice@example.com"), encrypt("70000")),
            new Employee(102, "Rahul", encrypt("bob@example.com"), encrypt("85000")),
            new Employee(103, "Shiva", encrypt("charlie@example.com"), encrypt("95000")),
            new Employee(104, "", encrypt("david@example.com"), encrypt("62000")),
            new Employee(105, "Emma", encrypt("emma@example.com"), encrypt("90000"))
        };
        writeEncryptedCSV(csvFilePath, employees);
        readAndDecryptCSV(csvFilePath);
 }
    public static String encrypt(String value){
        try{
            SecretKeySpec secretKey = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Base64.getEncoder().encodeToString(cipher.doFinal(value.getBytes()));
        }catch (Exception e){
            throw new RuntimeException("Encryption error", e);
    }
}
    public static String decrypt(String encryptedValue){
        try{
            SecretKeySpec secretKey = new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(encryptedValue)));
        }catch (Exception e){
            throw new RuntimeException("Decryption error", e);
    }
 }
    public static void writeEncryptedCSV(String filePath, Employee[] employees){
        try(CSVWriter writer = new CSVWriter(new FileWriter(filePath))){
            writer.writeNext(new String[]{"ID", "Name", "Email", "Salary"});
            for(Employee emp : employees){
                writer.writeNext(new String[]{String.valueOf(emp.id), emp.name, emp.email, emp.salary});
            }
            System.out.println("Encrypted data written to CSV: " + filePath);
        }catch(IOException e){
            System.err.println("Error writing CSV: " + e.getMessage());
        }
    }
    public static void readAndDecryptCSV(String filePath){
        try(CSVReader reader = new CSVReader(new FileReader(filePath))){
            List<String[]> records = reader.readAll();
            System.out.println("\nDecrypted Employee Data:");
            for(int i = 1; i < records.size(); i++){
                String[] row = records.get(i);
                int id = Integer.parseInt(row[0]);
                String name = row[1];
                String email = decrypt(row[2]);
                String salary = decrypt(row[3]);
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email + ", Salary: $" + salary);
        }
     }catch (IOException e){
            System.err.println("Error reading CSV: " + e.getMessage());
    }
  }
}
