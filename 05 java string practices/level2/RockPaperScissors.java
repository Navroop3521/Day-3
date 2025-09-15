package level2;

import java.util.Scanner;

public class RockPaperScissors {
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); 
        if (choice == 0)
            return "Rock";
        else if (choice == 1)
            return "Paper";
        else
            return "Scissors";
    }

    public static String findWinner(String player, String computer) {
        if (player.equals(computer)) {
            return "Draw";
        } else if ((player.equals("Rock") && computer.equals("Scissors")) ||
                (player.equals("Paper") && computer.equals("Rock")) ||
                (player.equals("Scissors") && computer.equals("Paper"))) {
            return "Player";
        } else {
            return "Computer";
        }
    }

    public static String[][] calculateStats(int playerWins, int computerWins, int draws, int totalGames) {
        String[][] stats = new String[3][2];

        // Player 
        stats[0][0] = "Player Wins";
        stats[0][1] = playerWins + " (" + String.format("%.2f", (playerWins * 100.0 / totalGames)) + "%)";

        // Computer
        stats[1][0] = "Computer Wins";
        stats[1][1] = computerWins + " (" + String.format("%.2f", (computerWins * 100.0 / totalGames)) + "%)";

        // Draw 
        stats[2][0] = "Draws";
        stats[2][1] = draws + " (" + String.format("%.2f", (draws * 100.0 / totalGames)) + "%)";

        return stats;
    }

    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tPlayer Choice\tComputer Choice\tWinner");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println(
                    (i + 1) + "\t" + gameResults[i][0] + "\t\t" + gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }

        System.out.println("\nFinal Statistics:");
        System.out.println("-------------------------");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + ":\t" + stats[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();

        String[][] gameResults = new String[n][3];
        int playerWins = 0, computerWins = 0, draws = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter your choice (Rock, Paper, Scissors): ");
            String playerChoice = sc.next();

            String computerChoice = getComputerChoice();
            String winner = findWinner(playerChoice, computerChoice);

            if (winner.equals("Player"))
                playerWins++;
            else if (winner.equals("Computer"))
                computerWins++;
            else
                draws++;

            gameResults[i][0] = playerChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(playerWins, computerWins, draws, n);
        displayResults(gameResults, stats);

        sc.close();
    }
}
