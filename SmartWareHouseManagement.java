import java.util.*;
abstract class WarehouseItem{
    private String name;
    private double price;
    public WarehouseItem(String name, double price){
        this.name = name;
        this.price = price;
  }
    public String getName(){ 
	return name;
  }
    public double getPrice(){ 
     return price;
  }
  public String toString(){
        return getClass().getSimpleName() + " - Name: " + name + ", Price: " + price;
    }
}
class Electronics extends WarehouseItem{
    public Electronics(String name,double price){
        super(name, price);
  }
}
class Groceries extends WarehouseItem{
    public Groceries(String name, double price){
        super(name, price);
  }
}
class Furniture extends WarehouseItem{
    public Furniture(String name, double price){
        super(name, price);
  }
}
class Storage<T extends WarehouseItem>{
    private List<T> items=new ArrayList<>();
    public void addItem(T item){
        items.add(item);
  }
    public void removeItem(T item){
        items.remove(item);
  }
    public List<T> getItems(){
        return items;
  }
}
class WarehouseUtility{
    public static void displayItems(List<? extends WarehouseItem> items){
        for (WarehouseItem item : items){
            System.out.println(item);
    }
  }
}
public class SmartWareHouseManagement{
    public static void main(String[] args){
        Electronics laptop = new Electronics("Laptop", 120099);
        Electronics smartphone = new Electronics("Smartphone", 79949);
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(laptop);
        electronicsStorage.addItem(smartphone);
        Groceries apples = new Groceries("Apples", 299);
        Groceries milk = new Groceries("Milk", 14.9);
        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(apples);
        groceriesStorage.addItem(milk);

        Furniture chair = new Furniture("Chair", 599);
        Furniture table = new Furniture("Table", 1200);
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(chair);
        furnitureStorage.addItem(table);

        WarehouseUtility.displayItems(electronicsStorage.getItems());
        WarehouseUtility.displayItems(groceriesStorage.getItems());
        WarehouseUtility.displayItems(furnitureStorage.getItems());
  }
}
