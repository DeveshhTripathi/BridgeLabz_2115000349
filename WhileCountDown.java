import java.util.Scanner;
public class WhileCountDown{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value for count down");
	int val = sc.nextInt();
	while(val>=0){
	System.out.println(val);
	val--;
    }
  }
}
