import java.util.*;
public class RandomMethod23{
    public static int[] RandomArray(int size){
        int[] randomNumbers=new int[size];
        for (int i=0;i<size;i++) {
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return randomNumbers;
    }
    public static double[] findAverageMinMax(int[] numbers) {
        double sum=0;
        int min=numbers[0];
        int max=numbers[0];
        for (int num:numbers){
            sum+=num;
            min=Math.min(min, num);
            max=Math.max(max, num);
        }
      double average = sum/numbers.length;
      return new double[]{average, min, max};
  }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of 4-digit random values to generate: ");
        int size = sc.nextInt();
        int[] randomNumbers = RandomArray(size);
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));
        double[] stats = findAverageMinMax(randomNumbers);
        System.out.println("Average: " + stats[0]);
        System.out.println("Minimum: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
        sc.close();
    }
}
