/**
 * This package contains controller classes responsible for handling user interactions.
 */
package controllers;

import java.awt.event.*; // Import AWT event classes
import view.*;           // Import view-related classes


/**
 * The GameLobbyHandler class handles user interactions in the game lobby screen.
 * It implements the ActionListener interface to listen for events triggered by user actions.
 */
public class GameLobbyHandler implements ActionListener {

    private GameLobby lobby; // The game lobby instance
    private Object source;   // The source of the event

    /**
     * Constructs a GameLobbyHandler with the provided GameLobby instance.
     * @param lobby The GameLobby instance associated with this handler.
     */
    public GameLobbyHandler(GameLobby lobby) {
        this.lobby = lobby;
    }
    
    /**
     * Handles user actions performed in the game lobby screen.
     * @param e The ActionEvent object representing the action performed.
     */
    public void actionPerformed(ActionEvent e) {
        source = e.getSource();
        
        // Perform actions based on the event source
        if (source == lobby.fastTravel) {
            lobby.frame.dispose();
            new FastTravel();
        } else if (source == lobby.levelUp) {
            lobby.frame.dispose();
            new LevelUp();
        } else if (source == lobby.inventory) {
            // Handle inventory action
        } else if (source == lobby.shop) {
            lobby.frame.dispose();
            new Shop();
        } else {
            lobby.frame.dispose();
        }
    }
}
