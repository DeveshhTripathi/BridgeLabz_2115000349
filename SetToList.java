import java.util.*;
public class SetToList{
    public static List<Integer> convertToSortedList(Set<Integer> set){
        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);
        return sortedList;
  }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        System.out.println("Enter the number of elements for the Set:");
        int n = sc.nextInt();
        System.out.println("Enter elements for the Set:");
        for (int i= 0;i < n;i++){
            set.add(sc.nextInt());
   }
        System.out.println("Sorted List: " + convertToSortedList(set));
  }
}
