import java.util.Scanner;
public class Multiplication{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	for(int i=6;i<=9;i++){
	int ans = num*i;
        System.out.println(num + " * " + i + " = " + ans);
    }
  }
}
