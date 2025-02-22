import java.util.regex.*;
import java.util.*;
public class ProgrammingLanguageExtractor{
    public static List<String> extractLanguages(String text){
        List<String> languages = new ArrayList<>();
        String regex = "\\b(JavaScript|Java|Python|C\\+\\+|C|C#|Go|Ruby|Swift|Kotlin|PHP|Rust|TypeScript)\\b";
        Matcher matcher = Pattern.compile(regex).matcher(text);
        while (matcher.find()){
            languages.add(matcher.group());
    }
        return languages;
  }
    public static void main(String[] args){
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        List<String> languages = extractLanguages(text);
        System.out.println(String.join(", ", languages));
 }
}
