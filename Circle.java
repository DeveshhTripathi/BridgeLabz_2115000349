import java.util.Scanner;
public class Circle{
	private double radius;
	public Circle(double radius){
	this.radius = radius;
	}
	public void AreaOfCircle(){
		System.out.println("Area of circle is: " +(Math.PI*(radius*radius)));
	}
	public void CircumferenceOfCircle(){
		System.out.println("Circumference of circle is: "+ (2*Math.PI*radius));
	}
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter radius: ");
	double radius = sc.nextDouble();
	Circle calc = new Circle(radius);
	calc.AreaOfCircle();
	calc.CircumferenceOfCircle();
	}
}
