import java.util.Scanner;
public class SpringMethod6{
    public static boolean Check(int month,int day){
        if(month==3 && day>=20 && day<=31){
          return true;
           }
        else if(month==4 && day>=1 && day<=30){
          return true;
           }
        else if(month==5 && day>=1 && day<=31){
          return true;
           }
        else if(month==6 && day>=1 && day<=20){
          return true;
           }
        return false;
       }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month ");
        int month=sc.nextInt();
        System.out.println("Enter day ");
        int day=sc.nextInt();
        if(Check(month,day)){
            System.out.println("It's a Spring Season");
        }else{
            System.out.println("Not a Spring Season");
    }
  }
}

