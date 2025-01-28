import java.util.Scanner;
public class BMIMethod21{
    public static void calculateBMI(double[][] data){
        for(int i=0;i<data.length;i++){
            double weight=data[i][0];
            double heightInMeters = data[i][1] / 100;
            data[i][2] = weight / (heightInMeters * heightInMeters);
      }
  }
   public static String determineBMIStatus(double bmi){
        if (bmi < 18.5){
            return "Underweight";
        }else if(bmi >= 18.5 && bmi<24.9) {
            return "Normal weight";
        }else if(bmi >= 25 && bmi<39.9) {
            return "Overweight";
        } else{
            return "Obesity";
     }
  }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[][] data=new double[10][3];
        String[] statuses=new String[10];
        for (int i=0;i<data.length;i++) {
          System.out.println("Enter weight of person " + (i + 1));
          data[i][0] = sc.nextDouble();
            System.out.println("Enter height of person " + (i + 1));
            data[i][1] = sc.nextDouble();
        }
        calculateBMI(data);
        for (int i=0;i<data.length;i++){
            statuses[i]=determineBMIStatus(data[i][2]);
            System.out.println("Weight Height BMI Status of individual is " +data[i][0]+ data[i][1]+ data[i][2]+ statuses[i]);
    }
  }
}
