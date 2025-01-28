import java.util.Scanner;
public class PovNegMethod20{
    public static boolean isPositive(int number){
        return number >= 0;
    }
    public static boolean isEven(int number){
        return number % 2 == 0;
    }
    public static int compare(int number1, int number2){
        if (number1 > number2){
            return 1;
      } else if (number1 == number2){
            return 0;
      } else{
            return -1;
      }
  }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] num=new int[5];

        for (int i=0; i<num.length;i++){
            System.out.println("Enter number " + (i + 1));
            num[i] = sc.nextInt();
        }
        for(int i=0;i<num.length;i++){
            if (isPositive(num[i])){
                if(isEven(num[i])) {
                    System.out.println("Number " + num[i] + " is positive and even.");
                }else{
                    System.out.println("Number " + num[i] + " is positive and odd.");
                }
            } else {
                System.out.println("Number " + num[i] + " is negative.");
            }
        }
        int comparisonResult = compare(num[0], num[num.length-1]);
        if(comparisonResult==1){
            System.out.println("The first element is greater than the last element");
        }else if(comparisonResult==0){
            System.out.println("The first and last elements are equal");
        }else{
            System.out.println("The first element is less than the last element");
     }
  }
}
