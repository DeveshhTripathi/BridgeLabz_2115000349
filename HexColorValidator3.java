import java.util.regex.*;
public class HexColorValidator3{
    public static boolean isValidHexColor(String color){
        String regex = "^#[A-Fa-f0-9]{6}$";
        return color.matches(regex);
    }
    public static void main(String[] args){
        System.out.println(isValidHexColor("#FFA500"));
        System.out.println(isValidHexColor("#ff4500"));
        System.out.println(isValidHexColor("#123"));
        System.out.println(isValidHexColor("#ABCDEF"));
        System.out.println(isValidHexColor("FFA500"));
        System.out.println(isValidHexColor("#123456"));
    }
}
