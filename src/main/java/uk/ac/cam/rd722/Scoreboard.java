// Scoreboard.java

package uk.ac.cam.rd722;

import java.util.Vector;

public class Scoreboard {
    private Vector<Player> previousPlayers;
    private Vector<Game> previousGames;
    Scoreboard() {
        previousPlayers = new Vector<Player>();
        previousGames = new Vector<Game>();
    }
    public Player getExistingPlayer(String name) {
        for (int i = 0; i < previousPlayers.size(); i++) {
            Player prevPlayer = previousPlayers.elementAt(i);
            if (prevPlayer.getName().equals(name)) return prevPlayer;
        }
        return null;
    }

    public void addNewPlayer(Player player) {
        previousPlayers.add(player);
    }

    public void addFinishedGame(Game game) {
        previousGames.add(game);
    }

    public void displayInformation() {
        System.out.println("Games played: ");
        for (int i = 0; i < previousGames.size(); i++) System.out.println(previousGames.elementAt(i).getStatistics());
        System.out.println("\nPlayers: ");
        for (int i = 0; i < previousPlayers.size(); i++) System.out.println(previousPlayers.elementAt(i).getStatistics());
    }
}
