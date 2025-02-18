import java.util.*;
abstract class Product{
    private String name;
    private double price;
    public Product(String name, double price){
        this.name = name;
        this.price = price;
  }
    public String getName(){ 
	return name; 
}
  public double getPrice(){
	return price;
}    
   public void setPrice(double price){ 
	this.price = price; 
}
    public String toString(){
        return getClass().getSimpleName() + " - Name: " + name + ", Price: " + price;
  }
}
class Book extends Product{
    public Book(String name, double price){
        super(name, price);
  }
}
class Clothing extends Product{
    public Clothing(String name, double price){
        super(name, price);
  }
}
class Gadget extends Product{
    public Gadget(String name, double price){
        super(name, price);
  }
}
class ProductCatalog<T extends Product>{
    private List<T> products = new ArrayList<>();
    public void addProduct(T product){
        products.add(product);
   }
    public List<T> getProducts(){
        return products;
    }
}
class DiscountUtility{
    public static <T extends Product> void applyDiscount(T product, double percentage){
        double discountAmount = (product.getPrice() * percentage)/100;
        product.setPrice(product.getPrice() - discountAmount);
        System.out.println("Discount applied to " + product.getName() + ". New Price: " + product.getPrice());
    }
}
public class OnlineMarketplace{
    public static void main(String[] args){
        Book book1 = new Book("Harry Potter", 500);
        Clothing tshirt = new Clothing("Polo T-Shirt", 2000);
        Gadget phone = new Gadget("Iphone", 69999);

        ProductCatalog<Book> bookCatalog = new ProductCatalog<>();
        bookCatalog.addProduct(book1);

        ProductCatalog<Clothing> clothingCatalog = new ProductCatalog<>();
        clothingCatalog.addProduct(tshirt);

        ProductCatalog<Gadget> gadgetCatalog = new ProductCatalog<>();
        gadgetCatalog.addProduct(phone);

        System.out.println("Applying the percent of Discounts is:");
        DiscountUtility.applyDiscount(book1, 10);
        DiscountUtility.applyDiscount(tshirt, 15);
        DiscountUtility.applyDiscount(phone, 5);
        System.out.println("\nAfter Discount:");
        System.out.println(book1);
        System.out.println(tshirt);
        System.out.println(phone);
    }
}
