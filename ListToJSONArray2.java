import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

class Person {
    public String name;
    public int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ListToJSONArray2 {
    public static void main(String[] args) {
        try {
            List<Person> people = List.of(
                new Person("Rohan", 26),
                new Person("Amit", 24),
                new Person("Priya", 29)
            );

            ObjectMapper objectMapper = new ObjectMapper();
            String jsonArray = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(people);
            
            System.out.println(jsonArray);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
