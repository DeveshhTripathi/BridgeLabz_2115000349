public class Vehicle6{
    private static double registrationFee = 5000.0;
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;
    public Vehicle6(String ownerName, String vehicleType, String registrationNumber){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    public static void updateRegistrationFee(double newFee){
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: " + registrationFee);
    }
    public void displayRegistrationDetails(){
        if(this instanceof Vehicle6){
            System.out.println("Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
   }
}
    public static void main(String[] args){
        Vehicle6 v1 = new Vehicle6("Shiva", "Car", "UP78 AB 1234");
        Vehicle6 v2 = new Vehicle6("Rahul", "Bike", "UP78 BS 4546");
        v1.displayRegistrationDetails();
        v2.displayRegistrationDetails();
        Vehicle6.updateRegistrationFee(5500);
        v1.displayRegistrationDetails();
        v2.displayRegistrationDetails();
    }
}
