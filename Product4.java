public class Product4{
	private static double discount=0;
	private static double priceAfter=0;
	private String productName;
	private double price;
	private int quantity;
	private final int productID;
	Product4(String productName,int productID,double price,int quantity){
	this.productName = productName;
	this.productID= productID;
	this.price = price;
	this.quantity = quantity;
	}
	public static void updateDiscount(double newDiscount){
	discount = newDiscount;
	System.out.println("New discount is "+discount);
	}
	public void displayDetails(){
	if(this instanceof Product4){
	System.out.println("Name of product is "+productName);
	System.out.println("Id is "+productID);
	System.out.println("Price of product is "+price);
	System.out.println("Quantity of product is "+quantity);
	System.out.println("Price after discount is "+discountedPrice());
	}
	}
	public double discountedPrice(){
		priceAfter=price - (price*discount/100);
		return priceAfter;
	}
	public static void main(String args[]){
	Product4 obj1 = new Product4("Shoes",112,4999.50,1);
	obj1.displayDetails();
	Product4.updateDiscount(16);
	obj1.displayDetails(); 
	}
}
