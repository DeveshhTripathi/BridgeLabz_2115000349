import java.util.*;
public class NthElement{
    public static String findNthFromEnd(LinkedList<String> list, int N){
        Iterator<String> fast = list.iterator();
        Iterator<String> slow = list.iterator();
        for (int i = 0; i < N; i++){
            if(fast.hasNext()){
                fast.next();
            }else{
                return "Invalid N (larger than list size)";
   }
  }
        while (fast.hasNext()){
            fast.next();
            slow.next();
   }
        return slow.next();
 }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the elements:");
        for(int i = 0;i < n;i++){
            list.add(sc.nextLine());
    }
        System.out.println("Enter N (position from the end):");
        int N = sc.nextInt();
        String result = findNthFromEnd(list, N);
        System.out.println("Nth element from the end: " + result);
  }
}
