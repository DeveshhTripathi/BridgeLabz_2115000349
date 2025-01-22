import java.util.Scanner;
public class SI{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the Rate of Interest: ");
        double rate = sc.nextDouble();
	System.out.println("Enter the time: ");
        double time = sc.nextDouble();
        double SI = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is " + SI + " for Principal " + principal + ", Rate of Interest " + rate + ", and Time " + time);
    }
}
