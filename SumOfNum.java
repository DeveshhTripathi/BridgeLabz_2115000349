import java.util.Scanner;
public class SumOfNum{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	double sum = 0.0;
	System.out.println("Enter any number");
	double num = sc.nextDouble();
	while(num!=0){
	sum = sum+num;
	num = sc.nextDouble();
    }
	System.out.println("The sum to total numbers given by users is "+sum);
  }
}
