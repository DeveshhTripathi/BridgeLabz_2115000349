import java.util.*;
public class OTP{
    public static int generateOTP(){
        return (int) (Math.random() * 900000) + 100000;
    }
    public static boolean areOTPsUnique(int[] otps){
        Set<Integer> otpSet = new HashSet<>();
        for (int otp:otps){
            if (!otpSet.add(otp)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] otps = new int[10];
        for (int i=0;i<10;i++){
            otps[i] = generateOTP();
        }
        if(areOTPsUnique(otps)){
            System.out.println("All OTPs are unique.");
        }else{
            System.out.println("Some OTPs are not unique.");
     }
  }
}
