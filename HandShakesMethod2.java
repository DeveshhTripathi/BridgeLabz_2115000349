import java.util.Scanner;
public class HandShakesMethod2{
	public int Shake(int n){
	int res = (n*(n-1))/2;
	return res;
  	}

	public static void main(String Args[]){
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the number ");
	int n = sc.nextInt();
	HandShakesMethod2 obj = new HandShakesMethod2();
	int ans = obj.Shake(n);
	System.out.println("Total hand shakes are: "+ans); 
}
}
