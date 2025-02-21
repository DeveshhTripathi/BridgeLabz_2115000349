import java.io.*;
public class UpperToLowerCase{
    public static void main(String[] args){
      String sourceFile = "input.txt";
      String destFile = "output.txt";
     try(BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
          BufferedWriter writer = new BufferedWriter(new FileWriter(destFile))){
          String line;
            while((line = reader.readLine()) != null){
              writer.write(line.toLowerCase());
              writer.newLine();
          }
     }catch (IOException e){
         e.printStackTrace();
    }
 }
}
