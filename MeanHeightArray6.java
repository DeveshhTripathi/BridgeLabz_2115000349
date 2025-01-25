import java.util.Scanner;
public class MeanHeightArray6{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	double[] arr = new double[11];
	for(int i=0;i<=arr.length-1;i++){
	System.out.println("Enter the height of player " + (i+1)+ " in cm");
	arr[i]=sc.nextDouble();
    }
	double sum =0;
	for(int i=0;i<arr.length;i++){
	sum += arr[i];
    }
	System.out.println("The mean height of players is " +(sum/11));
  }
}
