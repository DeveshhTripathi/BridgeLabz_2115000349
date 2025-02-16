import java.io.*;
public class InputStreamReader1{
    public static void main(String[] args){
        String fileName = "example.txt";
        try{
            FileInputStream fileInputStream = new FileInputStream(fileName);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            while((line=bufferedReader.readLine()) != null){
                System.out.println(line);
            }
      }catch(IOException e){
            System.out.println("An error occurred: " + e.getMessage());
     }
  }
}
