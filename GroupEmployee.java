import java.util.*;
class Employee{
    String name;
    String department;
    public Employee(String name, String department){
        this.name = name;
        this.department = department;
 }
    public String toString(){
        return name;
 }
}
public class GroupEmployee{
    public static void main(String[] args){
        List<Employee> employees = Arrays.asList(
            new Employee("Rohan", "HR"),
            new Employee("Rahul", "IT"),
            new Employee("Jeet", "HR")
        );
        Map<String, List<Employee>> groupedByDept = new HashMap<>();
        for(Employee emp : employees){
            groupedByDept.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
     }
        System.out.println(groupedByDept);
  }
}
