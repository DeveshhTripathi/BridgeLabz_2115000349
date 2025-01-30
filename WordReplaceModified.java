import java.util.Scanner;
public class WordReplaceModified{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = sc.nextLine();
        System.out.println("Enter the word to replace");
        String oldWord = sc.nextLine();
        System.out.println("Enter the new word");
        String newWord = sc.nextLine();
        System.out.println("Modified Sentence " + replaceWord(sentence, oldWord, newWord));
    }
    public static String replaceWord(String sentence, String oldWord, String newWord){
        String result = "";
        String[] words = sentence.split(" ");
        for (int i=0;i<words.length;i++){
          if (words[i].equalsIgnoreCase(oldWord)){
             result += newWord;
         }else{
              result += words[i];
          }
        if(i<words.length-1){
             result+=" ";
        }
     }
    return result;
  }
}
