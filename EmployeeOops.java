import java.util.Scanner;
public class EmployeeOops{
	protected String name;
	private int id;
	protected int salary;
	EmployeeOops(String name,int id , int salary){
	this.name = name;
	this.id =id;
	this.salary=salary;
	}
	public void employeeDetails(){
	System.out.println("The name of employee is: "+name+ " id is: "+id+ " and salary is: "+salary);
	}
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the name");
	String name = sc.nextLine();
	System.out.println("Enter id");
	int id = sc.nextInt();
	System.out.println("Enter Salary");
	int salary = sc.nextInt();
	EmployeeOops Detail = new EmployeeOops(name,id ,salary);
	Detail.employeeDetails();	
   }
}
