import java.io.*;
public class LargeFileReader{
    public static void main(String[] args){
        String fileName = "large_log.txt";
        readLargeFile(fileName);
    }
    private static void readLargeFile(String fileName){
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = reader.readLine()) != null){
                if (line.toLowerCase().contains("error")){
                    System.out.println(line);
          }
     }
     }catch (IOException e){
            e.printStackTrace();
     }
  }
}
