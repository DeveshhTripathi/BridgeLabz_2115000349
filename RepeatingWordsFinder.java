import java.util.*;
import java.util.regex.*;
public class RepeatingWordsFinder{
    public static Set<String> findRepeatingWords(String text){
        Set<String> words = new HashSet<>();
        Set<String> repeatingWords = new HashSet<>();
        String regex = "\\b(\\w+)\\b";
        Matcher matcher = Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(text);
        while (matcher.find()){
            String word = matcher.group().toLowerCase();
            if (!words.add(word)) {
                repeatingWords.add(word);
         }
      }
        return repeatingWords;
  }
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        Set<String> repeatingWords = findRepeatingWords(text);
        System.out.println(String.join(", ", repeatingWords));
    }
}
