class Person{
    protected String name;
    protected int id;
    public Person(String name, int id){
        this.name = name;
        this.id = id;
  }
    public void displayInfo(){
        System.out.println("Name: " + name + ", ID: " + id);
  }
}
interface Worker{
    void performDuties();
}
class Chef extends Person implements Worker{
    private String specialty;
    public Chef(String name, int id, String specialty){
        super(name, id);
        this.specialty = specialty;
  }
    public void performDuties(){
        System.out.println("Role: Chef, Specialty: " + specialty);
  }
}
class Waiter extends Person implements Worker{
    private int tablesAssigned;
    public Waiter(String name, int id, int tablesAssigned){
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }
    public void performDuties(){
        System.out.println("Role: Waiter, Tables Assigned: " + tablesAssigned);
  }
}
public class RestaurantInheritance10{
    public static void main(String[] args) {
        Chef chef = new Chef("Rahul", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("Jeet", 202, 5);
        chef.displayInfo();
        chef.performDuties();
        waiter.displayInfo();
        waiter.performDuties();
    }
}
