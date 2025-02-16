import java.io.*;
public class InputStreamReader2{
    public static void main(String[] args){
        String fileName = "output.txt";
        try{
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            FileWriter fileWriter = new FileWriter(fileName);
            System.out.println("Enter text (type 'exit' to stop):");
            String line;
            while(!(line = bufferedReader.readLine()).equalsIgnoreCase("exit")){
                fileWriter.write(line + "\n");
         }
          System.out.println("User input has been saved to " + fileName);
      }catch (IOException e){
            System.out.println("An error occurred: " + e.getMessage());
     }
  }
}
