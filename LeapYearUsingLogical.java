import java.util.Scanner;
public class LeapYearUsingLogical{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a year: ");
       int year = sc.nextInt();
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println((year>=1582 ? year + " is not a Leap Year." : "Invalid year"));
    }
  }
}
