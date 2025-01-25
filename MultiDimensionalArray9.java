import java.util.Scanner;
public class  MultiDimensionalArray9{
	public static void main(String Args[]){
	int index=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of rows");
	int rows=sc.nextInt();
	System.out.println("Enter the number of coloums");
	int coloums = sc.nextInt();
	int[][] dArr = new int[rows][coloums];
	int[] arr = new int[rows*coloums];
	System.out.println("Enter the elemnts if 2 D array");
	for(int i=0;i<rows;i++){
	    for(int j=0;j<coloums;j++){
	dArr[i][j] = sc.nextInt();
      }
    }
	 for(int i=0;i<rows;i++){
            for(int j=0;j<coloums;j++){
        arr[index++]= dArr[i][j];
      }
    }
	for(int nums : arr){
	System.out.print(nums);
    }
  }
}
