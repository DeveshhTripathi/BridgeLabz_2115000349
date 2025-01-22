import java.util.Scanner;
public class HandShakes{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int totalShakes = (n*(n-1))/2;
	System.out.println("Total possible hand shakes are "+ totalShakes);
  }
}
