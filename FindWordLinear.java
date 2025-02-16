import java.util.Scanner;
public class FindWordLinear{
    public static String linearSearch(String[] sentences, String target){
        for (String sentence:sentences){
            if(sentence.contains(target)){
                return sentence;  
        }
    }
        return "Not Found";
  }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sentences:");
        int n = sc.nextInt();
        sc.nextLine(); 
        String[] sentences = new String[n];
        System.out.println("Enter the sentences:");
        for (int i=0;i<n;i++){
            sentences[i] = sc.nextLine();
        }
        System.out.println("Enter the word to search:");
        String target = sc.next();
        String result = linearSearch(sentences,target);
        System.out.println("Result: " + result);
        sc.close();
    }
}

