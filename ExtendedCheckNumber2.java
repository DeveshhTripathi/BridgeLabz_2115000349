import java.util.Scanner;
public class ExtendedCheckNumber2{
    public static int countDigits(int number){
        int count = 0;
        while (number>0){
            number/=10;
            count++;
      }
      return count;
  }
  public static int[] storeDigits(int number, int count) {
      int[] digits = new int[count];
        for(int i=count-1;i>=0;i--){
            digits[i] = number % 10;
            number/=10;
      }
       return digits;
   }
    public static int[] reverseArray(int[] arr){
        int[] reversed=new int[arr.length];
        for (int i=0;i< arr.length;i++){
            reversed[i] = arr[arr.length-1-i];
        }
        return reversed;
    }
    public static boolean arraysAreEqual(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }
        for(int i=0;i<arr1.length;i++){
            if (arr1[i] != arr2[i]){
                return false;
          }
      }
      return true;
   }

   public static boolean isPalindrome(int[] original, int[] reversed) {
      return arraysAreEqual(original, reversed);
  }
    public static boolean isDuckNumber(int[] digits){
        for (int digit:digits){
            if(digit != 0) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
        int count = countDigits(number);
        int[] digits = storeDigits(number, count);
        int[] reversedDigits = reverseArray(digits);
        System.out.println("Is Palindrome: " + isPalindrome(digits, reversedDigits));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
    }
}
