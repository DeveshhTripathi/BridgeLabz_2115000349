import java.util.Scanner;
public class ExtendedUnitConverterMethod17{
    public static double convertFahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double convertCelsiusToFahrenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }
    public static double convertPoundsToKilograms(double pounds){
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }
    public static double convertKilogramsToPounds(double kilograms){
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }
    public static double convertGallonsToLiters(double gallons){
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
    public static double convertLitersToGallons(double liters){
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");
        System.out.println("3. Convert pounds to kilograms");
        System.out.println("4. Convert kilograms to pounds");
        System.out.println("5. Convert gallons to liters");
        System.out.println("6. Convert liters to gallons");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter Fahrenheit");
                double fahrenheit = sc.nextDouble();
                System.out.println(fahrenheit + " Fahrenheit is " + convertFahrenheitToCelsius(fahrenheit) + " Celsius.");
                break;
            case 2:
                System.out.print("Enter Celsius");
                double celsius = sc.nextDouble();
                System.out.println(celsius + " Celsius is " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit.");
                break;
            case 3:
                System.out.print("Enter pounds");
                double pounds = sc.nextDouble();
                System.out.println(pounds + " pounds is " + convertPoundsToKilograms(pounds) + " kilograms.");
                break;
            case 4:
                System.out.print("Enter kg");
                double kilograms = sc.nextDouble();
                System.out.println(kilograms + " kilograms is " + convertKilogramsToPounds(kilograms) + " pounds.");
                break;
            case 5:
                System.out.print("Enter gallons");
                double gallons = sc.nextDouble();
                System.out.println(gallons + " gallons is " + convertGallonsToLiters(gallons) + " liters.");
                break;
            case 6:
                System.out.println("Enter liters");
                double liters = sc.nextDouble();
                System.out.println(liters + " liters is " + convertLitersToGallons(liters) + " gallons");
                break;
            default:
                System.out.println("Invalid choice");
      }
  }
}
