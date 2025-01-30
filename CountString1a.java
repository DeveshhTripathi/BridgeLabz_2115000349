import java.util.Scanner;
public class CountString1a{
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of string");
        String str = sc.nextLine();
        int count=0;
        int len = str.length();
        for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O'
		|| str.charAt(i)=='U'){
                count++;
        }
        }
        System.out.println("Total number of vowels are " + count);
        System.out.println("Total number of consonants are " + (len-count));
  }
}
