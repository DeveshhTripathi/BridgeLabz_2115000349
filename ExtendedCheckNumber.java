import java.util.Scanner;
public class ExtendedCheckNumber{
    public static int countDigits(int number){
        int count = 0;
        while (number>0){
            number/=10;
            count++;
        }
        return count;
    }
    public static int[] storeDigits(int number, int count){
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--){
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
    public static int sumOfDigits(int[] digits){
        int sum = 0;
        for (int digit:digits){
            sum += digit;
        }
        return sum;
    }
    public static int sumOfSquares(int[] digits){
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
    public static boolean isHarshadNumber(int number, int sumOfDigits){
        return number%sumOfDigits==0;
    }
    public static int[][] findDigitFrequencies(int[] digits){
        int[][] frequencies=new int[10][2];
        for(int digit:digits){
            frequencies[digit][0] = digit; 
            frequencies[digit][1]++;       
        }
        return frequencies;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int count = countDigits(number);
        int[] digits = storeDigits(number, count);
        int sum = sumOfDigits(digits);
        int sumOfSquares = sumOfSquares(digits);
        System.out.println("Count of digits: " + count);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Sum of squares of digits: " + sumOfSquares);
        System.out.println("Is Harshad Number: " + isHarshadNumber(number, sum));
        System.out.println("Digit Frequencies:");
        int[][] frequencies=findDigitFrequencies(digits);
        for(int[] row:frequencies){
            if(row[1]>0){
                System.out.println(row[0] + ": " + row[1] + " times");
         }
      }
   }
}
