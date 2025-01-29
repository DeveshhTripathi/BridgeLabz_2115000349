import java.util.Scanner;
public class Calculator9{
    public static double add(double a, double b){return a+b;}
    public static double subtract(double a, double b){return a-b;}
    public static double multiply(double a, double b){return a*b;}
    public static double divide(double a, double b){
        if (b == 0) { System.out.println("Division by zero is not allowed"); return Double.NaN;}
        return a / b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("1:Addition 2:Subtraction 3:Multiplication 4:Division");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        System.out.println("Enter first number ");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number");
        double num2 = sc.nextDouble();
        double result=0;
        boolean validChoice=true;
        switch (choice) {
            case 1: result = add(num1, num2); break;
            case 2: result = subtract(num1, num2); break;
            case 3: result = multiply(num1, num2); break;
            case 4: result = divide(num1, num2); if (Double.isNaN(result)) validChoice = false; break;
            default: System.out.println("Invalid choice"); 
		validChoice = false;
        }
        if(validChoice) System.out.println("Result: " + result);
  }
}
