import java.util.Scanner;
public class FactorArray8{
       public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter a number ");
          int num = sc.nextInt();
          int maxFactor = 10;
          int[] factors = new int[maxFactor];
         int index = 0;
          for (int i=1;i<=num;i++){
           if (num%i==0){
          if(index==maxFactor){
              maxFactor *= 2;
              int[] temp = new int[maxFactor];
                System.arraycopy(factors, 0, temp, 0, factors.length);  //It is used to give copy the old array elements in new array
                factors = temp;		// This assigns the old array new size of new array i.e. temp 
          }
             factors[index] = i;
             index++;
      }
    }
       for(int i=0;i<index; i++){
         System.out.println("Factor of " +num+ " are "+factors[i]);
    }
  }
}

