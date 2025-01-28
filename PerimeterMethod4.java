import java.util.Scanner;
public class PerimeterMethod4{
	public double Perimeter(double a,double b,double c,double distance){
	double perimeter = a+b+c;
	double dist = distance*1000;
	double rounds = Math.ceil(dist/perimeter);
	return rounds;
  }
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter all three sides one by one in meter");
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	double c = sc.nextDouble();
	double distance= 5.0;
	PerimeterMethod4 obj = new PerimeterMethod4();
	double ans = obj.Perimeter(a, b, c, distance);
	System.out.println("Total rounds needed are " +ans);
  }
}
