import java.util.ArrayList;
class Customer{
    private String name;
    private ArrayList<Order> orders;
    public Customer(String name){
        this.name = name;
        this.orders = new ArrayList<>();
  }
    public void placeOrder(Order order){
        orders.add(order);
        System.out.println(name + " placed an order with ID: " + order.getOrderId());
  }
    public String getName(){
        return name;
  }
}
class Order{
    private static int idCounter = 1;
    private int orderId;
    private ArrayList<Product> products;
    public Order(){
        this.orderId = idCounter++;
        this.products = new ArrayList<>();
  }
    public void addProduct(Product product){
        products.add(product);
    }
    public int getOrderId(){
        return orderId;
    }
    public void showOrderDetails(){
        System.out.println("Order ID: " + orderId);
        System.out.println("Products:");
        for (Product product : products){
            System.out.println("- " + product.getName() + " ($" + product.getPrice() + ")");
     }
  }
}
class Product{
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
}
public class CustomerProgram7{
    public static void main(String[] args){
        Customer customer = new Customer("Rahul");
        Order order1 = new Order();
        Order order2 = new Order();
        Product product1 = new Product("Laptop", 1200.00);
        Product product2 = new Product("Smartphone", 800.00);
        order1.addProduct(product1);
        order1.addProduct(product2);
        order2.addProduct(product2);
        customer.placeOrder(order1);
        customer.placeOrder(order2);
        order1.showOrderDetails();
        order2.showOrderDetails();
    }
}
