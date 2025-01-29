import java.util.Scanner;
public class GcdLcmCalc{
    public static int calcGCD(int a, int b) {
        while (b != 0){
            int temp=b;
            b=a % b;
            a=temp;
        }
        return a;
    	}
    public static int calcLCM(int a, int b){
        return (a*b)/calcGCD(a,b);
    	}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number ");
        int num1=sc.nextInt();
        System.out.println("Enter second number ");
        int num2=sc.nextInt();
        int gcd=calcGCD(num1,num2);
        int lcm=calcLCM(num1,num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
  }
}

