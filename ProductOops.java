import java.util.Scanner;
class ProductOops{
    String productName;
    double price;
    static int totalProducts=0;
    ProductOops(String productName, double price){
        this.productName = productName;
        this.price = price;
        totalProducts++;
  }
    void displayProductDetails(){
        System.out.println("Product Name: " + productName + "\nPrice: " + price);
  }
    static void displayTotalProducts(){
        System.out.println("Total Products: " + totalProducts);
  }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product name ");
        String name = sc.nextLine();
        System.out.println("Enter product price ");
        double price = sc.nextDouble();      
        ProductOops product = new ProductOops(name, price);
        product.displayProductDetails();
        displayTotalProducts();
  }
}
