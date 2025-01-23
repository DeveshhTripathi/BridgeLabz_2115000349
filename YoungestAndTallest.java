import java.util.Scanner;
public class YoungestAndTallest{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
       System.out.print("Enter Amar's age ");
        int amarAge = sc.nextInt();
       System.out.print("Enter Akbar's age ");
       int akbarAge = sc.nextInt();
       System.out.print("Enter Anthony's age ");
       int anthonyAge = sc.nextInt();

       System.out.print("Enter Amar's height");
       double amarHeight = sc.nextDouble();
       System.out.print("Enter Akbar's height ");
       double akbarHeight = sc.nextDouble();
      System.out.print("Enter Anthony's height");
       double anthonyHeight = sc.nextDouble();

        int youngAge = Math.min(Math.min(amarAge, akbarAge), anthonyAge);
        String youngest;
        if(youngAge == amarAge) {
            youngest = "Amar";
        }else if(youngAge == akbarAge) {
            youngest = "Akbar";
        }else{
           youngest = "Anthony";
        }

        double tallHeight = Math.max(Math.max(amarHeight, akbarHeight), anthonyHeight);
        String tallest;
        if (tallHeight == amarHeight) {
            tallest = "Amar";
        } else if (tallHeight == akbarHeight) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }

        System.out.println("Youngest friend is"+youngest + " and tallest friend is " + tallest);
    }
}
