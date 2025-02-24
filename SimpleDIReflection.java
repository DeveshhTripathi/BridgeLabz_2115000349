import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {}
interface Service{
    void serve();
}
class ServiceImpl implements Service{
    public void serve(){
        System.out.println("Service is running...");
  }
}
class Client{
    @Inject
    private Service service;
    public void doWork(){
        service.serve();
  }
}
class DIContainer{
    private final Map<Class<?>, Object> instances = new HashMap<>();
    public DIContainer(){
        instances.put(Service.class, new ServiceImpl());
  }
    public void injectDependencies(Object object){
        Class<?> clazz = object.getClass();
        for(Field field : clazz.getDeclaredFields()){
            if(field.isAnnotationPresent(Inject.class)){
                field.setAccessible(true);
                try{
                    Object dependency = instances.get(field.getType());
                    if(dependency != null){
                        field.set(object, dependency);
                    }else{
                        throw new RuntimeException("No implementation found for " + field.getType());
               }
                }catch(IllegalAccessException e){
                    throw new RuntimeException("Failed to inject dependency: " + e.getMessage());
          }
       }
    }
  }
}
public class SimpleDIReflection{
    public static void main(String[] args){
        DIContainer container = new DIContainer();
        Client client = new Client();
        container.injectDependencies(client);
        client.doWork();
 }
}
