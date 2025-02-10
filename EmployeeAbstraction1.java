import java.util.*;
abstract class Employee{
	private int employeeId;
	private String name;
	private int baseSalary;

	public Employee(int employeeId , String name , int baseSalary){
	this.employeeId = employeeId;
	this.name  = name;
	this.baseSalary = baseSalary;
	}

	abstract void calculateSalary();
	
	public void displayDetails(){
		System.out.println("Employee Id: "+employeeId);
		System.out.println("Name: "+name);
		System.out.println("Base Salary: "+baseSalary);
	}
	
	public int getemployeeId(){
		return employeeId;
	}
	public String getName(){
		return name;
	}
	public int getbaseSalary(){
                return baseSalary;
        }
}

interface Department{
        void assignDepartment(String dept);
	String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department{
	private String dept;
	public FullTimeEmployee(int employeeId , String name , int baseSalary){
		super(employeeId,name,baseSalary); 
	}
	 public void assignDepartment(String dept){
                this.dept = dept;
        }
        public String getDepartmentDetails(){
                return dept;
        }
	public void calculateSalary(){
		System.out.println("Employee " +getName() + "receives salary =" +getbaseSalary()+ " and is of department: "+getDepartmentDetails());
	}
}
class PartTimeEmployee extends Employee implements Department{
	private int time;
	private int money;
	private String dept;
	public PartTimeEmployee(int employeeId , String name , int baseSalary , int time , int money){
		super(employeeId,name,baseSalary);
		this.time=time;
		this.money=money;
	}
	public void assignDepartment(String dept){
		this.dept = dept;
	}
	public String getDepartmentDetails(){
		return dept;
	}
	public void calculateSalary(){
	int tot = time * money;
	System.out.println("Part time employee "+ getName()+ " gets :" +tot+ " rupess and is of department: "+getDepartmentDetails());

}
}
public class EmployeeAbstraction1{
	public static void main(String args[]){
	List<Employee> List = new ArrayList<>();
	FullTimeEmployee Full = new FullTimeEmployee(123,"Rahul",50000);
	Full.assignDepartment("HR");
	Full.calculateSalary();
	PartTimeEmployee Part = new PartTimeEmployee(111,"Rohan",0,5,500);
	Part.assignDepartment("Management");
	Part.calculateSalary();
	List.add(Full);
	List.add(Part);
	for(Employee val : List){
		val.displayDetails();
	}
	}
}
