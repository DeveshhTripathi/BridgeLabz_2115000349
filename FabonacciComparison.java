public class FabonacciComparison{
    public static int fibonacciRecursive(int n){
        if (n<=1) return n;
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
 }
    public static int fibonacciIterative(int n){
        int a=0, b=1, sum;
        if (n==0) return a;
        if (n==1) return b;
        for (int i=2; i<=n;i++){
            sum = a+b;
            a=b;
            b=sum;
      }
        return b;
  }
  public static void main(String[] args){
        int n=30;
        long startTime = System.nanoTime();
        int resultRecursive = fibonacciRecursive(n);
        long endTime = System.nanoTime();
        long recursiveTime = endTime-startTime;
        startTime = System.nanoTime();
        int resultIterative = fibonacciIterative(n);
        endTime = System.nanoTime();
        long iterativeTime = endTime - startTime;
        System.out.println("Time taken (Recursive): " + recursiveTime + " ns");
        System.out.println("Time taken (Iterative): " + iterativeTime + " ns");
  }
}
