package controllers;
import java.awt.event.*;
import javax.swing.JOptionPane;
import view.*;

/**
 * The LevelUpHandler class handles user interactions related to level up actions in the game.
 * It implements the ActionListener interface to listen for events triggered by user actions.
 */
public class LevelUpHandler implements ActionListener {
    /**
     * The LevelUp screen instance.
     */
    public static LevelUp levelUp;
    /**
     * The source of the event.
     */
    public static Object source;
    
    /**
     * Constructs a LevelUpHandler with the provided LevelUp screen instance.
     * @param levelUp The LevelUp screen instance associated with this handler.
     */
    public LevelUpHandler(LevelUp levelUp)
    {
        this.levelUp = levelUp;
    }

    /**
     * Handles user actions performed in the LevelUp screen.
     * Performs level up actions based on the selected attribute.
     * @param e The ActionEvent object representing the action performed.
     */
    public void actionPerformed(ActionEvent e)
    {
        source = e.getSource();
        if(source == levelUp.health)
        {
            if(CharacterCreationHandler.stats.getRunes() < (CharacterCreationHandler.player.stats.getLevel()*100) / 2)
            {
                JOptionPane.showMessageDialog(levelUp.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE); 
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(levelUp.frame,"Confirm Level Up?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                    CharacterCreationHandler.player.stats.increaseHealth(1);
                    CharacterCreationHandler.player.stats.decreaseRunes();
                    CharacterCreationHandler.player.stats.increaseLevel(1);
                    levelUp.frame.dispose();
                    new LevelUp();  
                }
                else{}
                
            }
        }
        else if(source == levelUp.strength)
        {
           if(CharacterCreationHandler.stats.getRunes() < (CharacterCreationHandler.player.stats.getLevel()*100) / 2)
            {
                JOptionPane.showMessageDialog(levelUp.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE); 
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(levelUp.frame,"Confirm Level Up?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                   CharacterCreationHandler.player.stats.increaseStrength(1);
                   CharacterCreationHandler.player.stats.decreaseRunes();
                   CharacterCreationHandler.player.stats.increaseLevel(1);
                   levelUp.frame.dispose();
                   new LevelUp(); 
                }
                else{}
                
            } 
        }
        else if(source == levelUp.intelligence)
        {
            if(CharacterCreationHandler.stats.getRunes() < (CharacterCreationHandler.player.stats.getLevel()*100) / 2)
            {
                JOptionPane.showMessageDialog(levelUp.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE); 
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(levelUp.frame,"Confirm Level Up?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                    CharacterCreationHandler.player.stats.increaseIntelligence(1);
                    CharacterCreationHandler.player.stats.decreaseRunes();
                    CharacterCreationHandler.player.stats.increaseLevel(1);
                    levelUp.frame.dispose();
                    new LevelUp();
                }
                else{}
                
            }
        }
        else if(source == levelUp.endurance)
        {
            if(CharacterCreationHandler.stats.getRunes() < (CharacterCreationHandler.player.stats.getLevel()*100) / 2)
            {
                JOptionPane.showMessageDialog(levelUp.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE); 
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(levelUp.frame,"Confirm Level Up?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                    CharacterCreationHandler.player.stats.increaseEndurance(1);
                    CharacterCreationHandler.player.stats.decreaseRunes();
                    CharacterCreationHandler.player.stats.increaseLevel(1);
                    levelUp.frame.dispose();
                    new LevelUp();  
                }
                else{}
                
            }
        }
        else if(source == levelUp.dexterity)
        {
            if(CharacterCreationHandler.stats.getRunes() < (CharacterCreationHandler.player.stats.getLevel()*100) / 2)
            {
                JOptionPane.showMessageDialog(levelUp.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE); 
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(levelUp.frame,"Confirm Level Up?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                    CharacterCreationHandler.player.stats.increaseDexterity(1);
                    CharacterCreationHandler.player.stats.decreaseRunes();
                    CharacterCreationHandler.player.stats.increaseLevel(1);
                    levelUp.frame.dispose();
                    new LevelUp();
                }
                else{}
                
            }
        }
        else if(source == levelUp.faith)
        {
            if(CharacterCreationHandler.stats.getRunes() < (CharacterCreationHandler.player.stats.getLevel()*100) / 2)
            {
                JOptionPane.showMessageDialog(levelUp.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE); 
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(levelUp.frame,"Confirm Level Up?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                  CharacterCreationHandler.player.stats.increaseFaith(1);
                    CharacterCreationHandler.player.stats.decreaseRunes();
                    CharacterCreationHandler.player.stats.increaseLevel(1);
                    levelUp.frame.dispose();
                    new LevelUp();  
                }
                else{}
                
            }
        }
        else
        {
            levelUp.frame.dispose();
            new GameLobby();
        }
        
    }
    
    
}
