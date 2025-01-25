import java.util.Scanner;
public class FizzBuzzArray10{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number ");
	int num = sc.nextInt();
	String[] str = new String[num];
	for(int i=0;i<num;i++){
	if(i%3==0 && i%5==0){
	str[i] = "FizzBuzz";
	}
	else if(i%3==0){
	str[i] = "Fizz";
	}
	else if(i%5==0){
	str[i] = "Buzz";
	}else{
	str[i]= Integer.toString(i);
      }
    }
	for(String s : str){
	System.out.println(s);
	}
  }
}
