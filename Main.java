import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final String ROCK="Rock";
    private static final String PAPER="Paper";
    private static final String SCISSORS="Scissors";
    private static String playerMove;

    static boolean PlayerChoice(){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Choose [R]ock,[P]aper or [S]cissors: ");
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
        }else {
            System.out.println("Invalid Input.Try Again...");
            return false;
        }

    }



    public static void main(String[] args) {
        int stillPlay=1;
        Scanner scanner=new Scanner(System.in);

        while (stillPlay==1) {
            boolean rightInput = false;
            Random random = new Random();

            while (!rightInput) {
                rightInput = PlayerChoice();
            }


            int computerNumber = random.nextInt(3);
            String computerMove;
            switch (computerNumber) {
                case 0:
                    computerMove = ROCK;
                    System.out.printf("\nIts %s vs %s\n", playerMove, computerMove);
                    if (playerMove.equals(computerMove))
                        System.out.println("DRAW");
                    else if (playerMove.equals(PAPER)) {
                        System.out.println("You WIN!");
                    } else
                        System.out.println("You LOSE!");
                    break;
                case 1:
                    computerMove = PAPER;
                    System.out.printf("\nIts %s vs %s\n", playerMove, computerMove);
                    if (playerMove.equals(computerMove))
                        System.out.println("DRAW");
                    else if (playerMove.equals(SCISSORS)) {
                        System.out.println("You WIN!");
                    } else
                        System.out.println("You LOSE!");
                    break;
                case 2:
                    computerMove = SCISSORS;
                    System.out.printf("\nIts %s vs %s\n", playerMove, computerMove);
                    if (playerMove.equals(computerMove))
                        System.out.println("DRAW");
                    else if (playerMove.equals(ROCK)) {
                        System.out.println("You WIN!");
                    } else
                        System.out.println("You LOSE!");
                    break;
            }

            System.out.println("\nDo you want to play again?\n" +
                    "  Write 1,if the answer is positive!");
            stillPlay=Integer.parseInt(scanner.nextLine());
        }

    }

}
