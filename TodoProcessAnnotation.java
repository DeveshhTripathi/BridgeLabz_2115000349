import java.lang.annotation.*;  
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo{
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}
class Project{
    @Todo(task = "Implement user authentication", assignedTo = "Shiva", priority = "HIGH")
    public void userAuth(){}
    @Todo(task = "Optimize database queries", assignedTo = "Rahul")
    public void optimizeDB(){}
    @Todo(task = "Enhance UI responsiveness", assignedTo = "Rohan", priority = "LOW")
    public void enhanceUI(){}
}
public class TodoProcessAnnotation{
    public static void main(String[] args){
        for (Method method : Project.class.getDeclaredMethods()){
            if (method.isAnnotationPresent(Todo.class)){
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println("Task: " + todo.task() + " | Assigned To: " + todo.assignedTo() + " | Priority: " + todo.priority());
     }
   }
  }
}
