public class RockPaperScissors {
    public static String rps(String player1, String player2) {
        if (player1.equals(player2)) {
            return "Tie";
        }
        if ((player1.equals("rock") && player2.equals("scissors")) ||
            (player1.equals("scissors") && player2.equals("paper")) ||
            (player1.equals("paper") && player2.equals("rock"))) {
            return "Player 1 wins";
        } else {
            return "Player 2 wins";
        }
    }

    public static void main(String[] args) {
        System.out.println(rps("rock", "paper")); // Player 2 wins
        System.out.println(rps("paper", "rock")); // Player 1 wins
        System.out.println(rps("paper", "scissors")); // Player 2 wins
        System.out.println(rps("scissors", "scissors")); // Tie
        System.out.println(rps("scissors", "paper")); // Player 1 wins
    }
}