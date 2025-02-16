import java.util.*;
public class CompareSB{
	public static void main(String args[]){
	StringBuilder sb1 = new StringBuilder();
	StringBuffer sb2 = new StringBuffer();
	long startBuilder = System.nanoTime();
	String str = "Hello";
	for(int i=0;i<1000000;i++){
	   sb1.append(str);
	}
	long endBuilder = System.nanoTime();
        long builder = endBuilder - startBuilder;
	long startBuffer = System.nanoTime();
	for(int i=0;i<1000000;i++){
           sb2.append(str);
        }
	long endBuffer = System.nanoTime();
	long buffer = endBuffer - startBuffer;
	System.out.println("Time take by String Builder is : "+builder +"and time taken by string buffer is : "+buffer);
  }
}
