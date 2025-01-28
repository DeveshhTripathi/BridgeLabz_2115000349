import java.util.Scanner;
public class CheckNumber{
    public static int countDigits(int number){
        int count = 0;
        while(number>0){
            number/=10;
            count++;
        }
        return count;
    }
    public static int[] storeDigits(int number, int count){
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--){
            digits[i]=number%10;
            number/=10;
        }
        return digits;
    }
    public static boolean isDuckNumber(int[] digits){
        for (int digit:digits){
            if (digit!=0){
                return true;
        }
      }
     return false;
  }
    public static boolean isArmstrongNumber(int number, int[] digits, int count){
        int sum = 0;
        for(int digit:digits){
            sum+=Math.pow(digit, count);
        }
        return sum == number;
    }
    public static int findLargest(int[] digits){
        int largest = Integer.MIN_VALUE;
        for (int digit:digits){
            if (digit>largest){
                largest=digit;
            }
        }
        return largest;
    }
    public static int findSecondLargest(int[] digits){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for (int digit:digits) {
            if (digit>largest) {
                secondLargest=largest;
                largest=digit;
            }else if(digit > secondLargest && digit != largest) {
                secondLargest = digit;
          }
     }
        return secondLargest;
   }
    public static int findSmallest(int[] digits){
        int smallest=Integer.MAX_VALUE;
        for (int digit:digits){
            if (digit<smallest){
                smallest=digit;
         }
     }
        return smallest;
    }
    public static int findSecondSmallest(int[] digits){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit:digits){
            if (digit<smallest){
                secondSmallest = smallest;
                smallest = digit;
            }else if(digit < secondSmallest && digit != smallest){
                secondSmallest = digit;
            }
        }
        return secondSmallest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int count = countDigits(number);
        int[] digits = storeDigits(number, count);
        System.out.println("Count of digits: " +count);
        System.out.println("Is Duck Number: " +isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " +isArmstrongNumber(number, digits, count));
        System.out.println("Largest digit: " + findLargest(digits));
        System.out.println("Second Largest digit: " + findSecondLargest(digits));
        System.out.println("Smallest digit: " + findSmallest(digits));
        System.out.println("Second Smallest digit: "+findSecondSmallest(digits));
  }
}
