import java.util.Scanner;
public class Price{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	double unitPrice = sc.nextDouble();
	double quantity = sc.nextDouble();
	double totalPurchase = unitPrice * quantity;
	System.out.println("The total purchase price is INR "+ totalPurchase + "  if the quantity is " + quantity + " and unit price is INR " + unitPrice);
  }
}
