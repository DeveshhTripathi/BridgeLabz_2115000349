import java.util.Scanner;
public class Bonus{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	 System.out.println("Enter min years of service for bonus (authority) : ");
	 double min = sc.nextDouble();
	 System.out.println("Enter the percent of bonus(authority): ");
	 double bonusPercent = sc.nextDouble();
	 System.out.println("Enter your Salary: ");
	double salary = sc.nextDouble();
	 System.out.println("Enter working years: ");
	double time = sc.nextDouble();
	if(time>min){
	double bonusAmount = (bonusPercent/100)*salary;
	double newSalary = salary + bonusAmount;
	 System.out.println("Total salary will be credited is: " + newSalary);
    }
	else{
	 System.out.println("You are not eligible for bonus");
}
  }
}
