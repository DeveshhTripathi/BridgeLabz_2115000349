import java.lang.reflect.*;
import java.util.*;
public class ClassInputReflection{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter class name");
        String className = sc.nextLine();
        try{
            Class<?> clas = Class.forName(className);
            System.out.println("\nClass Name: " + clas.getName());
            System.out.println("\nConstructors:");
            for(Constructor<?> constructor : clas.getDeclaredConstructors()){
                System.out.println(constructor);
            }
            System.out.println("\nMethods:");
            for(java.lang.reflect.Method myMethod : clas.getDeclaredMethods()){
                System.out.println(myMethod);
            }
            System.out.println("\nFields:");
            for(Field field : clas.getDeclaredFields()){
                System.out.println(field);
            }
        }catch(ClassNotFoundException e){
            System.out.println("Class not found!");
   }
 }
}
