import java.util.Scanner;
import java.util.Random;
public class Score{
    static int[][] generateScores(int numStudents){
        Random random = new Random();
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++){
            scores[i][0] = random.nextInt(41) + 60; //
            scores[i][1] = random.nextInt(41) + 60; //
            scores[i][2] = random.nextInt(41) + 60; //
        }
        return scores;
    }
    static double[][] calculateResults(int[][] scores){
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++){
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average=total/3.0;
            double percentage=total/3.0;
            results[i][0]=total;
            results[i][1]=Math.round(average * 100.0)/100.0;
            results[i][2]=Math.round(percentage * 100.0)/100.0;
        }
        return results;
    }
    static void displayScoreCard(int[][] scores, double[][] results){
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%n", "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percent", "Grade");
        for (int i = 0; i < scores.length; i++){
            String grade;
            double percent = results[i][2];
            if (percent >= 80) grade = "A";
            else if (percent >= 70) grade = "B";
            else if (percent >= 60) grade = "C";
            else if (percent >= 50) grade = "D";
            else if (percent >= 40) grade = "E";
            else grade = "R";
            System.out.printf("%-10d%-10d%-10d%-10d%-10.2f%-10.2f%-10.2f%-10s%n", i + 1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2], grade);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();
        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        displayScoreCard(scores, results);
    }
}
