import java.util.Scanner;
public class PalindromeCheck{
	public static int Calc(int num){
	int res=0;
	int temp=num;
	while(temp!=0){
	int a = temp%10;
	res = (res*10)+a;
	temp = temp/10;
	}
	return res;
	}
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	int nums = Calc(num);
	if(num==nums){
		System.out.println("Number "+num+ " is Palindrome");
	}else{
		 System.out.println("Number "+num+ " is not Palindrome");
		}
	}
}
