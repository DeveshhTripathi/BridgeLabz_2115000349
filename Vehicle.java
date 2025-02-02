import java.util.Scanner;
class Vehicle{
    String ownerName;
    String vehicleType;
    static double registrationFee = 500.0;
    Vehicle(String ownerName, String vehicleType){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
 }
    void displayVehicleDetails(){
        System.out.println("Owner Name: " + ownerName + "\nVehicle Type: " + vehicleType + "\nRegistration Fee: " + registrationFee);
    }
    static void updateRegistrationFee(double newFee){
        registrationFee = newFee;
 }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Owner Name: ");
        String ownerName = sc.nextLine();
        System.out.print("Enter Vehicle Type: ");
        String vehicleType = sc.nextLine();
        System.out.print("Enter New Registration Fee: ");
        double newFee = sc.nextDouble();
        updateRegistrationFee(newFee);
        Vehicle vehicle = new Vehicle(ownerName, vehicleType);
        vehicle.displayVehicleDetails();
 }
}
