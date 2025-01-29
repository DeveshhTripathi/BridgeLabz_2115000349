import java.util.Scanner;
public class PrimeCheck{
	public static int Calc(int num){
	int count=0;
	for(int i=2;i<Math.sqrt(num);i++){
	if(num%i==0){
	count++;
	}
	}
	return count;
	}
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = sc.nextInt();
	int res = Calc(num);
	if(res==0){
	System.out.println(num+ " is a prime number");
	}else{
	System.out.println(num+ " is not a prime number");
	}
	}
}
