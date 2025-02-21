import java.io.*;
public class PipedStream{
    public static void main(String[] args){
        try{
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);
            Thread writerThread = new Thread(new WriterTask(pos));
            Thread readerThread = new Thread(new ReaderTask(pis));
            writerThread.start();
            readerThread.start();
            writerThread.join();
            readerThread.join();
        }catch (IOException | InterruptedException e){
         e.printStackTrace();
     }
  }
}
class WriterTask implements Runnable{
    private final PipedOutputStream pos;
    public WriterTask(PipedOutputStream pos){
        this.pos = pos;
    }
    public void run(){
        try(pos){
            String message = "Hello from Writer Thread!";
            pos.write(message.getBytes());
            System.out.println("Writer: Message sent.");
     }catch (IOException e){
            e.printStackTrace();
    }
  }
}
class ReaderTask implements Runnable{
    private final PipedInputStream pis;
    public ReaderTask(PipedInputStream pis){
        this.pis = pis;
    }
    public void run(){
        try(pis){
            byte[] buffer = new byte[1024];
            int bytesRead = pis.read(buffer);
            String receivedMessage = new String(buffer, 0, bytesRead);
            System.out.println("Reader: Received - " + receivedMessage);
        }catch (IOException e){
            e.printStackTrace();
     }
  }
}
