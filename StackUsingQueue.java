import java.util.LinkedList;
import java.util.Queue;
class StackUsingQueue{
    private Queue<Integer> queue1 = new LinkedList<>();
    private Queue<Integer> queue2 = new LinkedList<>();
    public void push(int x){
        queue1.add(x);
  }
    public int pop(){
        if(queue1.isEmpty()){
            throw new RuntimeException("Stack is empty");
  }
        while (queue1.size() > 1){
            queue2.add(queue1.poll());
        }
        int removed = queue1.poll();
        swapQueues();
        return removed;
  }
    public int top(){
        if(queue1.isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        while(queue1.size() > 1){
            queue2.add(queue1.poll());
        }
        int topElement = queue1.peek();
        queue2.add(queue1.poll());
        swapQueues();
        return topElement;
 }
    public boolean isEmpty(){
        return queue1.isEmpty();
    }
    private void swapQueues(){
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
  }
    public static void main(String[] args){
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top: " + stack.top());  
        System.out.println("Popped: " + stack.pop()); 
        System.out.println("Popped: " + stack.pop());
  }
}
