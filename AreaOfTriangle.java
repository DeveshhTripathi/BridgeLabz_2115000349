import java.util.Scanner;
public class AreaOfTriangle{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	double base = sc.nextDouble();
	double height = sc.nextDouble();
	double area = ((double)1/2) * base * height;
	System.out.println("Area of Triangle is "+ area);
  }
}
