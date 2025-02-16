import java.io.*;
public class ReadFile2{
    public static void main(String[] args){
        String fileName = "ActualPathOfFIle.txt";  //Give actual path of the file.
        String targetWord = "Java";
        int wordCount = 0;
        try{
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while((line = bufferedReader.readLine()) != null){
                String[] words=line.split("\\s+");
                for(String word : words){
                    if(word.equals(targetWord)){
                        wordCount++;
          }
       }
   } 
            System.out.println("The word '" + targetWord + "' appears " + wordCount + " times in the file.");
        }catch(IOException e){
            System.out.println("An error occurred while reading the file: " + e.getMessage());
     }
  }
}
