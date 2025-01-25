import java.util.Scanner;
public class OddEvenArray7{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number ");
	int num = sc.nextInt();
	int[] evenArr = new int[(num/2)+1];
        int[] oddArr = new int[(num/2)+1];
	int j=0;
	int k=0; 	
	for(int i=0;i<num;i++){
	if(i%2==0){
	evenArr[j]=i;
	j++;
      }else{
	oddArr[k]=i;
        k++;
	}	
    }
	for(int i=0;i<=evenArr.length-1;i++){
    	System.out.println("Even array values are " +evenArr[i]);
    }
	for(int i=0;i<=evenArr.length-1;i++){
        System.out.println("Odd array values are " +oddArr[i]);
    }

  }
}
