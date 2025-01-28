import java.util.Scanner;
public class CompareMethod19{
    public static String findYoungest(String[] names, int[] ages){
        int youngestIndex=0;
        for (int i=1;i<ages.length;i++){
            if(ages[i]<ages[youngestIndex]){
                youngestIndex=i;
          }
      }
        return names[youngestIndex];
  }

  public static String findTallest(String[] names, double[] heights){
      int tallestIndex = 0;
      for(int i=1;i<heights.length;i++){
            if(heights[i]>heights[tallestIndex]){
                tallestIndex=i;
       }
    }
        return names[tallestIndex];
 }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] names={"Amar", "Akbar", "Anthony"};
        int[] ages=new int[3];
        double[] heights=new double[3];
        for (int i=0;i<3;i++){
         System.out.println("Enter the age of " + names[i]);
         ages[i]=sc.nextInt();
         System.out.println("Enter the height of " + names[i]);
         heights[i]=sc.nextDouble();
     }
      String youngest = findYoungest(names, ages);
      String tallest = findTallest(names, heights);
      System.out.println("The youngest friend is: " +youngest);
      System.out.println("The tallest friend is: " +tallest);
  }
}
