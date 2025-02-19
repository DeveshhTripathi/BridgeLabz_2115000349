import java.util.*;
public class UnionInterSectionInSets{
    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
  }
    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
  }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        System.out.println("Enter the number of elements for Set1:");
        int n1 = sc.nextInt();
        System.out.println("Enter " + n1 + " elements for Set1:");
        for (int i = 0; i < n1; i++){
            set1.add(sc.nextInt());
   }
        System.out.println("Enter the number of elements for Set2:");
        int n2 = sc.nextInt();
        System.out.println("Enter " + n2 + " elements for Set2:");
        for (int i = 0; i < n2; i++){
            set2.add(sc.nextInt());
  }
        System.out.println("Union: " + union(set1, set2));
        System.out.println("Intersection: " + intersection(set1, set2));
  }
}
