package controllers;
import java.awt.event.*;
import view.*;

/**
 * The JobClassHandler class handles user interactions related to selecting job classes in the character creation process.
 * It implements the ActionListener interface to listen for events triggered by user actions.
 */
public class JobClassHandler implements ActionListener {
    /**
     * The SelectJobClass screen instance.
     */
    public static SelectJobClass jobScreen;
    /**
     * The source of the event.
     */
    public static Object source;
    
    /**
     * Constructs a JobClassHandler with the provided SelectJobClass screen.
     * @param jobScreen The SelectJobClass screen instance.
     */
    public JobClassHandler(SelectJobClass jobScreen){
        this.jobScreen = jobScreen;
    }

    /**
     * Handles user actions performed in the SelectJobClass screen.
     * Sets the selected job class and corresponding attributes for character creation.
     * @param e The ActionEvent object representing the action performed.
     */
    public void actionPerformed(ActionEvent e)
    {
        source = e.getSource();
        {
            if (source == jobScreen.selectButtons[0])
            {
                CharacterCreationHandler.jobClass = "Vagabond";
                CharacterCreationHandler.level = 9;
                CharacterCreationHandler.health = 15;
                CharacterCreationHandler.dexterity = 13;
                CharacterCreationHandler.strength = 14;
                CharacterCreationHandler.intelligence = 9;
                CharacterCreationHandler.endurance = 13;
                CharacterCreationHandler.faith = 8;
                CharacterCreationHandler.ccScreen.selectedJobClassLabel.setText("Job Class: Vagabond");
                jobScreen.mainFrame.dispose();
            }
            if (source == jobScreen.selectButtons[1])
            {
                CharacterCreationHandler.jobClass = "Samurai";
                CharacterCreationHandler.level = 9;
                CharacterCreationHandler.health = 12;
                CharacterCreationHandler.dexterity = 15;
                CharacterCreationHandler.strength = 12;
                CharacterCreationHandler.intelligence = 9;
                CharacterCreationHandler.endurance = 13;
                CharacterCreationHandler.faith = 8;
                CharacterCreationHandler.ccScreen.selectedJobClassLabel.setText("Job Class: Samurai");
                jobScreen.mainFrame.dispose();
            }
            if (source == jobScreen.selectButtons[2])
            {
                CharacterCreationHandler.jobClass = "Warrior";
                CharacterCreationHandler.level = 8;
                CharacterCreationHandler.health = 11;
                CharacterCreationHandler.dexterity = 16;
                CharacterCreationHandler.strength = 10;
                CharacterCreationHandler.intelligence = 10;
                CharacterCreationHandler.endurance = 11;
                CharacterCreationHandler.faith = 8;
                CharacterCreationHandler.ccScreen.selectedJobClassLabel.setText("Job Class: Warrior");
                jobScreen.mainFrame.dispose();
            }
            if (source == jobScreen.selectButtons[3])
            {
                CharacterCreationHandler.jobClass = "Prophet";
                CharacterCreationHandler.level = 7;
                CharacterCreationHandler.health = 10;
                CharacterCreationHandler.dexterity = 10;
                CharacterCreationHandler.strength = 11;
                CharacterCreationHandler.intelligence = 7;
                CharacterCreationHandler.endurance = 8;
                CharacterCreationHandler.faith = 16;
                CharacterCreationHandler.ccScreen.selectedJobClassLabel.setText("Job Class: Prophet");
                jobScreen.mainFrame.dispose();
            }
            if (source == jobScreen.selectButtons[4])
            {
                CharacterCreationHandler.jobClass = "Hero";
                CharacterCreationHandler.level = 7;
                CharacterCreationHandler.health = 14;
                CharacterCreationHandler.dexterity = 9;
                CharacterCreationHandler.strength = 16;
                CharacterCreationHandler.intelligence = 7;
                CharacterCreationHandler.endurance = 12;
                CharacterCreationHandler.faith = 8;
                CharacterCreationHandler.ccScreen.selectedJobClassLabel.setText("Job Class: Hero");
                jobScreen.mainFrame.dispose();
            }
            if (source == jobScreen.selectButtons[5])
            {
                CharacterCreationHandler.jobClass = "Astrologer";
                CharacterCreationHandler.level = 6;
                CharacterCreationHandler.health = 9;
                CharacterCreationHandler.dexterity = 12;
                CharacterCreationHandler.strength = 8;
                CharacterCreationHandler.intelligence = 16;
                CharacterCreationHandler.endurance = 9;
                CharacterCreationHandler.faith = 7;
                CharacterCreationHandler.ccScreen.selectedJobClassLabel.setText("Job Class: Astrologer");
                jobScreen.mainFrame.dispose();
            }
        }
    }

    
}
