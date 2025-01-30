import java.util.Scanner;
public class Remove{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.print("Enter the character to remove");
        char charToRemove = sc.next().charAt(0);
        System.out.println("Modified String: " + removeCharacter(str, charToRemove));
    }
    public static String removeCharacter(String str, char charToRemove){
        return str.replaceAll(String.valueOf(charToRemove), "");
    }
}
