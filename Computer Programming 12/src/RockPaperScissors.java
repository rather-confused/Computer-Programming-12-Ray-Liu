import java.util.Scanner;

public class RockPaperScissors {
    //variables
    private static int aiscore = 0;
    private static int playerscore = 0;
    private static int playermove;
    private static int aimove;

    //running main code
    public static void main(String[] args) {
        rockpaperscissors();
    }


    public static void rockpaperscissors() {
        //main code

        //player move selection code
        System.out.println("Please select your move.");
        Scanner rpsinput = new Scanner(System.in);
        System.out.println("Rock        Paper       Scissors");
        String playerinput = rpsinput.nextLine();

        //player move input & variable update code
        if (playerinput.equals("rock") || playerinput.equals("Rock")) {
            playermove = 1;
        } else if (playerinput.equals("paper") || playerinput.equals("Paper")) {
            playermove = 2;
        } else if (playerinput.equals("scissors") || playerinput.equals("Scissors")) {
            playermove = 3;
        } else {
            System.out.println("Sorry, that response is invalid. Please Try Again.");
            rockpaperscissors();
        }
        //random computer generated move
        int aimove = (int) (Math.random() * 3) + 1;

        if (aimove == 1) {
            System.out.println("\nComputer's move: Rock");
        } else if (aimove == 2) {

            System.out.println("\nComputer's move: Paper");

        } else {

            System.out.println("\nComputer's move: Scissors");

        }

        //deciding whether you win or lose the rock paper scissors match
        if (playermove - aimove == -2 || playermove - aimove == 1) {
            playerscore++;
            System.out.println("You win!");
        } else if (playermove - aimove == -1 || playermove - aimove == 2) {
            aiscore++;
            System.out.println("You lost.");
        } else {
            System.out.println("It's a tie!");
            System.out.println("\nYour score: " + playerscore);
            System.out.println("Computer's score: " + aiscore);
            rockpaperscissors();
        }

        //post match statistics
        System.out.println("\nYour score: " + playerscore);
        System.out.println("Computer's score: " + aiscore);

        //play again?
        System.out.println("Play Again?\ny/n");
        Scanner playagain = new Scanner(System.in);
        String againchoice = playagain.nextLine();
        if (againchoice.equals("y") || againchoice.equals("yes") || againchoice.equals("Yes") || againchoice.equals("Y")) {
            rockpaperscissors();
        } else {
            System.out.println("Thanks for Playing!");
            System.exit(0);
        }
    }
}