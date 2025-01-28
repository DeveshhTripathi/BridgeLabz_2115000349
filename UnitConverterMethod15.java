import java.util.Scanner;
public class UnitConverterMethod15{
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        System.out.println("Choose an option:");
        System.out.println("1. Convert kilometers to miles");
        System.out.println("2. Convert miles to kilometers");
        System.out.println("3. Convert meters to feet");
        System.out.println("4. Convert feet to meters");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter km ");
                double km=sc.nextDouble();
                System.out.println(km + " kilometers is " + convertKmToMiles(km) + " miles.");
                break;
            case 2:
                System.out.println("Enter miles");
                double miles=sc.nextDouble();
                System.out.println(miles + " miles is " + convertMilesToKm(miles) + " kilometers.");
                break;
            case 3:
                System.out.println("Enter meters");
                double meters=sc.nextDouble();
                System.out.println(meters + " meters is " + convertMetersToFeet(meters) + " feet.");
                break;
            case 4:
                System.out.println("Enter feet");
                double feet=sc.nextDouble();
                System.out.println(feet + " feet is " + convertFeetToMeters(feet) + " meters.");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
    }
  }
}

