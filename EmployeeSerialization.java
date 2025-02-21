import java.io.*;
import java.util.*;
class Employee implements Serializable{
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String department;
    private double salary;
    public Employee(int id, String name, String department, double salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
  }
    public void display(){
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary);
 }
}
public class EmployeeSerialization{
    private static final String FILE_NAME = "employees.ser";
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", "HR", 50000));
        employees.add(new Employee(102, "Bob", "IT", 60000));
        employees.add(new Employee(103, "Charlie", "Finance", 55000));
        serializeEmployees(employees);
        deserializeEmployees();
  }
   private static void serializeEmployees(List<Employee> employees){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))){
            oos.writeObject(employees);
            System.out.println("Employees have been serialized.");
        }catch (IOException e){
            e.printStackTrace();
   }
 }
    private static void deserializeEmployees(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))){
            List<Employee> employees = (List<Employee>) ois.readObject();
            System.out.println("Deserialized Employees:");
            for (Employee emp : employees){
                emp.display();
      }
   } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
   }
 }
}
