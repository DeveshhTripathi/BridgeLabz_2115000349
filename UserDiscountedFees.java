import java.util.Scanner;
public class UserDiscountedFees{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	double fee = sc.nextDouble();
	double discount = sc.nextDouble();
	double totalDiscount = (discount/100) * fee;
	double toPay = fee - totalDiscount;
	System.out.println("The discount amount is INR "+ totalDiscount + " and final discounted fee is INR " + toPay);
 }
}
