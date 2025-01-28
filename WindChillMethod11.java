import java.util.Scanner;
public class WindChillMethod11{
    	public double calc(double temp, double windSpeed) {
        return 35.74+0.6215*temp+(0.4275*temp- 35.75) *Math.pow(windSpeed, 0.16);
    	}
    	public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature");
        double temp = sc.nextDouble();
        System.out.println("Enter the wind speed");
        double windSpeed = sc.nextDouble();
        WindChillMethod11 obj = new WindChillMethod11();
        double windChill = obj.calc(temp, windSpeed);
        System.out.println("The wind chill temperature is: "+ windChill);
   }
}
