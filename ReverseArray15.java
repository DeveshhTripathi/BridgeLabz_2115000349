import java.util.Scanner;
public class ReverseArray15{
public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	int copy = num;
	int count=0;
	while(copy!=0){
	copy = copy/10;
	count++;
	}
	int[] arr = new int[count];
	int index=0;
	while(num!=0){
	arr[index] = num%10;
	num = num/10;
	index++;
	}
	System.out.print("Reverse of this number is ");
	for(int nums:arr){
	System.out.print(nums);
	}
   }
}
