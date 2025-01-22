import java.util.Scanner;
public class Distance{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	double feet = sc.nextDouble();
	double yard = feet/3;
	double mile = yard/1760;
	System.out.println(feet +"feets in yards is " +yard + "and in miles is " +mile);
  }
}
