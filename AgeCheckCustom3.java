import java.util.Scanner;
class InvalidAgeException extends Exception{
    public InvalidAgeException(){
        super("Age must be 18 or above");
  }
}
public class AgeCheckCustom3{
    public static void validateAge(int age) throws InvalidAgeException{
        if (age < 18) throw new InvalidAgeException();
        System.out.println("Access granted!");
 }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Enter your age: ");
            validateAge(scanner.nextInt());
        }catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }finally{
            scanner.close();
   }
 }
}
