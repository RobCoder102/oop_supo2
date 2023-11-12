// Game.java

package uk.ac.cam.rd722;

import java.util.Scanner;

public class Game {
    private final Player player;
    private final int difficulty;
    private int guessesLeft;
    private final int maxNum;
    private final int num;
    public void playGame(Scanner sc) {
        System.out.println("Enter a number:");
        int guess = sc.nextInt();
        sc.nextLine(); // otherwise will leave a \n
        while (guess != num) {
            guessesLeft--;
            if (guessesLeft == 0) {
                System.out.println("Out of guesses! The number was " + num);
                player.lost();
                return;
            }
            if (num > guess) System.out.println("Go higher!");
            if (num < guess) System.out.println("Go lower!");
            System.out.println("You have " + guessesLeft + " guesses left.");
            System.out.println("Next guess:");
            guess = sc.nextInt();
            sc.nextLine(); // otherwise will leave a \n
        }
        System.out.println("Correct!");
        player.won();
    }

    public String getStatistics() {
        if (guessesLeft > 0) return "At difficulty " + difficulty + ", " + player.getName() + " won with " + guessesLeft + " guesses left";
        return "At difficulty " + difficulty + ", " + player.getName() + " did not guess correctly";
    }

    Game(Player player, int difficulty) {
        this.player = player;
        this.difficulty = difficulty;
        guessesLeft = 11-difficulty;
        maxNum = 90 + 10*difficulty;
        num = (int)(maxNum*Math.random())+1;
    }
}
