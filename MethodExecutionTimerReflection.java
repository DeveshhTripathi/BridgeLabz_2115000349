import java.lang.reflect.Method;
class SampleClass{
    public void fastMethod(){
        for (int i = 0; i < 1000; i++);
  }
    public void slowMethod(){
      for(int i = 0; i < 1000000; i++);
  }
}
public class MethodExecutionTimerReflection{
    public static void measureExecutionTime(Object obj, String methodName) {
        try{
          Method method = obj.getClass().getMethod(methodName);
          long startTime = System.nanoTime();
          method.invoke(obj);
          long endTime = System.nanoTime();
            System.out.println(methodName + " execution time: " + (endTime-startTime) + " ns");
        }catch(Exception e){
            e.printStackTrace();
 }
}
    public static void main(String[] args) {
        SampleClass obj = new SampleClass();
        measureExecutionTime(obj, "fastMethod");
        measureExecutionTime(obj, "slowMethod");
  }
}
