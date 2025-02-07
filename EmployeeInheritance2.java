class Employee{
	protected String name;
	protected int id;
	protected double salary;

	public Employee(String name , int id , double salary){
	this.name = name;
	this.id = id;
	this.salary = salary;
	}
	public void displayDetails(){
		System.out.println("Employee name = " + name + " id = " +id+ " and Salary = " + salary);
	}
}
class Manager extends Employee{
	private int teamSize;
	public Manager(String name , int id , double salary, int teamSize){
	super(name,id,salary);
	this.teamSize=teamSize;
	}
	public void displayDetails(){
	System.out.println("Employee name = " + name + " id = " +id+ " and Salary = " + salary + " total employee in team of manager= "+teamSize);
	}
}
class Developer extends Employee{
	private String programmingLanguage;
	public Developer(String name , int id , double salary, String programmingLanguage){
	super(name,id,salary);
	this.programmingLanguage = programmingLanguage;
	}
	 public void displayDetails(){
        System.out.println("Employee name = " + name + " id = " +id+ " and Salary = " + salary + " programming language used is = " + programmingLanguage);
        }
}
class Intern extends Employee{
	public Intern(String name , int id , double salary){
	super(name,id,salary);
	}
	public void displayDetails(){
	super.displayDetails();
	}
}
public class EmployeeInheritance2{
	public static void main(String args[]){
	Employee obj = new Employee("Rahul",123,500000);
	obj.displayDetails();
	Employee M1 = new Manager("Shiva" , 159 , 50000000 ,15);
	M1.displayDetails();
	Employee D1 = new Developer("Deep",125,250000,"Java");
	D1.displayDetails();
	Employee I1 = new Intern("Deep",111,15000);
	I1.displayDetails();
	}
}
