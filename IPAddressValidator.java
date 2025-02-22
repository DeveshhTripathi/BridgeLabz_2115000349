import java.util.regex.*;
public class IPAddressValidator{
    public static boolean isValidIPAddress(String ip){
        String regex = "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";
        return ip.matches(regex);
 }
    public static void main(String[] args){
        System.out.println(isValidIPAddress("192.168.1.1"));
        System.out.println(isValidIPAddress("255.255.255.255"));
        System.out.println(isValidIPAddress("256.100.50.25"));
        System.out.println(isValidIPAddress("192.168.1"));
        System.out.println(isValidIPAddress("abc.def.ghi.jkl"));
    }
}
