import java.util.Scanner;
public class BMI{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your weight");
       double weight = sc.nextDouble();
         System.out.print("Enter your height");
        double height = sc.nextDouble();
       height *= 100; 
        double bmi = weight / (height * height);

        String status;
       if (bmi < 18.5){
          status = "Underweight";
     }else if(bmi >= 18.5 && bmi <= 24.9) {
          status = "Normal";
     }else if (bmi >= 25.0 && bmi <= 29.9) {
          status = "Overweight";
      }else {
          status = "Obese";
     }
        System.out.println("Your BMI is " + bmi + " and " + "Your weight status is " + status);
  }
}
