import java.util.*;
public class ElementFrequency{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list:");
        int n = sc.nextInt();
        sc.nextLine();
        List<String> list = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }
        Map<String, Integer> frequencyMap = getFrequency(list);

        System.out.println("Frequency of elements: " + frequencyMap);
 }
    public static Map<String, Integer> getFrequency(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for(String item:list){
            map.put(item, map.getOrDefault(item, 0)+1);
    }
        return map;
  }
}
