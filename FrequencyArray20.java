import java.util.Scanner;
public class FrequencyArray20{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number ");
        int num= sc.nextInt();
	int copy=num;
	int count=0;
	while(copy!=0){
	copy =copy/10;
	count++;
	}
        int[] frequency = new int[count];
        while(num!=0){
            int digit = num%10;
            frequency[digit]++;
            num/=10;
        }
        System.out.println("Frequency of each digit is");
        for(int i=0;i<10;i++){
            if(frequency[i] > 0){
                System.out.println(i + " - "+ frequency[i]);
       }
     }
  }
}
