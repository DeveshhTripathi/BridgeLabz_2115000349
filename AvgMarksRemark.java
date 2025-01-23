import java.util.Scanner;
public class AvgMarksRemark{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Physics marks");
      double physics = sc.nextDouble();
       System.out.println("Enter Chemistry marks");
        double chemistry = sc.nextDouble();
        System.out.println("Enter Maths marks");
        double maths = sc.nextDouble();

        double totalMarks=physics + chemistry + maths;
        double averageMarks = totalMarks / 3;
        double percentage = (totalMarks / 300) * 100;
        String grade;
        String remarks;
        if (percentage >= 80){
            grade = "A";
            remarks = "Marks (Level 4, above agency-normalized standards)";
      } else if (percentage >= 70){
            grade = "B";
            remarks = "Marks (Level 3, at agency-normalized standards)";
     } else if (percentage >= 60){
            grade = "C";
            remarks = "Marks (Level 2, below, but approaching agency-normalized standards)";
     } else if (percentage >= 50){
            grade = "D";
            remarks = "Marks (Level 1, well below agency-normalized standards)";
      } else if (percentage >= 40){
            grade = "E";
            remarks = "Marks (Level 1-, too below agency-normalized standards)";
     } else{
            grade = "R";
            remarks = "Remedial standards";
      }

        System.out.println("Average Marks- " + String.format("%.2f", averageMarks));
        System.out.println("Percentage- " + String.format("%.2f", percentage) + "%");
        System.out.println("Grade- " + grade);
        System.out.println("Remarks- " + remarks);
    }
}
