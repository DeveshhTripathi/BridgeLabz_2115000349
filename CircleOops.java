import java.util.Scanner;
public class CircleOops{
	private double radius;
	public CircleOops(){
		this.radius = 3.5;
	}
	public CircleOops(double radius){
		this.radius = radius;
	}
	public void Output(){
	System.out.println("The radius of circle is "+radius);
	}
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the radius ");
 	double radius = sc.nextInt();
	CircleOops obj1 = new CircleOops();
	CircleOops obj2= new CircleOops(radius);
	obj2.Output();
	obj1.Output();
	}
}
