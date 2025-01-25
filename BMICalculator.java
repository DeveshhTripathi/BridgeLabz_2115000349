import java.util.Scanner;
public class BMICalculator{
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
    public static String WeightStatus(double bmi) {
        if(bmi < 18.5){
            return "Underweight";
        }else if(bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        }else if(bmi >= 25 && bmi < 39.9) {
            return "Overweight";
        }else{
            return "Obesity";
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of persons");
        int number = sc.nextInt();
        double[] weights = new double[number];
        double[] heights = new double[number];
        double[] bmis = new double[number];
        String[] weightStatus = new String[number];
        for (int i=0;i<number;i++){
            System.out.println("Enter weight of person " + (i + 1));
            weights[i] = sc.nextDouble();
            System.out.println("Enter height of person " + (i + 1));
            heights[i] = sc.nextDouble();
            bmis[i] = calculateBMI(weights[i], heights[i]);      //Method calling to calculate bmi
            weightStatus[i] = WeightStatus(bmis[i]);            // this is for Status
        }
        for (int i = 0; i < number; i++) {
            System.out.println("Person details are as follows - Person no , Person Weight , Person Height , Person bmis and Weight Status repectively - " + (i + 1)+" , "+ weights[i]+ " , " +heights[i]+" , "+ bmis[i]+ " , "+weightStatus[i]);
      }
  }
}
