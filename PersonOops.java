import java.util.Scanner;
public class PersonOops{
	private String name;
	private double age;
	private double height;
	public PersonOops(String name,double age,double height){
	this.name = name;
	this.age = age;
	this.height=height;
	}
	public PersonOops(PersonOops s){
	this.name = s.name;
	this.age=s.age;
	this.height=s.height;
	}
	public void Display(){
	System.out.println("Name of person is "+name+" his age is " +age + " and height is " +height);
	}
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter name age and height of person repectively");
	String name = sc.nextLine();
	double age = sc.nextDouble();
	double height = sc.nextDouble();
	PersonOops show1 = new PersonOops(name,age,height);
	PersonOops show2 = new PersonOops(show1);
	show1.Display();
	show2.Display();
   }
}


