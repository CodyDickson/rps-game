import java.util.Scanner;

public class RPSGame {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int scoreTie = 0;
        int scoreWin = 0;
        int scoreLose = 0;
        System.out.println("Rock, Paper, Scissors");
        System.out.println("!!!!!!!!!!!!!!!!!!!!");
        // Loop three times for three rounds of play
        for (int i = 1; i < 4; i++) {
            System.out.println("Round #" + i);
            // Ask the user for their choice and store it in variable user
            System.out.print("Select your move: R for Rock, P for Paper, S for Scissors: ");
            String user = input.next();
            // 0 = Rock, 1 = Paper, 2 = Scissors
            int rand = (int) (Math.random() * 2);
            // Run through all the possibilities
            if (user.equals("R") && rand == 0) {
                System.out.println("You chose Rock. Your opponent chose Rock. Tie!");
                scoreTie += 1;
            } else if (user.equals("R") && rand == 1) {
                System.out.println("You chose Rock. Your opponent chose Paper. You lose this round!");
                scoreLose += 1;
            } else if (user.equals("R") && rand == 2) {
                System.out.println("You chose Rock. Your opponent chose Scissors. You win this round!");
                scoreWin += 1;
            } else if (user.equals("P") && rand == 0) {
                System.out.println("You chose Paper. Your opponent chose Rock. You win this round!");
                scoreWin += 1;
            } else if (user.equals("P") && rand == 1) {
                System.out.println("You chose Paper. Your opponent chose Paper. Tie!");
                scoreTie += 1;
            } else if (user.equals("P") && rand == 2) {
                System.out.println("You chose Paper. Your opponent chose Scissors. You lose this round!");
                scoreLose += 1;
            } else if (user.equals("S") && rand == 0) {
                System.out.println("You chose Scissors. Your opponent chose Rock. You lose this round!");
                scoreLose += 1;
            } else if (user.equals("S") && rand == 1) {
                System.out.println("You chose Scissors. Your opponent chose Paper. You win this round!");
                scoreWin += 1;
            } else if (user.equals("S") && rand == 2) {
                System.out.println("You chose Scissors. Your opponent chose Scissors. Tie!");
                scoreTie += 1;
            }
        }
        // Finish up the game
        System.out.println("!!!!!!!!!!!!!!!!!!!!");
        System.out.println("The game is complete. Let's see how you did.");
        System.out.println("Win: " + scoreWin + " | Lose: " + scoreLose + " | Tie: " + scoreTie);
        System.out.println("Thanks for playing!");
    }
}
