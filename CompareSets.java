import java.util.*;
public class CompareSets{
    public static boolean areSetsEqual(Set<Integer> set1, Set<Integer> set2){
        if(set1.size()!=set2.size()){
            return false;
  }
        for(int num : set1){
            if(!set2.contains(num)){
                return false;
     }
 }
        return true;
 }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        System.out.println("Enter number of elements in Set1:");
        int n1 = sc.nextInt();
        System.out.println("Enter elements of Set1:");
        for (int i=0; i<n1 ;i++){
            set1.add(sc.nextInt());
  }
        System.out.println("Enter number of elements in Set2:");
        int n2 = sc.nextInt();
        System.out.println("Enter elements of Set2:");
        for (int i = 0; i < n2; i++){
            set2.add(sc.nextInt());
   }
        System.out.println("Are both sets equal? " + areSetsEqual(set1, set2));
  }
}
