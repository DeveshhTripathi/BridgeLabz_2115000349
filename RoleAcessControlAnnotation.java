import java.lang.annotation.*;  
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed{
    String value();
}
class SecureService{
    @RoleAllowed("ADMIN")
    public void adminTask(){
        System.out.println("Admin task executed.");
  }
}
class User{
    private String role;
    public User(String role){
        this.role = role;
 }
    public void executeTask(SecureService service, String methodName){
        try{
            Method method = SecureService.class.getDeclaredMethod(methodName);
            if(method.isAnnotationPresent(RoleAllowed.class)){
                String requiredRole = method.getAnnotation(RoleAllowed.class).value();
                if(!this.role.equals(requiredRole)){
                    System.out.println("Access Denied");
                    return;
    }
  }
          method.invoke(service);
     }catch(Exception e){
            e.printStackTrace();
    }
  }
}
public class RoleAcessControlAnnotation{
    public static void main(String[] args){
        SecureService service = new SecureService();
        User admin = new User("ADMIN");
        admin.executeTask(service, "adminTask");
        User guest = new User("GUEST");
        guest.executeTask(service, "adminTask");
  }
}
