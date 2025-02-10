import java.util.*;
abstract class Product{
    protected int productId;
    protected String name;
    protected double price;

    public Product(int productId, String name, double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
  }
    public abstract double calculateDiscount();
    public double getPrice(){
        return price;
  }
    public void setPrice(double price){
        if (price>0){
            this.price = price;
      }
  }
}
interface Taxable{
    double calculateTax();
    String getTaxDetails();
}
class Electronics extends Product implements Taxable{
    public Electronics(int productId, String name, double price){
        super(productId, name, price);
  }
    public double calculateDiscount(){
        return price * 0.10; // 10% discount
  }
    public double calculateTax(){
        return price * 0.18; // 18% tax
  }
    public String getTaxDetails() {
        return "Electronics Tax: 18%";
  }
}
class Clothing extends Product implements Taxable{
    public Clothing(int productId, String name, double price){
        super(productId, name, price);
  }
    public double calculateDiscount(){
        return price * 0.15;
  }
    public double calculateTax(){
        return price * 0.05;
  }
    public String getTaxDetails() {
        return "Clothing Tax: 5%";
  }
}
class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
  }
    public double calculateDiscount(){
        return price * 0.05;
  }
}
public class ECommerceAbstraction2{
    public static void calculateFinalPrice(List<Product> products){
        for (Product product : products){
            double discount = product.calculateDiscount();
            double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0;
            double finalPrice = product.getPrice() + tax - discount;
            System.out.println("Final price of " + product.name + ": " + finalPrice);
    }
  }
    public static void main(String[] args){
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(1, "Laptop", 50000));
        products.add(new Clothing(2, "T-Shirt", 1000));
        products.add(new Groceries(3, "Apple", 200));
        calculateFinalPrice(products);
  }
}
