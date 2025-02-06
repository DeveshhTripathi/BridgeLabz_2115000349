import java.util.ArrayList;
class Company{
     String name;
     ArrayList<Department> departments;
    public Company(String name){
      this.name = name;
      this.departments = new ArrayList<>();
  }
  public void addDepartment(String deptName){
        departments.add(new Department(deptName));
  }
    public void showDepartments(){
        System.out.println("Company: " + name);
        for (Department dept : departments){
            dept.showEmployees();
     }
  }
}
class Department{
     String name;
     ArrayList<Employee> employees;
    public Department(String name){
        this.name = name;
        this.employees = new ArrayList<>();
  }
  public void addEmployee(String empName){
      employees.add(new Employee(empName));
  }
    public void showEmployees(){
        System.out.println("Department: " + name);
        for (Employee emp : employees){
            System.out.println("Employee: " + emp.getName());
    }
  }
}
class Employee{
  private String name;
  public Employee(String name){
        this.name = name;
    }
  public String getName(){
      return name;
    }
}
public class CompanyProgram3{
    public static void main(String[] args) {
        Company company = new Company("Capgemini");
        company.addDepartment("IT");
        company.addDepartment("HR");
        Department itDept = company.departments.get(0);
        itDept.addEmployee("Shiva");
        itDept.addEmployee("Rahul");
        Department hrDept = company.departments.get(1);
        hrDept.addEmployee("Deep");
        company.showDepartments();
    }
}
