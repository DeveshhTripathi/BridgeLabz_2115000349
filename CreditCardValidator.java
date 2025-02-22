import java.util.regex.*;
public class CreditCardValidator{
    public static boolean isValidCreditCard(String cardNumber){
        String regex = "^(4\\d{15}|5\\d{15})$";
        return cardNumber.matches(regex);
  }
    public static void main(String[] args){
        System.out.println(isValidCreditCard("4111111111111111"));
        System.out.println(isValidCreditCard("5111111111111111"));
        System.out.println(isValidCreditCard("6111111111111111"));
        System.out.println(isValidCreditCard("4222222222222"));
        System.out.println(isValidCreditCard("5000000000000000"));
  }
}
