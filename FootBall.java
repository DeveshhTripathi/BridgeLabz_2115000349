import java.util.Random;
public class FootBall{
    public static void main(String[] args){
        int[] heights=new int[11];
        Random r=new Random();
        for(int i=0;i<heights.length;i++){
            heights[i] = r.nextInt(101) + 150;
        }
        int sum=sumOfHeights(heights);
        double mean=calculateMean(heights, sum);
        int shortest=findShortest(heights);
        int tallest=findTallest(heights);
        System.out.println("Shortest height: " + shortest);
        System.out.println("Tallest height: " + tallest);
        System.out.println("Mean height: " + mean);
    }
    public static int sumOfHeights(int[] heights){
        int sum = 0;
        for (int height:heights){
            sum += height;
        }
        return sum;
    }
    public static double calculateMean(int[] heights, int sum){
        return (double) sum/heights.length;
    }
    public static int findShortest(int[] heights) {
        int shortest=heights[0];
        for(int height:heights){
            if (height<shortest){
                shortest=height;
          }
     }
        return shortest;
    }
  public static int findTallest(int[] heights){
        int tallest = heights[0];
        for(int height:heights){
            if(height>tallest){
                tallest=height;
         }
     }
     return tallest;
  }
}
