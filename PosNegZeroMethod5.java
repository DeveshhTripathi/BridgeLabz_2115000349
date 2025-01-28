import java.util.Scanner;
public class PosNegZeroMethod5{
	public int Check(int n){
	if(n>0){
	return 1;
	}else if(n<0){
	return -1;
	}else{
	return 0;
	}
  	}
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number ");
	int n = sc.nextInt();
	PosNegZeroMethod5 obj = new PosNegZeroMethod5();
	int ans = obj.Check(n);
	if(ans==1){
	System.out.println("Number is positive");
	}else if(ans == -1){
	System.out.println("Number is negative");
	}else{
	System.out.println("Number is zero");
    }
  }
}
