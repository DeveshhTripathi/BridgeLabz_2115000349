import java.util.regex.*;
public class LicensePlateValidator2{
    public static boolean isValidLicensePlate(String plate){
        String regex = "^[A-Z]{2}\\d{4}$";
        return plate.matches(regex);
    }
    public static void main(String[] args) {
        System.out.println(isValidLicensePlate("AB1234"));
        System.out.println(isValidLicensePlate("A12345"));
        System.out.println(isValidLicensePlate("XY9876"));
        System.out.println(isValidLicensePlate("X1234"));
        System.out.println(isValidLicensePlate("ABC123"));
    }
}
