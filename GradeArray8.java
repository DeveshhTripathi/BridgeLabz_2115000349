import java.util.Scanner;
public class GradeArray8{
    public static String calculateGrade(double percentage){
        if(percentage >= 80){
            return "A (Level 4, above agency-normalized standards)";
        }else if (percentage >= 70) {
            return "B (Level 3, at agency-normalized standards)";
        }else if (percentage >= 60) {
            return "R (Level 2, below, but approaching agency-normalized standards)";
        }else if (percentage >= 50) {
            return "R (Level 1, well below agency-normalized standards)";
        }else if (percentage >= 40) {
            return "R (Level 1-, too below agency-normalized standards)";
        }else{
            return "D (Remedial standards)";
     }
 }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int number=sc.nextInt();
        int[] physicsMarks=new int[number];
        int[] chemistryMarks=new int[number];
        int[] mathsMarks=new int[number];
        double[] percentages=new double[number];
        String[] grades=new String[number];
       for(int i=0;i<number;i++){
            System.out.println("\nEnter marks for student " + (i + 1));
            do{
                System.out.print("Enter marks for Physics: ");
                physicsMarks[i] = sc.nextInt();
                if (physicsMarks[i] < 0) {
                    System.out.println("Marks cannot be negative.");
                }
            }while(physicsMarks[i] < 0);

            do{
                System.out.print("Enter marks for Chemistry: ");
                chemistryMarks[i] = sc.nextInt();
                if(chemistryMarks[i] < 0) {
                    System.out.println("Marks cannot be negative");
                }
            }while(chemistryMarks[i]<0);
            do{
                System.out.print("Enter marks for Maths: ");
                mathsMarks[i] = sc.nextInt();
                if (mathsMarks[i] < 0) {
                    System.out.println("Marks cannot be negative");
                }
            }while(mathsMarks[i]<0);

            int totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            percentages[i] = totalMarks/3.0;
            grades[i] =calculateGrade(percentages[i]);
        }
        for(int i = 0; i < number; i++) {
            System.out.println("Student Physics Chemistry Maths Percentage Grade are as follows repectively" + (i + 1) + "     " + physicsMarks[i] + "    " + chemistryMarks[i] + "    " + mathsMarks[i] + "    " + String.format("%.2f", percentages[i]) + "%   " + grades[i]);
     }
  }
}
