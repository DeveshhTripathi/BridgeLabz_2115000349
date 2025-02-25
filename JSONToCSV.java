import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

class Student{
    public int id;
    public String name;
    public int age;
    public int marks;
    public Student(){}

    public Student(int id, String name, int age, int marks){
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
  }
}
public class JSONToCSV{
    public static void main(String[] args){
        String jsonFilePath = "students.json";
        String csvFilePath = "students.csv";
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            List<Student> students = objectMapper.readValue(new File(jsonFilePath), new TypeReference<List<Student>>() {});
            try(CSVWriter writer = new CSVWriter(new FileWriter(csvFilePath))){

                String[] header = {"ID", "Name", "Age", "Marks"};
                writer.writeNext(header);

                for(Student student : students){
                    String[] row ={
                        String.valueOf(student.id),
                        student.name,
                        String.valueOf(student.age),
                        String.valueOf(student.marks)
                    };
                    writer.writeNext(row);
      }
   }
            System.out.println("JSON converted to CSV successfully: " + csvFilePath);
        }catch(IOException e){
            System.err.println("Error: " + e.getMessage());
   }
 }
}
