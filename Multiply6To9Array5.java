import java.util.Scanner;
public class Multiply6To9Array5{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number ");
	int num = sc.nextInt();
	int[] arr = new int[4];
	for(int i=6;i<=9;i++){
	int res = num * i;
	System.out.println(num + " * " +i +" = " +res);
    }
  }
}
