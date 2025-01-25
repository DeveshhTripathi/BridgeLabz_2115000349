import java.util.Scanner;
public class BMICalculator2dArray7{
    public static double calculateBMI(double weight, double height){
        return weight / (height * height);
   }
    public static String getWeightStatus(double bmi){
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 39.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            double weight;
            do{
                System.out.print("Enter weight if person " + (i + 1));
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Please enter a positive weight.");
                }
            } while (weight <= 0);
            personData[i][0] = weight;

            double height;
            do{
                System.out.print("Enter height of person " + (i + 1));
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Please enter a positive height.");
                }
            }while (height <= 0);
            personData[i][1] = height;
            personData[i][2] = calculateBMI(weight, height);
            weightStatus[i] = getWeightStatus(personData[i][2]);
        }
        for (int i = 0; i < number; i++) {
            System.out.println("Person Weight Height Bmi Status are as follows respectively " +(i + 1) + "         " + personData[i][0] + "        " + personData[i][1] + "        " + personData[i][2] + "        " + weightStatus[i]);
    }
  }
}

