import java.util.*;
import java.util.Queue;
public class ReverseQueue{
    public static void reverseQueue(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.poll());
     }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
    }
  }
  public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Original Queue: " + queue);
        reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);
    }
}

