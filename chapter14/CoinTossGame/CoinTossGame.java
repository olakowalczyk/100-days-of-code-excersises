package chapter14.CoinTossGame;

import java.util.Scanner;

public class CoinTossGame {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        CoinTossGame game = new CoinTossGame();
        Player player1 = new Player(game.askPlayerName());
        Player player2 = new Player(game.askPlayerName());

        player1.setGuess(game.askGuess());
        if (player1.getGuess() == Coin.HEADS) {
            player2.setGuess(Coin.TAILS);
        } else {
            player2.setGuess(Coin.HEADS);
        }

        Coin coin = new Coin();
        coin.flip();
        game.decideWhoWin(player1, player2, coin);
        game.scanner.close();
    }

    public String askPlayerName() {
        System.out.println("Provide player's name");
        return scanner.next();
    }

    public String askGuess() {
        System.out.println("Player1 what you choose? Heads or Tails?");
        String guess = scanner.next();

        while(!guess.equalsIgnoreCase(Coin.HEADS) && !guess.equalsIgnoreCase(Coin.TAILS)){
            System.out.println("Invalid input. Heads or Tails?");
            guess = scanner.next();
        }
        return guess;
    }

    public void decideWhoWin(Player player1, Player player2, Coin coin) {
        if (player1.getGuess().equalsIgnoreCase(coin.getSide())) {
            System.out.println(player1.getName() + " wins");
        } else {
            System.out.println(player2.getName() + " wins");
        }
    }
}
