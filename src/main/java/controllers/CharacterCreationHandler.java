package controllers;
import java.awt.event.*;
import javax.swing.JOptionPane;
import view.*;
import models.*;

/**
 * This class handles user interactions in the character creation screen.
 * It implements the ActionListener interface to listen for events triggered by user actions.
 */
public class CharacterCreationHandler implements ActionListener {
     /**
     * The character creation screen instance.
     */
    public static CharacterCreation ccScreen;
    
    /**
     * The source of the event.
     */
    public static Object source;
    
    /**
     * The player instance.
     */
    public static Player player;
    
    /**
     * The player's statistics.
     */
    public static Stats stats;
    
    /**
     * The player's name.
     */
    public static String name = "";
    
    /**
     * The player's job class.
     */
    public static String jobClass = "";
    
    /**
     * The player's level.
     */
    public static int level = 0;
    
    /**
     * The player's health.
     */
    public static int health = 0;
    
    /**
     * The player's dexterity.
     */
    public static int dexterity = 0;
    
    /**
     * The player's strength.
     */
    public static int strength = 0;
    
    /**
     * The player's intelligence.
     */
    public static int intelligence = 0;
    
    /**
     * The player's endurance.
     */
    public static int endurance = 0;
    
    /**
     * The player's faith.
     */
    public static int faith = 0;
    
   /**
     * Constructs a CharacterCreationHandler with the provided CharacterCreation screen.
     * @param ccScreen The CharacterCreation screen instance.
     */
    public CharacterCreationHandler(CharacterCreation ccScreen)
    {
        this.ccScreen = ccScreen;
        this.player = new Player();
        this.stats = new Stats();
        
    }
    /**
     * Handles user actions performed in the character creation screen.
     * @param e The ActionEvent object representing the action performed.
     */
    public void actionPerformed(ActionEvent e)
    {
        source = e.getSource();
        if (source == ccScreen.inputNameButton) {
            boolean validNameEntered = false;
            while (!validNameEntered) {
                name = JOptionPane.showInputDialog(ccScreen.mainFrame, "Enter your player name (up to 25 characters):");
                if (name != null) { 
                    
                    if (name.length() > 25) {
                        JOptionPane.showMessageDialog(ccScreen.mainFrame, "Name exceeds 25 characters. Please enter a shorter name.",
                                "Invalid Name", JOptionPane.WARNING_MESSAGE);
                    } else if (name.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(ccScreen.mainFrame, "No player name provided",
                                "No name provided", JOptionPane.WARNING_MESSAGE);
                    } else {
                        validNameEntered = true;
                        ccScreen.playerNameLabel.setText("Player: " + name);
                        player.setPlayerName(name);
                    }
                    if (!validNameEntered) {
                        continue; 
                    }
                } else {
                    
                    validNameEntered = true; 
                }
            }
        }
        else if (source == ccScreen.selectJobClassButton)
        {
            new SelectJobClass();
        }
        else if(source == ccScreen.confirmButton)
        {
            if(name.trim().equals("") || jobClass.trim().equals(""))
            {
                if(name.trim().equals(""))
                {
                   JOptionPane.showMessageDialog(ccScreen.mainFrame,"Please enter your name.", 
                                "Incomplete Input", JOptionPane.ERROR_MESSAGE); 
                }
                else if(jobClass.trim().equals(""))
                {
                    JOptionPane.showMessageDialog(ccScreen.mainFrame,"Please select a job class.", 
                                "Incomplete Input", JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                stats = new Stats(level,health,dexterity,intelligence,endurance,strength,faith);
                player = new Player(name,jobClass,stats);
                ccScreen.mainFrame.dispose();
                System.out.println("Player Name: " + player.getPlayerName());
                System.out.println("Job Class: " + player.getSelectedJobClass());
                System.out.println("Level: " + player.stats.getLevel());
                System.out.println("Health: " + player.stats.getHealth());
                
                System.out.println("Dexterity: " + player.stats.getDexterity());
                System.out.println("Intelligence: " + player.stats.getIntelligence());
                System.out.println("Endurance: " + player.stats.getEndurance());
                System.out.println("Strength: " + player.stats.getStrength());
                System.out.println("Faith: " + player.stats.getFaith());
                System.out.println("Runes: " +player.stats.getRunes());
                new GameLobby();
            }
        }
        else
        {
            ccScreen.mainFrame.dispose();
            new TitleScreen();
        }
    
    }
}
