import java.util.Scanner;
public class SumOfNumBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.println("Enter the number:");
            int num = sc.nextInt();

            if (num <= 0) {
                break;
            }
            sum += num;
        }
        System.out.println("The sum of these numbers is " + sum);
    }
}

