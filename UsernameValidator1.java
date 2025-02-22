import java.util.regex.*;
public class UsernameValidator1{
    public static boolean isValidUsername(String username){
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        return username.matches(regex);
  }
    public static void main(String[] args){
        System.out.println(isValidUsername("user_123"));
        System.out.println(isValidUsername("123user"));
        System.out.println(isValidUsername("us"));
        System.out.println(isValidUsername("valid_user1"));
        System.out.println(isValidUsername("user@name"));
        System.out.println(isValidUsername("username_is_too_long"));
  }
}
