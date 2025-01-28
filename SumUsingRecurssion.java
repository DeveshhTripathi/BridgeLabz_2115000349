import java.util.Scanner;
public class SumUsingRecurssion{
    public static int recursiveSum(int n){
        if(n==0){
           return 0;
      }else{
            return n + recursiveSum(n - 1);
      }
  }
    public static int formulaSum(int n) {
        return (n * (n + 1)) / 2;
   }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Enter a natural number");
            return;
        }
        int recursiveResult=recursiveSum(n);
        int formulaResult=formulaSum(n);
        System.out.println("Sum of " + n + " natural numbers using recursion: " + recursiveResult);
        System.out.println("Sum of " + n + " natural numbers using formula: " + formulaResult);
        if (recursiveResult==formulaResult) {
         System.out.println("Both results are equal.");
        } else {
         System.out.println("Results are not equal");
    }
  }
}
