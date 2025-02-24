import java.lang.reflect.Method;
import java.util.Scanner;
class MathOperations{
    public int add(int a, int b){
        return a + b;
  }
    public int subtract(int a, int b){
        return a - b;
  }
    public int multiply(int a, int b){
        return a * b;
  }
}
public class DynamicMathInvocationReflection{
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            MathOperations mathOps = new MathOperations();
            System.out.print("Enter method name (add, subtract, multiply): ");
            String methodName = sc.nextLine();
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            Method method = MathOperations.class.getMethod(methodName, int.class, int.class);
            int result = (int) method.invoke(mathOps, num1, num2);
            System.out.println("Result: " + result);
        }catch(Exception e){
            System.out.println("Invalid method name or parameters");
            e.printStackTrace();
    }
 }
}
