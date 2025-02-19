import java.util.*;
public class RemoveDuplicatePreservingOrder{
    public static List<Integer> removeDuplicates(List<Integer> list){
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int num:list){
            if(!seen.contains(num)){
                seen.add(num);  
                result.add(num);
      }
   }
        return result;
 }
  public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for (int i=0;i < n;i++){
            list.add(sc.nextInt());
     }
        List<Integer> result = removeDuplicates(list);
        System.out.println("List after removing duplicates: " + result);
  }
}
