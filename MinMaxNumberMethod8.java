import java.util.Scanner;
public class MinMaxNumberMethod8{
	public int[] MinMax(int number1,int number2,int number3){
	int max=0;
	int min=0;
	max= Math.max(number1 ,Math.max(number2,number3));
	min= Math.min(number1 , Math.min(number2,number3));
	return new int[]{max,min};
}
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the numbers ");
	int number1= sc.nextInt();
	int number2 = sc.nextInt();
	int number3 = sc.nextInt();
        MinMaxNumberMethod8 obj = new MinMaxNumberMethod8();
	int res[] = obj.MinMax(number1,number2,number3);
	System.out.println("Maximum number is "+ res[0]);
	System.out.println("Minimum number is "+ res[1]);
  }
}
