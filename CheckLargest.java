import java.util.Scanner;
public class CheckLargest{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter three numbers accordingly");
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	double c = sc.nextDouble();

	boolean first = (a>b)  && (a>c);
	boolean second = (b>a)  && (b>c);
	boolean third = (c>a)  && (c>b);

	 System.out.println("First number is largest? "+first);
	 System.out.println("Second number is largest? "+second);
         System.out.println("Third number is largest? "+third);

  }
}
