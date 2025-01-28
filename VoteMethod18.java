import java.util.Scanner;
public class VoteMethod18{
    public boolean canVote(int age){
        if (age<0) {
            return false;
        }
        return age >= 18;
  }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        VoteMethod18 voteCheck=new VoteMethod18();
        int[] studentAges=new int[10];
        for (int i=0;i<10;i++) {
            System.out.println("Enter the age of student " + (i + 1));
            studentAges[i] = sc.nextInt();
        }
        for (int i=0;i<10;i++) {
            boolean canVote = voteCheck.canVote(studentAges[i]);
            if(canVote){
                System.out.println("Student "+(i + 1)+" with age " + studentAges[i] + " can vote");
            }else{
                System.out.println("Student "+(i + 1)+" with age " + studentAges[i] + " can not vote");
       }
    }
  }
}
