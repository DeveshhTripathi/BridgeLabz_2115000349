import java.util.Scanner;
public class FactorialRecurssion{
	public static int Input(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to calculate factorial");
	int nums = sc.nextInt();
	return nums;
	}
	public static int Calc(int num){
	if(num==1||num==0){
		return 1;
	}
	int ans = num * Calc(num-1);
	return ans;
	}
	public static void Output(int res){
		System.out.println("The factorial of number is " +res);
	}
	public static void main(String args[]){
	int num = Input();
	int res = Calc(num);
	Output(res);
	}
}
