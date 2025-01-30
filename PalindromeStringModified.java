import java.util.Scanner;
public class PalindromeStringModified{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of string");
        String str = sc.nextLine();
        if (isPalindrome(str)){
            System.out.println("This is a palindrome string");
    }else{
            System.out.println("This is not a palindrome string");
    }
  }
    public static boolean isPalindrome(String str){
        int len = str.length();
        for(int i=0;i<len/2;i++){
            if(str.charAt(i)!=str.charAt(len-i-1)){
                return false;
       }
    }
      return true;
    }
}
