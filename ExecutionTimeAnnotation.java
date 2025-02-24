import java.lang.annotation.*;  
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime{}
class PerformanceTest{
    @LogExecutionTime
    public void fastMethod(){
        for(int i = 0; i < 1000; i++);
  }
    @LogExecutionTime
    public void slowMethod(){
        for (int i=0;i<1000000;i++);
  }
}
public class ExecutionTimeAnnotation{
    public static void main(String[] args) throws Exception{
        PerformanceTest test = new PerformanceTest();
        for(Method method : PerformanceTest.class.getDeclaredMethods()){
            if(method.isAnnotationPresent(LogExecutionTime.class)){
                long start = System.nanoTime();
                method.invoke(test);
                long end = System.nanoTime();
                System.out.println("Method: " + method.getName() + " | Execution Time: " + (end - start) + " ns");
    }
   }
 }
}
