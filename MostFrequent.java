import java.util.Scanner;
public class MostFrequent{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str = sc.nextLine();
        System.out.println("Most Frequent Character: " + findMostFrequentChar(str));
  }
    public static char findMostFrequentChar(String str) {
        int[] freq = new int[256];
        char maxChar = str.charAt(0);
        int maxCount = 0;
        for (char ch : str.toCharArray()){
            freq[ch]++;
            if (freq[ch]>maxCount) {
                maxCount = freq[ch];
                maxChar = ch;
         }
     }
      return maxChar;
  }
}
