import java.util.Scanner;
public class CheckNumberPovNev{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	double num = sc.nextDouble();
	if(num>0){
	 System.out.println("Positive");
    }
	else if(num==0){
	 System.out.println("Zero");
    }
	else{
	 System.out.println("Negative");
    }
  }
}
