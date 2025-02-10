abstract class FoodItem{
    private String itemName;
    protected double price;
    private int quantity;
    public FoodItem(String itemName, double price, int quantity){
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
  }
    public abstract double calculateTotalPrice();
    public void getItemDetails(){
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
  }
    public int getQuantity(){
        return quantity;
   }
}
interface Discountable{
    void applyDiscount(double discountRate);
    double getDiscountDetails();
}
class VegItem extends FoodItem implements Discountable{
    private double discount;
    public VegItem(String itemName, double price, int quantity){
        super(itemName, price, quantity);
  }
    public double calculateTotalPrice(){
        return getQuantity() * (super.price - discount);
   }
    public void applyDiscount(double discountRate){
        discount = super.price * discountRate / 100;
  }
    public double getDiscountDetails(){
        return discount;
  }
}
class NonVegItem extends FoodItem implements Discountable{
    private double additionalCharge = 20.0; // Additional charge for non-veg items
    private double discount;
    public NonVegItem(String itemName, double price, int quantity){
        super(itemName, price, quantity);
    }
    public double calculateTotalPrice(){
        return getQuantity() * ((super.price + additionalCharge) - discount);
    }
    public void applyDiscount(double discountRate){
        discount = (super.price + additionalCharge) * discountRate / 100;
  }
    public double getDiscountDetails(){
        return discount;
  }
}
public class OnlineFoodAbstraction6{
    public static void processOrder(FoodItem item){
        item.getItemDetails();
        System.out.println("Total Price: " + item.calculateTotalPrice() + "\n");
  }
    public static void main(String[] args){
        FoodItem veg = new VegItem("Paneer Tikka", 150, 2);
        FoodItem nonVeg = new NonVegItem("Chicken Biryani", 250, 1);
        ((Discountable) veg).applyDiscount(10);
        ((Discountable) nonVeg).applyDiscount(5);       
        processOrder(veg);
        processOrder(nonVeg);
    }
}
