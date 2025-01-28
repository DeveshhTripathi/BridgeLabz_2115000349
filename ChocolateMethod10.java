import java.util.Scanner;
public class ChocolateMethod10{
        public int[] Choco(int chocolate, int student){
        int que = 0;
        int rem = 0;
        que = chocolate/student;
        rem = chocolate%student;
        return new int[] {que,rem};
        }
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total chocolates");
        int chocolate = sc.nextInt();
        System.out.println("Enter total students");
        int student = sc.nextInt();
        ChocolateMethod10 obj = new ChocolateMethod10();
        int[] ans = obj.Choco(chocolate,student);
        System.out.println("Chocolate each student got are: " +ans[0]+ " and remaining chocolates are: " +ans[1]);
  }
}
