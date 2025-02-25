import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
class Student{
    private int id;
    private String name;
    private int age;
    private double marks;
    public Student(int id, String name, int age, double marks){
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "Student { ID=" + id + ", Name='" + name + "', Age=" + age + ", Marks=" + marks + " }";
   }
}
public class CSVToStudentList{
    public static void main(String[] args){
        String filePath = "students.csv";
        List<Student> students = new ArrayList<>();
        try(CSVReader reader = new CSVReader(new FileReader(filePath))){
            String[] nextLine;
            boolean firstLine = true;
            while((nextLine = reader.readNext()) != null){
                if(firstLine){
                 firstLine = false;
                   continue;
                }
                int id = Integer.parseInt(nextLine[0]);
                String name = nextLine[1];
                int age = Integer.parseInt(nextLine[2]);
                double marks = Double.parseDouble(nextLine[3]);
                Student student = new Student(id, name, age, marks);
                students.add(student);
            }
            System.out.println("Students List:");
            for(Student student : students) {
                System.out.println(student);
           }
        } catch (IOException e){
            System.err.println("Error reading the CSV file: " + e.getMessage());
    }
 }
}
