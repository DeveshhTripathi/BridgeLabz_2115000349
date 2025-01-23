import java.util.Scanner;
public class CheckSmallest{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter three numbers of your choice");
	double a = sc.nextDouble();
	double b = sc.nextDouble();
        double c = sc.nextDouble();
	
	boolean smallest = (a<b) && (a<c);
	System.out.println("Is First number Smallest? " + smallest);
  }
}
