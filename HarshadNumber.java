import java.util.Scanner;
public class HarshadNumber{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number ");
      int num = sc.nextInt();
        int originalNumber = num;
        int sum = 0;
        while(originalNumber > 0) {
            int digit = originalNumber % 10;
            sum += digit;
            originalNumber /= 10;
     }
        if(num % sum == 0) {
            System.out.println(num + " is a Harshad Number");
        }else{
            System.out.println(num + " is not a Harshad Number");
     }
  }
}
