import java.util.*;
public class ConcatenateStringsSB{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	StringBuffer sb = new StringBuffer();
	System.out.println("Enter the size of array");
	int n = sc.nextInt();
	sc.nextLine();
	String[] storage = new String[n];
	for(int i=0;i<n;i++){
		storage[i]= sc.nextLine();
	}
	for(int i=0;i<storage.length;i++){
	  sb.append(storage[i]);
	  if(i<n-1){
           sb.append(" ");
         }
    }
       String res = sb.toString();
       System.out.println("After concatination the string is " + res);
    }
}
