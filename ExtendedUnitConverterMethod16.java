import java.util.Scanner;
public class ExtendedUnitConverterMethod16{
    public static double convertYardsToFeet(double yards) {
        double yardsTofeet = 3;
        return yards * yardsTofeet;
    }
    public static double convertFeetToYards(double feet) {
        double feetToyards = 0.333333;
        return feet * feetToyards;
    }
    public static double convertMetersToInches(double meters){
        double metersToinches = 39.3701;
        return meters * metersToinches;
    }
    public static double convertInchesToMeters(double inches) {
        double inchesTometers = 0.0254;
        return inches * inchesTometers;
    }
    public static double convertInchesToCentimeters(double inches){
        double inchesTocm = 2.54;
        return inches * inchesTocm;
    }
  public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Convert yards to feet");
        System.out.println("2. Convert feet to yards");
        System.out.println("3. Convert meters to inches");
        System.out.println("4. Convert inches to meters");
        System.out.println("5. Convert inches to centimeters");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter yards: ");
                double yards = sc.nextDouble();
                System.out.println(yards + " yards is " + convertYardsToFeet(yards) + " feet.");
                break;
            case 2:
                System.out.println("Enter feet: ");
                double feet = sc.nextDouble();
                System.out.println(feet + " feet is " + convertFeetToYards(feet) + " yards.");
                break;
            case 3:
                System.out.println("Enter meters: ");
                double meters = sc.nextDouble();
                System.out.println(meters + " meters is " + convertMetersToInches(meters) + " inches.");
                break;
            case 4:
                System.out.println("Enter inches");
                double inches=sc.nextDouble();
                System.out.println(inches + " inches is " + convertInchesToMeters(inches) + " meters.");
                break;
            case 5:
                System.out.println("Enter inches");
                inches=sc.nextDouble();
                System.out.println(inches + " inches is " + convertInchesToCentimeters(inches) + " centimeters.");
                break;
            default:
                System.out.println("Invalid choice");
    }
  }
}
