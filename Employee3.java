import java.util.Scanner;
public class Employee3{
	private static String companyName = "Capgemini";
	private static int totalCount = 0;
	private String name;
	private final int id;
	private String designation;
	Employee3(String name,int id,String designation){
		this.name = name;
		this.id = id;
		this.designation = designation;
		totalCount++;
	}
	public static void totalEmployee(){
		System.out.println("Total number of employee are "+totalCount);
	}
	public void employeeDetails(){
	System.out.println("Name of company is "+companyName);
	System.out.println("Name of employee is "+name);
	System.out.println("Id is "+id);
        System.out.println("Designation is "+designation);	
	}
	public static void main(String args[]){
	Employee3 obj1 = new Employee3("Shiva",111,"Manager");
	Employee3 obj2 = new Employee3("Aqwe",112,"Accountant");
	obj1.employeeDetails();
	obj2.employeeDetails();
	Employee3.totalEmployee();
	}
}
