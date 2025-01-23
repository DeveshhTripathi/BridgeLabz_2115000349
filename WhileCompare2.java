import java.util.Scanner;
public class WhileCompare2{
	public static void main(String Args[]){
	int sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");

	int num = sc.nextInt();
	if(num>0){
	System.out.println("Number entered is a natural number");

	int formulae = (num * (num+1))/2;
	while(num!=0){
	sum = sum + num;
	num--;
	}
	if(sum==formulae){
	System.out.println("Both results came same and relut is" +sum);
	}else{
	System.out.println("Both results are different");

	}
}
else{
	System.out.println("Number entered is not a natural number");

    }
  }
}
