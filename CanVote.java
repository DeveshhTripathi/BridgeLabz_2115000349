import java.util.Scanner;
public class CanVote{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the age");
	int age = sc.nextInt();
	if(age>=18){
	 System.out.println("The person's age is " +age+ "and can vote");
    }
	else{
	 System.out.println("The person's age is " +age+ " And cannot vote");
    }
  }
}
