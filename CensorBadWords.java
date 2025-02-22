import java.util.*;
public class CensorBadWords{
    public static String censorText(String text, List<String> badWords){
        for(String word : badWords){
            text = text.replaceAll("(?i)\\b" + word + "\\b", "****");
      }
        return text;
  }
    public static void main(String[] args){
        String input = "This is a damn bad example with some stupid words.";
        List<String> badWords = Arrays.asList("damn", "stupid");
        String output = censorText(input, badWords);
        System.out.println(output);
    }
}
