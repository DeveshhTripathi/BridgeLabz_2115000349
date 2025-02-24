import java.lang.reflect.Field;
import java.util.Map;
class User{
    private String name;
    private int age;
    public void display(){
        System.out.println("Name: " + name + ", Age: " + age);
  }
}
public class CustomObjectMapperReflection{
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties){
        try{
            T obj = clazz.getDeclaredConstructor().newInstance();
            for(Map.Entry<String, Object> entry : properties.entrySet()){
                Field field = clazz.getDeclaredField(entry.getKey());
                field.setAccessible(true);
                field.set(obj, entry.getValue());
        }
            return obj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
   }
 }
    public static void main(String[] args){
        Map<String, Object> properties = Map.of(
            "name", "Rohan",
            "age", 23
        );
        User user = toObject(User.class, properties);
        user.display();
  }
}

