import java.io.*;
import java.util.*;
public class ImageToByteArray{
    public static void main(String[] args){
        String sourceImage = "source.jpg";
        String outputImage = "output.jpg";
        byte[] imageBytes = convertImageToByteArray(sourceImage);
        if(imageBytes != null){
            writeByteArrayToImage(imageBytes, outputImage);
            System.out.println("Image conversion and writing completed.");
            System.out.println("Verification: " + verifyFiles(sourceImage, outputImage));
    }
  }
    private static byte[] convertImageToByteArray(String imagePath){
        try(FileInputStream fis = new FileInputStream(imagePath);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()){
            byte[] buffer = new byte[4096];
            int bytesRead;
            while((bytesRead = fis.read(buffer)) != -1){
                baos.write(buffer, 0, bytesRead);
       }
       return baos.toByteArray();
        }catch(IOException e){
            e.printStackTrace();
   }
        return null;
 }
  private static void writeByteArrayToImage(byte[] imageBytes, String outputPath){
        try(ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(outputPath)){
            byte[] buffer = new byte[4096];
            int bytesRead;
            while((bytesRead = bais.read(buffer)) != -1){
                fos.write(buffer, 0, bytesRead);
         }
        }catch (IOException e){
            e.printStackTrace();
   }
 }
  private static boolean verifyFiles(String file1, String file2){
        try{
            byte[] original = convertImageToByteArray(file1);
            byte[] copied = convertImageToByteArray(file2);
            return Arrays.equals(original, copied);
        }catch (Exception e){
            e.printStackTrace();
            return false;
   }
  }
}
