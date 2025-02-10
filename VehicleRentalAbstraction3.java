import java.util.*;
abstract class Vehicle{
    private String vehicleNumber;
    private String type;
    protected double rentalRate;
    public Vehicle(String vehicleNumber, String type, double rentalRate){
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    public abstract double calculateRentalCost(int days);
    public String getVehicleDetails(){
        return "Vehicle Number: " + vehicleNumber + ", Type: " + type;
    }
}
interface Insurable{
    double calculateInsurance();
    String getInsuranceDetails();
}
class Car extends Vehicle implements Insurable{
    private String insurancePolicyNumber;
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber){
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
  }
    public double calculateRentalCost(int days){
        return rentalRate * days;
    }
    public double calculateInsurance(){
        return rentalRate * 0.1;
    }
    public String getInsuranceDetails(){
        return "Car Insurance Policy: " + insurancePolicyNumber;
    }
}
class Bike extends Vehicle implements Insurable{
    private String insurancePolicyNumber;
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber){
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
   }
    public double calculateRentalCost(int days){
        return rentalRate * days;
  }
    public double calculateInsurance(){
        return rentalRate * 0.05;
    }
    public String getInsuranceDetails(){
        return "Bike Insurance Policy: " + insurancePolicyNumber;
  }
}
class Truck extends Vehicle implements Insurable{
    private String insurancePolicyNumber;
    
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    public double calculateRentalCost(int days){
        return rentalRate * days + 50;
    }
    public double calculateInsurance(){
        return rentalRate * 0.15;
    }
    public String getInsuranceDetails(){
        return "Truck Insurance Policy: " + insurancePolicyNumber;
    }
}
public class VehicleRentalAbstraction3{
    public static void main(String[] args){
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("C123", 500, "CAR-INS-001"));
        vehicles.add(new Bike("B456", 200, "BIKE-INS-002"));
        vehicles.add(new Truck("T789", 1000, "TRUCK-INS-003"));
        int rentalDays = 5;
        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle.getVehicleDetails());
            System.out.println("Rental Cost for " + rentalDays + " days: " + vehicle.calculateRentalCost(rentalDays));
            if(vehicle instanceof Insurable){
                Insurable insurableVehicle = (Insurable) vehicle;
                System.out.println("Insurance Cost: " + insurableVehicle.calculateInsurance());
                System.out.println(insurableVehicle.getInsuranceDetails());
        }
     }
  }
}
