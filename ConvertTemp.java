import java.util.Scanner;
public class ConvertTemp{
    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("Choose 1 to convert Fahrenheit to Celsius");
        System.out.println("Choose 2 to Convert Celsius to Fahrenheit");
        int choice = sc.nextInt();
        double temp, convertedTemp;
        switch (choice){
            case 1:
                System.out.println("Enter temp in Fahrenheit ");
                temp=sc.nextDouble();
                convertedTemp=fahrenheitToCelsius(temp);
                System.out.println("Temperature in Celsius is "+ convertedTemp);
                break;
            case 2:
              System.out.println("Enter temp in Celsius ");
              temp = sc.nextDouble();
              convertedTemp = celsiusToFahrenheit(temp);
              System.out.println("Temperature in Fahrenheit is " + convertedTemp);
              break;
          default:
                System.out.println("Invalid choice");
     }
  }
}
