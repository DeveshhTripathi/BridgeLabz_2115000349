import java.util.Scanner;
public class forCountDown{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value for count down");
	int val = sc.nextInt();
	
	for(int i=val;i>=0;i--){
	System.out.println(i);
    }
  }
}
