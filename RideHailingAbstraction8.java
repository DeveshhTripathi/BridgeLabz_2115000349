abstract class Vehicle{
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    public Vehicle(String vehicleId, String driverName, double ratePerKm){
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
 }
    public abstract double calculateFare(double distance);
    public void getVehicleDetails(){
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
 }
    public double getRatePerKm(){
        return ratePerKm;
  }
}
interface GPS{
    String getCurrentLocation();
    void updateLocation(String newLocation);
}
class Car extends Vehicle implements GPS{
    private String location;
    public Car(String vehicleId, String driverName, double ratePerKm){
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown";
  }
    public double calculateFare(double distance){
        return distance * getRatePerKm();
  }
    public String getCurrentLocation(){
        return location;
  }
    public void updateLocation(String newLocation){
        this.location = newLocation;
  }
}
class Bike extends Vehicle implements GPS{
    private String location;
    public Bike(String vehicleId, String driverName, double ratePerKm){
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown";
 }
    public double calculateFare(double distance){
        return distance * getRatePerKm();
  }
    public String getCurrentLocation(){
        return location;
  }
    public void updateLocation(String newLocation){
        this.location = newLocation;
  }
}
class Auto extends Vehicle implements GPS{
    private String location;
    public Auto(String vehicleId, String driverName, double ratePerKm){
        super(vehicleId, driverName, ratePerKm);
        this.location = "Unknown";
  }
    public double calculateFare(double distance){
        return distance * getRatePerKm();
   }
    public String getCurrentLocation(){
        return location;
  }
    public void updateLocation(String newLocation){
        this.location = newLocation;
  }
}
public class RideHailingAbstraction8{
    public static void processRide(Vehicle vehicle, double distance){
        vehicle.getVehicleDetails();
        System.out.println("Total Fare: " + vehicle.calculateFare(distance));
  }
    public static void main(String[] args){
        Vehicle car = new Car("101", "Jeet", 15);
        Vehicle bike = new Bike("202", "Rohan", 8);
        Vehicle auto = new Auto("303", "Rahul", 10);
        processRide(car, 10);
        processRide(bike, 5);
        processRide(auto, 8);
  }
}

