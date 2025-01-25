import java.util.Scanner;
public class LargestAndSecondLargestArray13{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;
        while(num!=0){
            if (index == maxDigits) {
                break;                // Here it stops if array is full
        }
            digits[index] = num%10;
            num /= 10;
            index++;
     }
        int largest = 0;
        int secondLargest = 0;
        for (int i=0;i<index;i++){
            if (digits[i] > largest){
                secondLargest = largest;
                largest = digits[i];
         } else if(digits[i]>secondLargest && digits[i]<largest) {
                secondLargest=digits[i];
         }
     }
        System.out.println("The largest digit is " + largest);
        System.out.println("The second largest digit is " + secondLargest);
    }
}
