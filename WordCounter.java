import java.io.*;
import java.util.*;
public class WordCounter{
    public static void main(String[] args){
       String fileName = "input.txt";
      Map<String, Integer> wordCount = new HashMap<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
      String line;
        while((line=reader.readLine()) != null){
            String[] words = line.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "").split("\\s+");
          for(String word : words){
             if(!word.isEmpty()){
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
     }
    }
 }
     }catch(IOException e){
        System.out.println("Error reading file: " + e.getMessage());
      }
      System.out.println("Word Frequency: " + wordCount);
  }
}
