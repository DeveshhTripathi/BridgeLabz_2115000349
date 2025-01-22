import java.util.Scanner;
public class HeightConversion{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	double cm = sc.nextDouble();
	double inch = cm / 2.54;
	double feet = inch / 12;
	System.out.println(" Your Height in cm is " +cm +" while in feet is " +feet + " and inches is " +inch);
  }
}
