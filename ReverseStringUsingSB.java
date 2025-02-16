import java.util.Scanner;
public class ReverseStringUsingSB{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String you want to reverse.");
	String str = sc.nextLine();
	StringBuilder sb = new StringBuilder();
	for(int i=0;i<str.length();i++){
	sb.append(str.charAt(i));
	}
	sb.reverse();
	String res = sb.toString();
	System.out.print(res);
    }
}
