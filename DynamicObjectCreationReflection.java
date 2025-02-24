import java.lang.reflect.Constructor;
class Student{
    private String name;
    public Student(){
        this.name = "Student object created";
  }
    public Student(String name){
        this.name = name;
  }
    public void display(){
        System.out.println("Student Name: " + name);
  }
}
public class DynamicObjectCreationReflection{
    public static void main(String[] args){
        try{
            Class<?> studentClass = Class.forName("Student");
            Constructor<?> defaultConstructor = studentClass.getDeclaredConstructor();
            Object studentObj = defaultConstructor.newInstance();
            java.lang.reflect.Method displayMethod = studentClass.getMethod("display");
            displayMethod.invoke(studentObj);
        }catch (Exception e){
            e.printStackTrace();
    }
 }
}
