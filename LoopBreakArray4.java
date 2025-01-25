import java.util.Scanner;
public class LoopBreakArray4{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number ");
	double[] arr = new double[10];
	int i=0;
	while(true){
	double num = sc.nextDouble();
	if(num<=0 || i==9){
	break;
        }
	else{
	arr[i] = num;
	i++;
      }
    }
	double sum =0;
	for(int j=0;j<=i;j++){
	sum +=arr[j];
    }
	System.out.println("Total value is " +sum);
  }
}
