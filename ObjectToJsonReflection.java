import java.lang.reflect.Field;
import java.util.*;
class User{
    private String name;
    private int age;
    private boolean active;

    public User(String name, int age, boolean active){
        this.name = name;
        this.age = age;
        this.active = active;
  }
}
public class ObjectToJsonReflection{
    public static String toJson(Object obj){
        try{
            Class<?> clazz = obj.getClass();
            StringBuilder jsonBuilder = new StringBuilder("{");
            Field[] fields = clazz.getDeclaredFields();
            List<String> jsonFields = new ArrayList<>();
            for(Field field : fields){
                field.setAccessible(true);
                String key = field.getName();
                Object value = field.get(obj);
                String jsonValue;
                if(value instanceof String){
                    jsonValue = "\"" + value + "\"";
                }else{
                    jsonValue = String.valueOf(value);
                }
                jsonFields.add("\"" + key + "\": " + jsonValue);
      }
            jsonBuilder.append(String.join(", ", jsonFields)).append("}");
            return jsonBuilder.toString();
        }catch (Exception e){
            e.printStackTrace();
            return "{}";
   }
 }
    public static void main(String[] args){
        User user = new User("Rohan", 23, true);
        String json = toJson(user);
        System.out.println(json);
 }
}
