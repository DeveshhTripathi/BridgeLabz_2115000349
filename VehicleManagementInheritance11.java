class Vehicle{
    protected String model;
    protected int maxSpeed;
    public Vehicle(String model, int maxSpeed){
        this.model = model;
        this.maxSpeed = maxSpeed;
  }
    public void displayInfo(){
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
  }
}
interface Refuelable{
    void refuel();
}
class ElectricVehicle extends Vehicle{
    private int batteryCapacity;
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity){
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
  }
    public void charge(){
        System.out.println("Charging " + model + " with battery capacity: " + batteryCapacity + " kWh.");
  }
}
class PetrolVehicle extends Vehicle implements Refuelable{
    private double fuelCapacity;
    public PetrolVehicle(String model, int maxSpeed, double fuelCapacity){
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
  }
    public void refuel(){
        System.out.println("Refueling " + model + " with fuel capacity: " + fuelCapacity + " liters.");
  }
}
public class VehicleManagementInheritance11{
    public static void main(String[] args){
        ElectricVehicle ev = new ElectricVehicle("Tesla", 200, 75);
        PetrolVehicle pv = new PetrolVehicle("Tata Nexon", 180, 50);
        ev.displayInfo();
        ev.charge();
        pv.displayInfo();
        pv.refuel();
  }
}
