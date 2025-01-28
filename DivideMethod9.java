import java.util.Scanner;
public class DivideMethod9{
	public int[] Calc(int num, int diviser){
	int que = 0;
	int rem = 0;
	que = num/diviser;
	rem = num%diviser;
	return new int[] {que,rem};
	}
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("ENter the number");
	int num = sc.nextInt();
	System.out.println("Enter the diviser");
	int diviser = sc.nextInt();
	DivideMethod9 obj = new DivideMethod9();
	int[] ans = obj.Calc(num,diviser);
	System.out.println("Quetiont is " +ans[0]+ " and Remainder is " +ans[1]); 
  }
}
