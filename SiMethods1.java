import java.util.Scanner;
public class SiMethods1{
	public double SI(double Principle, double Rate , double Time){
		double si = (Principle*Rate*Time)/100;
		return si;
	}
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Principle");
	double Principle = sc.nextDouble();
	System.out.println("Enter the Rate");
	double Rate = sc.nextDouble();
	System.out.println("Enter the Time");
	double Time = sc.nextDouble();
	SiMethods1 obj = new SiMethods1();		
	double ans = obj.SI(Principle,Rate,Time);
	System.out.println("The amount of SI is " +ans);
  }
}

