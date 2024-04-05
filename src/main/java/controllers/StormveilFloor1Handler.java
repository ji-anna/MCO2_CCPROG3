package controllers;
import java.awt.Color;
import view.*;
import java.awt.event.*;

/**
 * KeyListener implementation for handling player movement on Stormveil Floor 1.
 */
public class StormveilFloor1Handler implements KeyListener {
    /** The StormveilFloor1 view associated with this handler. */
    public static StormveilFloor1 floor1;
    
    /** The source of the key event. */
    public static int source;
    
    /**
     * Constructor to initialize the StormveilFloor1Handler with the associated StormveilFloor1 view.
     * 
     * @param floor1 The StormveilFloor1 view to associate with this handler.
     */
    public StormveilFloor1Handler(StormveilFloor1 floor1)
    {
        this.floor1 = floor1;
    }
    
    /**
     * Handles the key released event to move the player character.
     * 
     * @param e The KeyEvent triggered by releasing a key.
     */
    public void keyReleased(KeyEvent e) {
    source = e.getKeyCode();
    if (source == KeyEvent.VK_W) {
        for (int i = 0; i < floor1.panels.length; i++) {
            if (floor1.labels[i].getText().equals("P")) {
                
                if (i >= 3) {
                    floor1.labels[i].setText(" ");
                    floor1.labels[i - 3].setText("P");
                    floor1.frame.repaint();
                    break;
                }
                else
                {
                    break;
                }
                  
            }
        }
    } else if (source == KeyEvent.VK_A) {
        for (int i = 0; i < floor1.panels.length; i++) {
            if (floor1.labels[i].getText().equals("P")) {
                
                if (i % 3 != 0) {
                    floor1.labels[i].setText(" ");
                    floor1.labels[i - 1].setText("P");
                    floor1.frame.repaint();
                    break;
                }
                else break;
                
            }
        }
    } else if (source == KeyEvent.VK_S) {
        for (int i = 0; i < floor1.panels.length; i++) {
            if (floor1.labels[i].getText().equals("P"))
            {
                if (i + 3 < floor1.panels.length) {
                    floor1.labels[i].setText(" ");
                    floor1.labels[i + 3].setText("P");
                    floor1.frame.repaint();
                    break;
                }
                else
                {
                    break;
                }
            }
        }
    } else if (source == KeyEvent.VK_D) {
        for (int i = 0; i < floor1.panels.length; i++) {
            if (floor1.labels[i].getText().equals("P")) {
                
                if ((i + 1) % 3 != 0) {
                    floor1.labels[i].setText(" ");
                    floor1.labels[i + 1].setText("P");
                    floor1.frame.repaint();
                    break;
                }
                else
                {
                    break;
                }
                
            }
        }
    }
}
    /**
     * Handles the key pressed event.
     * 
     * @param e The KeyEvent triggered by pressing a key.
     */
    public void keyPressed(KeyEvent e)
    {
        
    }
    /**
     * Handles the key typed event.
     * 
     * @param e The KeyEvent triggered by typing a key.
     */
    public void keyTyped(KeyEvent e)
    {
        
    }
    
}
