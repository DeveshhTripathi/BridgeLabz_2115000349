import java.util.*;
public class RemoveDuplicateSB{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	HashSet<Character> set = new HashSet<>();
	StringBuilder sb = new StringBuilder();
	System.out.println("Enter the String");
	String str = sc.nextLine();
	for(int i=0;i<str.length();i++){
	if(!set.contains(str.charAt(i))){
	sb.append(str.charAt(i));
	set.add(str.charAt(i));
	    } 
	  }
	String res = sb.toString();
	System.out.println("String after removing duplicates is: "+res);
	}
}
