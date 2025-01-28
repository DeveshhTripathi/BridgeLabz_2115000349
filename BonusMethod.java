import java.util.*;
public class BonusMethod{
    public static double[][] determineSalaryAndYearsOfService(){
        Random r=new Random();
        double[][] employees = new double[10][2];
        for (int i=0;i<10;i++){
            employees[i][0]=10000+r.nextInt(90000); 
            employees[i][1]=1+r.nextInt(10); 
        }
        return employees;
    }
    public static double[][] calculateNewSalaryAndBonus(double[][] employees){
        double[][] updatedEmployees=new double[10][3];
        for (int i=0;i<10;i++){
            double salary = employees[i][0];
            double yearsOfService = employees[i][1];
            double bonus = (yearsOfService >= 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;
            updatedEmployees[i][0] = salary;
            updatedEmployees[i][1] = newSalary;
            updatedEmployees[i][2] = bonus;
        }
        return updatedEmployees;
    }
    public static void calculateAndDisplayTotal(double[][] updatedEmployees){
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        System.out.println("Old Salary  New Salary  Bonus");
        for (int i = 0; i < 10; i++){
            totalOldSalary += updatedEmployees[i][0];
            totalNewSalary += updatedEmployees[i][1];
            totalBonus += updatedEmployees[i][2];
            System.out.printf("%10.2f %12.2f %7.2f\n", updatedEmployees[i][0], updatedEmployees[i][1], updatedEmployees[i][2]);
        }
        System.out.printf("\nTotal Old Salary: %.2f\nTotal New Salary: %.2f\nTotal Bonus: %.2f\n", totalOldSalary, totalNewSalary, totalBonus);
    }
    public static void main(String[] args){
        double[][] employees = determineSalaryAndYearsOfService();
        double[][] updatedEmployees = calculateNewSalaryAndBonus(employees);
        calculateAndDisplayTotal(updatedEmployees);
    }
}
