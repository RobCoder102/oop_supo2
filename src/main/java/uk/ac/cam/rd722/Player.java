// Player.java

package uk.ac.cam.rd722;

public class Player {
    private final String name;
    private int wins;
    private int attempts;
    public String getName() {
        return name;
    }
    Player(String name) {
        this.name = name;
        wins = 0;
        attempts = 0;
    }
    public void won() {
        attempts++;
        wins++;
    }
    public void lost() {
        attempts++;
    }
    public String getStatistics() {
        return "\nName: " + name + "\nGames played: " + attempts + "\nWins: " + wins + "\nWin rate: " + (100*wins/attempts) + "%";
    }
}
