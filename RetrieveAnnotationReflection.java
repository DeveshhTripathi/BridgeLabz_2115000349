import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author{
    String name();
}
@Author(name = "Shiva")
class SampleClass{
    public void display(){
        System.out.println("SampleClass method executed.");
  }
}
public class RetrieveAnnotationReflection{
    public static void main(String[] args){
        try{
            Class<?> clazz = SampleClass.class;
            if(clazz.isAnnotationPresent(Author.class)){
                Author author = clazz.getAnnotation(Author.class);
                System.out.println("Author Name: " + author.name());
            }else{
                System.out.println("No @Author annotation found.");
         }
     }catch(Exception e){
            e.printStackTrace();
   }
 }
}
