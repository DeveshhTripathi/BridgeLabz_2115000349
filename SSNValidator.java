import java.util.regex.*;
public class SSNValidator{
    public static boolean isValidSSN(String ssn){
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        return ssn.matches(regex);
  }
    public static void main(String[] args){
        System.out.println("\"123-45-6789\" is " + (isValidSSN("123-45-6789") ? "valid" : "invalid"));
        System.out.println("\"123456789\" is " + (isValidSSN("123456789") ? "valid" : "invalid"));
        System.out.println("\"12-345-6789\" is " + (isValidSSN("12-345-6789") ? "valid" : "invalid"));
        System.out.println("\"123-456-789\" is " + (isValidSSN("123-456-789") ? "valid" : "invalid"));
 }
}
