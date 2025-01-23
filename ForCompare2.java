import java.util.Scanner;
public class ForCompare2{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	if(num>0){
	System.out.println("It is a natural number");
	int formulae = (num*(num+1))/2;
	int sum=0;
	for(int i=0;i<=num;i++){
	   sum = sum + i;
      }
	if(sum==formulae){
	 System.out.println("Both the results are same and it is " + sum);
       }else{
	 System.out.println("Results are not same");	
      }
    }
	else{
	 System.out.println("It is not a natural number");
    }
  }
}
