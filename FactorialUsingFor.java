import java.util.Scanner;
public class FactorialUsingFor{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number");
	int num = sc.nextInt();
	if(num>0){
	int ans=1;
	for(int i=1;i<=num;i++){
	ans=ans*i;
	}
	 System.out.println("Factotail of "+num + " is "+ans);
  }
	else{
	 System.out.println("Enter a positive number");	
   }
 }
}
