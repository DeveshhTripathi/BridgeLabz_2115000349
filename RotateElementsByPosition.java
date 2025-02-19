import java.util.*;
public class RotateElementsByPosition{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	List<Integer> elements = new ArrayList<>();
	System.out.println("Enter the number of elements");
	int n = sc.nextInt();
	int[] res = new int[n];
	System.out.println("Enter the index elements have to be rotated");
	int num = sc.nextInt();
	int totalIterations = n+num;
	System.out.println("Enter the elements in list");
	for(int i=0;i<n;i++){
	elements.add(sc.nextInt());
	}
	int j=0;
	for(int i=num;i<totalIterations;i++){
		res[j] = elements.get(i%n);
		j++;
	}
	System.out.println("Rotated number is :"+Arrays.toString(res));
	}
}
