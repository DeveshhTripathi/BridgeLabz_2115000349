import java.util.Scanner;
public class LeapYearMethod14{
    public static boolean isLeapYear(int year){
        if (year < 1582) {
            System.out.println("Year must be greater than or equal to 1582");
            return false;
        }
        boolean divisibleBy4 = (year % 4 == 0);
        boolean notDivisibleBy100 = (year % 100 != 0);
        boolean divisibleBy400 = (year % 400 == 0);

        return (divisibleBy4 && notDivisibleBy100) || divisibleBy400;
}
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year ");
        int year = sc.nextInt();
        if(isLeapYear(year)) {
          System.out.println(year + " is a leap year.");
      }else{
         System.out.println(year + " is not a leap year.");
     }
  }
}
