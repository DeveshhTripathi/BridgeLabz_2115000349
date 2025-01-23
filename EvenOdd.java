import java.util.Scanner;
public class EvenOdd{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number");
	int num = sc.nextInt();
	if(num>1){
	 System.out.println("the number 1 is odd");
	}
	if(num>2){
	 System.out.println("the number 2 is even");
	}
	if(num>=3){
	for(int i=3;i<=num;i++){
	if(i%2==0){
	 System.out.println("The number "+ i + " is even");
	}else{
	 System.out.println("The number " +i + " is odd");
	}
	}
    }
  }
}
