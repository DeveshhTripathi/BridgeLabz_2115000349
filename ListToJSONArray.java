import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

class Student{
    public String name;
    public int age;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class ListToJSONArray{
    public static void main(String[] args) {
        try{
            List<Student> students = List.of(
                new Student("Rohan", 22),
                new Student("Amit", 24),
                new Student("Priyam", 21)
            );

            ObjectMapper objectMapper = new ObjectMapper();
            String jsonArray = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(students);
            
            System.out.println(jsonArray);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
