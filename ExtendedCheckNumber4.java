import java.util.*;
public class ExtendedCheckNumber4{
    public static int[] findFactors(int number){
        List<Integer> factorsList=new ArrayList<>();
        for (int i=1;i<=number/2;i++){
            if (number % i == 0) {
                factorsList.add(i);
            }
        }
        int[] factors = new int[factorsList.size()];
        for (int i =0;i<factorsList.size();i++){
            factors[i] = factorsList.get(i);
        }
        return factors;
    }
    public static int findGreatestFactor(int[] factors){
        int greatest = 0;
        for(int factor : factors){
            if(factor > greatest){
                greatest = factor;
          }
      }
      return greatest;
    }

    public static int sumOfFactors(int[] factors){
        int sum = 0;
        for (int factor:factors){
            sum+=factor;
      }
      return sum;
  }
    public static int productOfFactors(int[] factors){
        int product = 1;
        for(int factor:factors){
            product*=factor;
      }
      return product;
 }
    public static int productOfCubesOfFactors(int[] factors){
        int product=1;
        for(int factor:factors){
            product*=Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int number, int sumOfFactors){
        return number == sumOfFactors;
    }
    public static boolean isAbundantNumber(int number, int sumOfFactors){
        return number < sumOfFactors;
    }
    public static boolean isDeficientNumber(int number, int sumOfFactors){
        return number>sumOfFactors;
    }
    public static boolean isStrongNumber(int number){
        int temp = number;
        int sum = 0;
        while(temp>0){
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static int factorial(int n){
        if (n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] factors = findFactors(number);
        int sumOfFactors = sumOfFactors(factors);
        System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors);
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productOfCubesOfFactors(factors));
        System.out.println("Is Perfect: " + isPerfectNumber(number, sumOfFactors));
        System.out.println("Is Abundant: " + isAbundantNumber(number, sumOfFactors));
        System.out.println("Is Deficient: " + isDeficientNumber(number, sumOfFactors));
        System.out.println("Is Strong: " + isStrongNumber(number));
    }
}
