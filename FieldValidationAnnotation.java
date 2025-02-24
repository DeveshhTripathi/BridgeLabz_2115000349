import java.lang.annotation.*;  
import java.lang.reflect.Field;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength{
    int value();
}
class User{
    @MaxLength(10)
    private String username;
    public User(String username){
        validate(username);
        this.username = username;
  }
    private void validate(String username){
        try{
            Field field = User.class.getDeclaredField("username");
            if(field.isAnnotationPresent(MaxLength.class)){
                int maxLength = field.getAnnotation(MaxLength.class).value();
                if(username.length() > maxLength){
                    throw new IllegalArgumentException("Username exceeds max length of " + maxLength);
             }
        }
        }catch(NoSuchFieldException e){
            e.printStackTrace();
    }
 }
}
public class FieldValidationAnnotation{
    public static void main(String[] args){
        new User("Rohan");
        new User("HelloooooooHowwwwww");
 }
}
