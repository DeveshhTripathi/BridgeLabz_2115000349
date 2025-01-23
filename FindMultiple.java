import java.util.Scanner;
public class FindMultiple{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ");
        int number = sc.nextInt();
        System.out.println("Multiples of " + number + " are ");
        for (int i = 100; i >= 1; i--) { 
            if (i % number == 0) {
                System.out.println(i); 
     }
   }
 }
}
