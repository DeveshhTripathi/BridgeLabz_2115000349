import java.util.*;
class Patient{
    String name;
    int severity;
    public Patient(String name, int severity){
        this.name = name;
        this.severity = severity;
 }
}
public class HospitalTriage{
    public static void main(String[] args){
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>((a, b) -> Integer.compare(b.severity, a.severity));
        triageQueue.add(new Patient("John", 3));
        triageQueue.add(new Patient("Alice", 5));
        triageQueue.add(new Patient("Bob", 2));
        System.out.println("Treatment Order:");
        while(!triageQueue.isEmpty()){
            System.out.println(triageQueue.poll().name);
    }
 }
}
