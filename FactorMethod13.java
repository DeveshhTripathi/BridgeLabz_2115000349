import java.util.Scanner;
public class FactorMethod13{
    public static int[] findFactors(int number){
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors=new int[count];
        int index=0;
        for(int i = 1; i <= number; i++) {
            if(number%i==0) {
                factors[index++]=i;
            }
        }
        return factors;
 }
    public static int calculateSum(int[] factors){
        int sum=0;
        for (int factor:factors) {
            sum+=factor;
        }
        return sum;
    }
    public static long calculateProduct(int[] factors) {
        long product = 1;
        for (int factor:factors) {
            product*=factor;
        }
        return product;
    }
    public static double calculateSumOfSquares(int[] factors) {
        double sumOfSquares=0;
        for(int factor:factors){
            sumOfSquares+=Math.pow(factor,2);
      }
        return sumOfSquares;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        int number=sc.nextInt();
        int[] factors = findFactors(number);
        System.out.print("Factors of " + number + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        int sum = calculateSum(factors);
        long product = calculateProduct(factors);
        double sumOfSquares = calculateSumOfSquares(factors);
        System.out.println("Sum of factors: "+sum);
        System.out.println("Product of factors: "+product);
        System.out.println("Sum of squares of factors: "+sumOfSquares);
    }
}
 
