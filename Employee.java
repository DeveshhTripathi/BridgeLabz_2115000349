import java.util.Scanner;
class Employee{
    public int employeeID;
    protected String department;
    private double salary;
    public Employee(int employeeID, String department, double salary){
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
  }
    public void modifySalary(double newSalary){
        if (newSalary > 0){
            salary = newSalary;
            System.out.println("Salary updated to: " + salary);
        }else{
            System.out.println("Invalid salary amount.");
        }
    }
    public double getSalary(){
        return salary;
    }
    static class Manager extends Employee{
        public Manager(int employeeID, String department, double salary){
            super(employeeID, department, salary);
        }
        public void displayEmployeeDetails(){
            System.out.println("Employee ID: " + employeeID);
            System.out.println("Department: " + department);
   }
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int empID = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();
        System.out.print("Enter Salary: ");
        double sal = sc.nextDouble();
        Employee emp = new Employee(empID, dept, sal);
        Manager mgr = new Manager(empID, dept, sal);
        mgr.displayEmployeeDetails();
        System.out.print("Enter new salary: ");
        double newSalary = sc.nextDouble();
        emp.modifySalary(newSalary);
    }
}
