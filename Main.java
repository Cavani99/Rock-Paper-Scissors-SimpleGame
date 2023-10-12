import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final String ROCK="Rock";
    private static final String PAPER="Paper";
    private static final String SCISSORS="Scissors";
    private static String playerMove;

    private static int GamesPlayed=0;
    private static int Wins=0;
    private static int Draws=0;
    private static int Losses=0;


    static boolean PlayerChoice(){
        Scanner scanner=new Scanner(System.in);

        while(true){
            System.out.print("Choose [R]ock,[P]aper or [S]cissors! ");
            System.out.print("\nWrite [Q]uit or [E]nd to finish the game!");
            playerMove =scanner.nextLine();

            if(playerMove.equalsIgnoreCase("r")
                    || playerMove.equalsIgnoreCase("Rock")) {
                playerMove = ROCK;
                return true;
            }
            else if(playerMove.equalsIgnoreCase("p")
                    || playerMove.equalsIgnoreCase("Paper")) {
                playerMove = PAPER;
                return true;
            }
            else if(playerMove.equalsIgnoreCase("s")
                    || playerMove.equalsIgnoreCase("Scissors")) {
                playerMove = SCISSORS;
                return true;
            }else if(playerMove.equalsIgnoreCase("quit") || playerMove.equalsIgnoreCase("q")
                    || playerMove.equalsIgnoreCase("end") || playerMove.equalsIgnoreCase("e")){
                if(GamesPlayed==0)
                    System.out.println("Why did you start the game ,if you are not going to play :( :( :(");
                else
                 System.out.printf("\nFor %d Games played you WON: %d times, DREW %d times and had %d LOSSES",
                        GamesPlayed,Wins,Draws,Losses);
                return false;
            }else{
                System.out.println("Wrong input!\n");
            }
        }

    }



    public static void main(String[] args) {
        String stillPlay= String.valueOf(PlayerChoice());

        while (stillPlay.equals("true")) {
            Random random = new Random();

            GamesPlayed++;

            int computerNumber = random.nextInt(3);
            String computerMove;
            switch (computerNumber) {
                case 0:
                    computerMove = ROCK;
                    System.out.printf("\nIts %s vs %s\n", playerMove, computerMove);
                    if (playerMove.equals(computerMove)){
                        System.out.println("DRAW");
                        Draws++;
                    }
                    else if (playerMove.equals(PAPER)) {
                        System.out.println("You WIN!");
                        Wins++;
                    } else{
                        System.out.println("You LOSE!");
                        Losses++;
                    }
                    break;
                case 1:
                    computerMove = PAPER;
                    System.out.printf("\nIts %s vs %s\n", playerMove, computerMove);
                    if (playerMove.equals(computerMove)){
                        System.out.println("DRAW");
                        Draws++;
                    }
                    else if (playerMove.equals(SCISSORS)) {
                        System.out.println("You WIN!");
                        Wins++;
                    } else{
                        System.out.println("You LOSE!");
                        Losses++;
                    }
                    break;
                case 2:
                    computerMove = SCISSORS;
                    System.out.printf("\nIts %s vs %s\n", playerMove, computerMove);
                    if (playerMove.equals(computerMove)){
                        System.out.println("DRAW");
                        Draws++;
                    }
                    else if (playerMove.equals(ROCK)) {
                        System.out.println("You WIN!");
                        Wins++;
                    } else{
                        System.out.println("You LOSE!");
                        Losses++;
                    }
                    break;
            }

            System.out.println("\n Do you want to play again?\n" +
                    "");
            stillPlay= String.valueOf(PlayerChoice());
        }

    }

}
