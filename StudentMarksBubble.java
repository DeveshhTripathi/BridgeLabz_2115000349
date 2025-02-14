import java.util.*;
public class StudentMarksBubble{
	public int[] sort(int[] arr){
		if(arr.length==0||arr.length==1){
			return arr;
		}
		for(int i=0;i<arr.length-1;i++){
			int temp=0;
			for(int j=0;j<arr.length-i-1;j++){
			if(arr[j]>arr[j+1]){
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			}
		}
		return arr;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students");
		int num = sc.nextInt();
		int[] arr = new int[num];
		System.out.println("Enter Student marks");
		for(int i=0;i<num;i++){
			arr[i]=sc.nextInt();
		}
		StudentMarksBubble obj = new StudentMarksBubble();
		int[] res = obj.sort(arr);
		System.out.println(Arrays.toString(res));
	}
}
