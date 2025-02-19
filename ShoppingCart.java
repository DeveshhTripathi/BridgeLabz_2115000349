import java.util.*;
class Shopping{
    private Map<String, Double> productPrices = new HashMap<>();
    private LinkedHashMap<String, Integer> cart = new LinkedHashMap<>();
    public void addProduct(String product, double price){
        productPrices.put(product, price);
        cart.put(product, cart.getOrDefault(product, 0) + 1);
  }
    public void removeProduct(String product){
        if(cart.containsKey(product)){
            if(cart.get(product) > 1){
                cart.put(product, cart.get(product) - 1);
            }else{
                cart.remove(product);
         }
    }else{
          System.out.println("Product not in cart!");
    }
  }
    public void viewCart(){
        System.out.println("Shopping Cart (Order of Addition):");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " x" + entry.getValue() + " - $" + productPrices.get(entry.getKey()));
    }
 }
    public void viewSortedByPrice(){
        TreeMap<Double, String> sortedItems = new TreeMap<>();
        for (String product : cart.keySet()){
            sortedItems.put(productPrices.get(product), product);
    }
        System.out.println("Cart Items (Sorted by Price):");
        for (Map.Entry<Double, String> entry : sortedItems.entrySet()){
            System.out.println(entry.getValue() + " - $" + entry.getKey());
   }
 }
  public double getTotalPrice(){
        double total = 0;
        for(Map.Entry<String, Integer> entry : cart.entrySet()){
            total += productPrices.get(entry.getKey()) * entry.getValue();
    }
     return total;
  }
}
public class ShoppingCart{
    public static void main(String[] args){
        Shopping cart = new Shopping();
        cart.addProduct("Laptop", 1200);
        cart.addProduct("Phone", 800);
        cart.addProduct("Headphones", 150);
        cart.addProduct("Laptop", 1200);
        cart.addProduct("Watch", 250);
        cart.viewCart();
        System.out.println();
        cart.viewSortedByPrice();
        System.out.println();
        System.out.println("Total Price: $" + cart.getTotalPrice());
  }
}
