package controllers;
import java.awt.event.*;
import view.*;

/**
 * The TitleScreenHandler class handles user actions on the title screen.
 */
public class TitleScreenHandler implements ActionListener{
    /** The title screen associated with this handler. */
    public static TitleScreen title;
    
    /** The source of the action event. */
    public static Object source;
    
    /**
     * Constructs a new TitleScreenHandler with the given title screen.
     * @param title The title screen to associate with this handler.
     */
    public TitleScreenHandler(TitleScreen title){
        this.title = title;
    }

    /**
     * Handles the action performed event triggered by user interaction.
     * @param e The ActionEvent object representing the user's action.
     */
    public void actionPerformed(ActionEvent e) {
        source = e.getSource();
        if (source == title.startButton) {
            title.mainFrame.dispose();
            new CharacterCreation();  
        } else if (source == title.exitButton) {
            title.mainFrame.dispose();
            displayCreditScreen(); 
        }
    }

    private void displayCreditScreen() {
        CreditScreen creditScreen = new CreditScreen();
        creditScreen.showCreditScreen();
    }
}
