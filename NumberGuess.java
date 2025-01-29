import java.util.Scanner;
import java.util.Random;
public class NumberGuess{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Think of a number between 1 and 100, and I'll try to guess it!");
        playGame();
}
    public static void playGame(){
        int low = 1, high = 100, guess;
        String feedback;
        while (low <= high){
            guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + " Enter H for high, L for low, C for correct");
            feedback = sc.next().toUpperCase();
            if (feedback.equals("C")){
                System.out.println("Number guessed correctly!");
                return;
            }else if(feedback.equals("H")){
                high = guess - 1;
            }else if(feedback.equals("L")){
                low=guess + 1;
            }else{
                System.out.println("Invalid input");
         }
    }
        System.out.println("Something went wrong");
    }
    public static int generateGuess(int low, int high){
        return (low+high)/2;
  }
}

