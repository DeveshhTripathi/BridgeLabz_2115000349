import java.util.Scanner;
public class PovNegZeroArray2{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[5];
	for(int i=0;i<=arr.length-1;i++){
	System.out.println("Enter the " + (i+1) + " number");
	arr[i] = sc.nextInt();
    }
	for(int i=0;i<=arr.length-1;i++){
	if(arr[i]>0){
	 System.out.println("Number " +(i+1)+ " is positive");
	}
	else if(arr[i]==0){
	System.out.println("Number " +(i+1)+ " is negative");
	}else{
	System.out.println("Number " +(i+1)+ " is zero");
   }
}
      for(int i=0;i<=arr.length-1;i++){
      if(arr[i]%2==0){
	System.out.println("Number " + (i+1) + " is even");
      }else{
	 System.out.println("Number " + (i+1) + " is odd");
      }
    }
        if(arr[1]>arr[arr.length-1]){
         System.out.println("First element is  greater than last");
        }
        else if(arr[1]==arr[arr.length-1]){
        System.out.println("First and last are equal");
        }else{
        System.out.println("First element is less than Last");
    }
  }
}
