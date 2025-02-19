import java.util.*;
public class ReverseList{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	ArrayList<Integer> list = new ArrayList<>();
	LinkedList<Integer> ll = new LinkedList<>();
	System.out.println("Enter the number of elements in list");
	int n = sc.nextInt();
	System.out.println("Enter the elements");
	for(int i=0;i<n;i++){
		int num = sc.nextInt();
		list.add(num);
		ll.add(num);
	}
	int[] arr1 = new int[n];
	int[] arr2 =  new int[n];
	for(int i=0;i<n;i++){
		arr1[i] = list.get(n-1-i);
		arr2[i] = ll.get(n-1-i);
	}
	System.out.println("Reverse using Arraylist "+Arrays.toString(arr1));
	System.out.println("Reverse using Linkedlist "+Arrays.toString(arr2));
  }
}
 
