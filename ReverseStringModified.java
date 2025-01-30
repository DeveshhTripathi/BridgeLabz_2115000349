import java.util.Scanner;
public class ReverseStringModified{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of string");
        String str = sc.nextLine();
        String reversedStr = "";
        for (int i=str.length()-1;i>=0;i--){
            reversedStr+=str.charAt(i);
     }
        System.out.println("The elements of reversed string are " +reversedStr);
  }
}
