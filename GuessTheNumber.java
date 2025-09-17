import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        //rand number between 1-100
        int NumberToGuess=rand.nextInt(100)+1;
        int userguess=0;
        int attempts=0;
    
    System.out.println("WELCOME TO GUESS THE NUMBER!!!!");
    System.out.println("I HAVE SELECTED A NUMBER BETWEEN 1-100.TRY TO GUESS IT!");
    //LOOP until the user guess correctly
    while(userguess!=NumberToGuess){
        System.out.println("ENTER THE GUESS:");
        userguess=sc.nextInt();
        attempts++;
        if(userguess<NumberToGuess){
            System.out.println("TOO LOW... TRY AGAIN!!");
        }
        else if(userguess>NumberToGuess){
            System.out.println("TOO HIGH....TRY AGAIN!!");
        }
        else{
            System.out.println("CONGRATULATION YOU GUESSED THE NUMBER"+ NumberToGuess+"CORRECTLY!!");
            System.out.println("IT TOOK YOU"+attempts+"attempts");
        }
    }
    sc.close();
    }
    
}
