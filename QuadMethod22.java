import java.util.Scanner;
public class QuadMethod22{
    public static double[] findRoots(double a, double b, double c){
        double delta = Math.pow(b, 2) - 4 * a * c;
        if(delta>0){
            double root1 =(-b + Math.sqrt(delta))/(2 * a);
            double root2 =(-b - Math.sqrt(delta))/(2 * a);
            return new double[]{root1, root2};
        }else if(delta==0){
            double root = -b/(2 * a);
            return new double[]{root};
        }else{
            return new double[0];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter coefficient a ");
        double a=sc.nextDouble();
        System.out.println("Enter coefficient b ");
        double b=sc.nextDouble();
        System.out.println("Enter coefficient c ");
        double c=sc.nextDouble();
        double[] roots = findRoots(a, b, c);
        if (roots.length==2){
            System.out.println("The roots are real and distinct ");
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        }else if(roots.length==1) {
            System.out.println("The roots are real and equal");
            System.out.println("Root " + roots[0]);
        }else{
            System.out.println("The equation has no real roots");
      }
  }
}
