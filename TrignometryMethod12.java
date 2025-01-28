import java.util.Scanner;
public class TrignometryMethod12{
    	public double[] Calc(double angle){
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[] {sine, cosine, tangent};
    	}
    	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
      	System.out.println("Enter the angle");
        double angle=sc.nextDouble();
	TrignometryMethod12 obj=new TrignometryMethod12();
        double[] results=obj.Calc(angle);
        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);
  }
}
