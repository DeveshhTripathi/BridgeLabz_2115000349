import java.util.Scanner;
public class GradesArray9{
    public static String calculateGrade(double percentage) {
        if(percentage >= 80){
           return "A (Level 4, above agency-normalized standards)";
        }else if(percentage >= 70) {
            return "B (Level 3, at agency-normalized standards)";
        }else if(percentage >= 60) {
            return "R (Level 2, below, but approaching agency-normalized standards)";
        }else if(percentage >= 50) {
            return "R (Level 1, well below agency-normalized standards)";
        }else if(percentage >= 40) {
            return "R (Level 1-, too below agency-normalized standards)";
        }else{
            return "D (Remedial standards)";
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students ");
        int number = sc.nextInt();
        int[][] marks=new int[number][3];
        double[] percentages = new double[number];
        String[] grades = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Enter marks for student " + (i + 1));
            for(int j = 0; j < 3; j++){
                String subject = j == 0 ? "Physics" : j == 1 ? "Chemistry" : "Maths";
                do{
                    System.out.print("Enter marks for " + subject + ": ");
                    marks[i][j]=sc.nextInt();
                    if(marks[i][j] < 0){
                        System.out.println("Marks cannot be negative.");
                    }
            }while(marks[i][j] < 0);
        }
            int totalMarks=marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i]=(totalMarks / 3.0);
            grades[i]=calculateGrade(percentages[i]);
      }
        for(int i=0;i<number;i++){
            System.out.println("Student  Physics  Chemistry  Maths  Percentage  Grade are as follows"   + (i + 1) + "      " + marks[i][0] + "     " + marks[i][1] + "     " + marks[i][2] + "   " + percentages[i] + "%     " + grades[i]);
     }
  }
}
