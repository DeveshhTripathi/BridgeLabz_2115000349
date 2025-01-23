import java.util.Scanner;
public class Power{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base number ");
        double base = sc.nextDouble();
        System.out.println("Enter the power ");
        double exponent = sc.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
  }
}
