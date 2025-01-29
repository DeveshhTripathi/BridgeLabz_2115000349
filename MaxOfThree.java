import java.util.Scanner;
public class MaxOfThree{
	public static int Calc(int a,int b,int c){
	int num = Math.max(a,Math.max(b,c));
	return num;
	}
	public static int[] input(){
	int[] arr = new int[3];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number ");
	arr[0] = sc.nextInt();
	System.out.println("Enter the second number ");
	arr[1] = sc.nextInt();
	System.out.println("Enter the third number ");
	arr[2] = sc.nextInt();
	return arr;
	}
	public static void main(String args[]){
	int nums[] = input();
	int ans = Calc(nums[0],nums[1],nums[2]);
	System.out.println("The maximum number is: "+ans);
	}
}
