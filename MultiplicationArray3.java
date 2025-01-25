import java.util.Scanner;
public class MultiplicationArray3{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number ");
	int num = sc.nextInt();
	int[] arr = new int[10];
	for(int i=1;i<=arr.length;i++){
	arr[i-1] = num*i;
    }
	for(int i=1;i<=arr.length;i++){
	 System.out.println(num + " * " +i+ " = " +arr[i-1]);
    }
  }
}
