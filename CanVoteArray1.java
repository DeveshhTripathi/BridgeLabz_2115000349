import java.util.Scanner;
public class CanVoteArray1{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[10];
	for(int i=1;i<=arr.length-1;i++){
	System.out.println("Enter the age of " +i+ " student");
	arr[i] = sc.nextInt();
    }
	for(int i=0;i<=arr.length-1;i++){
	if(arr[i]>=18){
	 System.out.println("Student " +(i+1)+ " can vote");
      }else{
	 System.out.println("Student " + (i+1) + " can not vote");
      }
    }
  }
}
