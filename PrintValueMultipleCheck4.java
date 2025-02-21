import java.util.Scanner;
public class PrintValueMultipleCheck4{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     Integer[] numbers = {10, 20, 30, 40, 50};
      try{
          System.out.print("Enter index to retrieve value: ");
           int index = sc.nextInt();
           System.out.println("Value is : " + numbers[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index!");
        }catch(NullPointerException e){
            System.out.println("Array is not initialized");
        }catch(Exception e){
            System.out.println("Enter valid number.");
        }
    }
}

