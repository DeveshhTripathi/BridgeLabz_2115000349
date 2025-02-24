import java.lang.annotation.*;  
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod{
    String level() default "HIGH";
}
class SampleClass{
    @ImportantMethod(level = "CRITICAL")
    public void criticalMethod(){
        System.out.println("Executing critical method");
  }
    @ImportantMethod
    public void highPriorityMethod(){
        System.out.println("Executing high-priority method");
  }
    public void normalMethod(){
        System.out.println("Executing normal method");
  }
}
public class ImportantMethodAnnotation{
    public static void main(String[] args){
        Class<SampleClass> obj = SampleClass.class;
        for (Method method : obj.getDeclaredMethods()){
            if (method.isAnnotationPresent(ImportantMethod.class)){
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + " | Level: " + annotation.level());
      }
    }
  }
}
