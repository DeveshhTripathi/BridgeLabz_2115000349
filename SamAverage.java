public class SamAverage{
    public static void main(String[] args) {
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        int totalMarks = maths + physics + chemistry;
        int totaSubjects = 3;

        double averagePercentage = (double) totalMarks / totalSubjects;

        System.out.println("Sam's average mark in PCM is " + averagePercentage);
    }
}
