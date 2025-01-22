import java.util.Scanner;
public class KmtoMile{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter total km's");
	double km = sc.nextDouble();
	double mile = km *1.6;
	System.out.println("The total miles is " + mile + " mile for the given " + km + " km");
  }
}
