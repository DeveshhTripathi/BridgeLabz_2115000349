import java.util.Scanner;
public class FactorialUsingWhile{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int later =num;
	int ans = 1;
	if(num>0){
	while(num!=0){
	    ans = ans * num;
	    num--;
        }
	 System.out.println("Factorial of " +later + " is " + ans);
      }
	else{
	 System.out.println("Entered number is negative");
	}
    }
}
