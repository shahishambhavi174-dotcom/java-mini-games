import java.util.Random;
import java.util.Scanner ;
public class RockPaperScissors{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        System.out.println("WELCOME TO ROCK-PAPER-SCISSORS!!!");
        System.out.println("ENTER YOUR CHOICE: 0 for rock\n 1 for paper\n 2 for scissors");
        int userchoice=sc.nextInt();
        int computerchoice=random.nextInt(3);

        //display choice
        String[] choice={"rock","paper","scissors"};
        System.out.println("you choose:"+choice[userchoice]);
        System.out.println("computer choose:"+choice[computerchoice]);

        //determine winner
        if(userchoice==computerchoice){
            System.out.println("IT IS A TIE!!!");
        }
        else if((userchoice==0&&computerchoice==2||userchoice==1&&computerchoice==0||userchoice==2&&computerchoice==1)){
            System.out.println("YOU WIN!!!");
        }
        else{
            System.out.println("COMPUTER WIN!!");
        }
        sc.close();
    }
}



    

