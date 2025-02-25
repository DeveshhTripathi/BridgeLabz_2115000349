import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
public class ExportDatabaseToCSV{
    public static void main(String[] args){
        String jdbcURL = "jdbc:mysql://localhost:3306/company_db";
        String dbUser = "root"; 
        String dbPassword = "pass1234";
        String csvFilePath = "employees.csv";
        String query = "SELECT id, name, department, salary FROM employees";
        try(Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query);
             CSVWriter writer = new CSVWriter(new FileWriter(csvFilePath))){

            String[] header = {"Employee ID", "Name", "Department", "Salary"};
            writer.writeNext(header);

            while(resultSet.next()){
                String[] record ={
                 String.valueOf(resultSet.getInt("id")),
                 resultSet.getString("name"),
                 resultSet.getString("department"),
                 String.valueOf(resultSet.getDouble("salary"))
            };
                writer.writeNext(record);
            }
            System.out.println("CSV file created successfully: " + csvFilePath);
        }catch(SQLException | IOException e){
            System.err.println("Error: " + e.getMessage());
   }
 }
}
