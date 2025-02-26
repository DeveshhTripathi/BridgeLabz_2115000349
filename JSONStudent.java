import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

class Student{
   public String name;
   public int age;
   public List<String> subjects;

   public Student(String name, int age, List<String> subjects){
       this.name = name;
       this.age = age;
       this.subjects = subjects;
   }
}
public class JSONStudent{
   public static void main(String[] args) throws Exception{
       Student student = new Student("Rohit", 23, List.of("Math", "Science", "Computer Science"));
       ObjectMapper objectMapper = new ObjectMapper();
       String json = objectMapper.writeValueAsString(student);
       System.out.println(json);
   }
}
