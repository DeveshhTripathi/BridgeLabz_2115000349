public class DiscountedFee{
	public static void main(String Args[]){
	double fee = 125000;
	double discountPercent = 10;
	double totalDiscount = (discountPercent/100)*125000;
	double toPay = fee-totalDiscount;
	System.out.println("The discount amount is INR "+ totalDiscount + " and final discounted fee is INR " + toPay );
  }
}
