import java.io.*;
public class CompareSB2{
    public static void main(String[] args){
        compareStringBuilderAndStringBuffer();
        compareFileReaderAndInputStreamReader("largefile.txt");
    }
    private static void compareStringBuilderAndStringBuffer(){
        String str = "hello";
        int iterations = 1_000_000;
        long startBuilder = System.nanoTime();
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < iterations; i++){
            sb1.append(str);
        }
        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;
        long startBuffer = System.nanoTime();
        StringBuffer sb2 = new StringBuffer();
        for (int i = 0; i < iterations; i++){
            sb2.append(str);
        }
        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;
        System.out.println("Time taken by StringBuilder: " + builderTime / 1_000_000 + " ms");
        System.out.println("Time taken by StringBuffer: " + bufferTime / 1_000_000 + " ms");
    }
    private static void compareFileReaderAndInputStreamReader(String fileName){
        try{
            long startFileReader = System.nanoTime();
            int wordCountFileReader = countWordsUsingFileReader(fileName);
            long endFileReader = System.nanoTime();
            long fileReaderTime = endFileReader - startFileReader;
            long startInputStreamReader = System.nanoTime();
            int wordCountInputStreamReader = countWordsUsingInputStreamReader(fileName);
            long endInputStreamReader = System.nanoTime();
            long inputStreamReaderTime = endInputStreamReader - startInputStreamReader;
            System.out.println("FileReader - Words: " + wordCountFileReader + ", Time: " + fileReaderTime / 1_000_000 + " ms");
            System.out.println("InputStreamReader - Words: " + wordCountInputStreamReader + ", Time: " + inputStreamReaderTime / 1_000_000 + " ms");
        }catch (IOException e){
            System.out.println("Error reading file: " + e.getMessage());
     }
 }
    private static int countWordsUsingFileReader(String fileName) throws IOException{
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int wordCount = countWords(bufferedReader);
        bufferedReader.close();
        return wordCount;
  }
    private static int countWordsUsingInputStreamReader(String fileName) throws IOException{
        FileInputStream fileInputStream = new FileInputStream(fileName);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int wordCount = countWords(bufferedReader);
        bufferedReader.close();
        return wordCount;
    }
    private static int countWords(BufferedReader bufferedReader) throws IOException{
        int wordCount = 0;
        String line;
        while ((line = bufferedReader.readLine()) != null){
            wordCount += line.split("\\s+").length;
   }
        return wordCount;
  }
}
