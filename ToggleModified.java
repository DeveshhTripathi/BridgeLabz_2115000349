import java.util.Scanner;
public class ToggleModified{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string");
      String str = sc.nextLine();
      System.out.println("Toggled case of given string is: " + toggleCase(str));
    }
    public static String toggleCase(String str){
        String result = "";
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                result += Character.toLowerCase(ch);
            }else if(Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            }else{
                result += ch;
         }
     }
        return result;
    }
}
