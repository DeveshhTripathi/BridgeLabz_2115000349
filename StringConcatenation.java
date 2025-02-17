import java.util.*;
public class StringConcatenation{
    public static void main(String[] args){
        int N = 1000000;
      long sTime = System.nanoTime();
        String str = "";
       for (int i=0;i<N;i++){
            str += "a";
      }
       long eTime = System.nanoTime();
       System.out.println("String concatenation time: " + (eTime - sTime));     
       sTime = System.nanoTime();
       StringBuilder sb = new StringBuilder();
      for(int i=0;i<N;i++){
            sb.append("a");
        }
        eTime = System.nanoTime();
        System.out.println("StringBuilder concatenation time: " + (eTime - sTime));     
        sTime = System.nanoTime();
        StringBuffer sb1 = new StringBuffer();
        for (int i=0;i<N;i++){
            sb1.append("a");
        }
        eTime = System.nanoTime();
        System.out.println("StringBuffer concatenation time: " + (eTime-sTime));
    }
}
