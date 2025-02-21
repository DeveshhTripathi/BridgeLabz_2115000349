import java.io.*;
public class CopyFile2{
    private static final int BUFFER_SIZE = 4096;
    public static void main(String[] args){
        String sourceFile = "source.txt";
        String destBuffered = "buffered_copy.txt";
        String destUnbuffered = "unbuffered_copy.txt";
        long bufferedTime = copyWithBufferedStream(sourceFile, destBuffered);
        System.out.println("Buffered Stream Time: " + bufferedTime + " ns");
        long unbufferedTime = copyWithUnbufferedStream(sourceFile, destUnbuffered);
        System.out.println("Unbuffered Stream Time: " + unbufferedTime + " ns");
        System.out.println("\nBuffered is " + (unbufferedTime / (double) bufferedTime) + " times faster than unbuffered.");
    }
    private static long copyWithBufferedStream(String source, String destination){
        long startTime = System.nanoTime();
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))){
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while((bytesRead = bis.read(buffer)) != -1){
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return System.nanoTime() - startTime;
  }
    private static long copyWithUnbufferedStream(String source, String destination){
        long startTime = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)){
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while((bytesRead = fis.read(buffer)) != -1){
                fos.write(buffer, 0, bytesRead);
         }
     }catch (IOException e){
            e.printStackTrace();
    }
        return System.nanoTime() - startTime;
 }
}

