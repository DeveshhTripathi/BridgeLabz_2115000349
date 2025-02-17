import java.util.*;
public class CompareDataStructures{
    public static void main(String[] args){
        int[] array = new int[1000000];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i=0;i<1000000;i++){
            int value=i;
            array[i]=value;
            hashSet.add(value);
            treeSet.add(value);
    }
        int searchElement=999999;
        long startTime=System.nanoTime();
        boolean foundInArray=linearSearch(array, searchElement);
        long endTime=System.nanoTime();
        long arrayTime=endTime - startTime;
        startTime = System.nanoTime();
        boolean foundInHashSet = hashSet.contains(searchElement);
        endTime = System.nanoTime();
        long hashSetTime = endTime - startTime;
        startTime = System.nanoTime();
        boolean foundInTreeSet = treeSet.contains(searchElement);
        endTime = System.nanoTime();
        long treeSetTime = endTime - startTime;
        System.out.println("Array Search Time: " + arrayTime + " nanoseconds");
        System.out.println("HashSet Search Time: " + hashSetTime + " nanoseconds");
        System.out.println("TreeSet Search Time: " + treeSetTime + " nanoseconds");
    }
    // Linear search for array
    public static boolean linearSearch(int[] array, int element){
        for(int i : array){
            if(i==element){
                return true;
         }
    }
     return false;
    }
}
