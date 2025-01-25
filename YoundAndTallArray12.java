import java.util.Scanner;
public class YoungAndTallArray12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] ages=new int[3];
        int[] heights=new int[3];
        for (int i=0;i<3;i++) {
            System.out.println("Enter the age of friend " + (i + 1));
            ages[i] = sc.nextInt();
            System.out.println("Enter the height of friend " + (i + 1));
            heights[i] = sc.nextInt();
        }
        int youngIndex = 0;
        int tallIndex = 0;
        for (int i=1;i<3;i++) {
            if(ages[i]<ages[youngIndex]){
                youngIndex = i;
        }
         if (heights[i] > heights[tallIndex]) {
              tallIndex = i;
         }
     }
        System.out.println("The youngest friend is: Friend " + (youngIndex + 1) + " with age: " + ages[youngIndex]);
        System.out.println("The tallest friend is: Friend " + (tallIndex + 1) + " with height: " + heights[tallIndex]);
    }
}
