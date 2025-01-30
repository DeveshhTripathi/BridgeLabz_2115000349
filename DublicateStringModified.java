import java.util.Scanner;
public class DublicateStringModified{
    public static String removeDuplicates(String str){
        String result = "";
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (!isCharPresent(result, ch)){
                result += ch;
        }
    }
       return result;
  }
    public static boolean isCharPresent(String str, char ch){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ch){
                return true;
        }
    }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        String result=removeDuplicates(str);
        System.out.println(result);
    }
}
