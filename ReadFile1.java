import java.io.*;
public class ReadFile1{
    public static void main(String[] args){
        String fileName = "HelloWorld.txt";
        try{
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while((line=bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("Error occurred " + e.getMessage());
    }
  }
}
