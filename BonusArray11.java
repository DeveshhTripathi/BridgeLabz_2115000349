import java.util.Scanner;
public class BonusArray11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] years= new double[10]; // Corrected variable name
        double[] bonus= new double[10];
        double[] newSalary= new double[10];
        double totalOldSalary=0;
        double totalBonus=0;
        double totalNewSalary=0;
        System.out.println("Enter the salary and years");
        for (int i=0;i<10;i++){
            System.out.println("Employee " + (i + 1));
            while(true){
                System.out.print("Salary ");
                double salaryOfOne=sc.nextDouble();
                if(salaryOfOne>0){
                    salary[i]=salaryOfOne;
                    break;
                } else {
                    System.out.println("Invalid salary");
                }
            }
            while(true){
            System.out.print("Years of service ");
            double year = sc.nextDouble();
            if (year >= 0) {
                years[i] = year;
                  break;
            } else {
                System.out.println("Invalid years of service. Please enter a non-negative value.");
             }
         }
    }

        for (int i=0;i<10;i++) {
            double bonusPercentage=years[i]>5 ? 0.05 : 0.02;
            bonus[i] = salary[i] * bonusPercentage;
            newSalary[i] = salary[i] + bonus[i];
            totalOldSalary += salary[i];
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }
        for(int i=0;i<10;i++){
          System.out.println("Employee " + (i + 1) + ": Old Salary = " + String.format("%.2f", salary[i]) +
               ", Bonus = " + String.format("%.2f", bonus[i]) +
                 ", New Salary = " + String.format("%.2f", newSalary[i]));
        }
        System.out.println("Total Old Salary: " + String.format("%.2f", totalOldSalary));
        System.out.println("Total Bonus Payout: " + String.format("%.2f", totalBonus));
        System.out.println("Total New Salary: " + String.format("%.2f", totalNewSalary));
    }
}
