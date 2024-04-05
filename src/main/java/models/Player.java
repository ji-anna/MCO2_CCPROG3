package models;

/**
 * The Player class represents a player in the game.
 */
public class Player {
    
    /** The name of the player. */
    private String playerName;
    
    /** The selected job class of the player. */
    private String selectedJobClass;
    
    /** The statistics of the player. */
    public Stats stats;

    /**
     * Constructs a new Player object with default values.
     */
    public Player() {}
    
    /**
     * Constructs a new Player object with the specified parameters.
     * @param playerName The name of the player.
     * @param selectedJobClass The selected job class of the player.
     * @param stats The statistics of the player.
     */
    public Player(String playerName, String selectedJobClass, Stats stats) {
        this.playerName = playerName;
        this.selectedJobClass = selectedJobClass;
        this.stats = stats;
    }
    
    /**
     * Gets the name of the player.
     * @return The name of the player.
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * Sets the name of the player.
     * @param playerName The name of the player.
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     * Gets the selected job class of the player.
     * @return The selected job class of the player.
     */
    public String getSelectedJobClass() {
        return selectedJobClass;
    }

    /**
     * Sets the selected job class of the player.
     * @param selectedJobClass The selected job class of the player.
     */
    public void setSelectedJobClass(String selectedJobClass) {
        this.selectedJobClass = selectedJobClass;
    }
}
