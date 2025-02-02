import java.util.Scanner;
class CarRental{
    String customerName, carModel;
    int rentalDays;
    double costPerDay = 50;
    CarRental(String customerName, String carModel, int rentalDays){
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
}
    double calculateTotalCost(){
        return rentalDays*costPerDay;
}
    void displayDetails(){
        System.out.println("Customer: " + customerName + "\nCar Model: " + carModel + "\nRental Days: " + rentalDays + "\nTotal Cost: " + calculateTotalCost());
    }
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter customer name ,car model and total rental days");
	String customerName = sc.nextLine();
	String carModel = sc.nextLine();
	int rentalDays = sc.nextInt();
        CarRental rental = new CarRental(customerName, carModel, rentalDays);
        rental.displayDetails();
  }
}
