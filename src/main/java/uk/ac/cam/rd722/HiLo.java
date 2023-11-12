// HiLo.java

package uk.ac.cam.rd722;

import java.util.Objects;
import java.util.Scanner;

public class HiLo {

    private Scoreboard scoreboard;

    HiLo() {
        scoreboard = new Scoreboard();
    }

    public void enterHiLo() {
        String option;
        while (true) {
            option = "";
            System.out.println("Welcome to HiLo. Enter your name:");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            Player player = scoreboard.getExistingPlayer(name);
            if (player != null) System.out.println("Welcome back " + name + "!");
            else {
                player = new Player(name);
                scoreboard.addNewPlayer(player);
                System.out.println("Player " + name + " registered.");
            }
            while (!option.equals("c")) {
                System.out.println("Select difficulty (1-5):");
                int difficulty = sc.nextInt();
                sc.nextLine(); // otherwise will leave a \n
                Game currentGame = new Game(player, difficulty);
                currentGame.playGame(sc);
                scoreboard.addFinishedGame(currentGame);
                option = "s";
                while (!option.equals("a") && !option.equals("c")) {
                    System.out.println("\nWould you like to play again (a), change player (c), display scoreboard information (s), or quit HiLo (q)?");
                    option = sc.nextLine();
                    if (option.equals("q")) {
                        System.out.println("Thank you for playing!");
                        return;
                    } else if (option.equals("s")) scoreboard.displayInformation();
                }
            }
        }
    }

    public static void main(String[] args) {
        HiLo hilo = new HiLo();
        hilo.enterHiLo();
    }
}
