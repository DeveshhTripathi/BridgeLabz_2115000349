import java.util.*;
public class DivisionUnchecked2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter numerator: ");
            int numerator = sc.nextInt();
            System.out.print("Enter denominator: ");
            int denominator = sc.nextInt();
            int result = numerator/denominator;
            System.out.println("Result: " + result);
        }catch(ArithmeticException e){
            System.out.println("Division by zero is not allowed.");
        }catch(InputMismatchException e){
            System.out.println("Please enter valid numeric values.");
     }
 }
}
