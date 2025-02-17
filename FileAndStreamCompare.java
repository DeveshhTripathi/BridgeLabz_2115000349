import java.io.*;
public class FileAndStreamCompare{
    public static void main(String[] args){
        String filePath = "hello.txt";  // Path tp our file
        long fileReaderBufferedTime = measureFileReaderBufferedTime(filePath);
        System.out.println("FileReader with BufferedReader Time: " + fileReaderBufferedTime + " ms");
        long inputStreamReaderBufferedTime = measureInputStreamReaderBufferedTime(filePath);
        System.out.println("InputStreamReader with BufferedReader Time: " + inputStreamReaderBufferedTime + " ms");
    }
    public static long measureFileReaderBufferedTime(String filePath){
        long startTime = System.currentTimeMillis();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = bufferedReader.readLine()) != null){}
      }catch(IOException e){
          e.printStackTrace();
      }
        return System.currentTimeMillis() - startTime;
 }
 public static long measureInputStreamReaderBufferedTime(String filePath){
        long startTime = System.currentTimeMillis();
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)))){
            String line;
            while((line = bufferedReader.readLine())!=null){}
     }catch(IOException e){
          e.printStackTrace();
      }
        return System.currentTimeMillis()-startTime;
  }
}
