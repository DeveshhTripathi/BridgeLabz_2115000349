import java.util.Scanner;
public class LexicoGraphical{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string ");
        String str1 = sc.nextLine();
        System.out.println("Enter second string ");
        String str2 = sc.nextLine();
        System.out.println(compareStrings(str1, str2));
    }
    public static String compareStrings(String str1, String str2){
        int len = Math.min(str1.length(), str2.length());
        for (int i=0;i<len;i++){
            if (str1.charAt(i) < str2.charAt(i)) return str1 + " comes before " + str2;
            if (str1.charAt(i) > str2.charAt(i)) return  str1 + " comes after " + str2;
        }
        if (str1.length() < str2.length()) return str1 + " comes before " + str2 ;
        if (str1.length() > str2.length()) return str1 + " comes after " + str2 ;
        return "Both strings are equal";
    }
}
