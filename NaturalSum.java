import java.util.Scanner;
public class NaturalSum{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int sum=0;
	if(num>0){
	for(int i=0;i<=num;i++){
	sum=sum+i;
      }	
    }
	else{
	System.out.println("This number " +num + "is not a natural number");
    }
	System.out.println("The number " +num+" is a natural number and its sum is " +sum);
  }
}
