import java.util.Scanner;
public class Fabonacci{
	public static int[] Calc(int num){
	if(num<=0) return new int[0];
	if(num==1) return new int[] {0};
	int[] arr = new int[num];
	arr[0] = 0;
	arr[1]=1;
	for(int i=2;i<num;i++){
	arr[i]=arr[i-1]+arr[i-2];
	}
	return arr;
	}
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int[] ans = Calc(num);
	System.out.println("The numbers in fabonacci series till " + num + " is :" );
	for(int n:ans){
		System.out.println(n +" ");
	}
	}
}
