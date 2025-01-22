import java.util.Scanner;
public class TripCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter From City: ");
        String fromCity = sc.nextLine();

        System.out.print("Enter Via City: ");
        String viaCity = sc.nextLine();

        System.out.print("Enter To City: ");
        String toCity = sc.nextLine();

        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToVia = sc.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (in miles): ");
        double viaToFinalCity = sc.nextDouble();

        System.out.print("Enter the time taken for this trip (in hours): ");
        double timeTaken = sc.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / timeTaken;

        System.out.println("The total distance of the trip is " + totalDistance + " miles.");
        System.out.println("The average speed for the trip is " + averageSpeed + " miles per hour.");
    }
}
