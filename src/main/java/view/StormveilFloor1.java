
package view;
import java.awt.*;
import controllers.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 * Represents the graphical user interface for Stormveil Floor 1.
 * This class creates a JFrame with a grid layout representing the floor layout.
 * Certain panels are colored differently to represent different elements of the floor.
 * It also registers a key listener for handling player movements.
 */
public class StormveilFloor1 {
    /** The JFrame representing the Stormveil Floor 1 interface. */
    public JFrame frame;
    
    /** Array of JPanels representing individual tiles on the floor. */
    public JPanel[] panels;
    
    /** Array of JLabels representing the content of each tile on the floor. */
    public JLabel[] labels;
 
    /**
     * Constructs a new StormveilFloor1 object and initializes the user interface.
     */
    public StormveilFloor1()
    {
        initializeUI();
    }

    /**
     * Initializes the user interface components.
     */
    private void initializeUI()
    {
        frame = new JFrame("Stormveil Floor 1");
        frame.setLayout(new GridLayout(7,3));
        frame.setSize(500,700);
        
        panels = new JPanel[21];
        labels = new JLabel[21];
        for(int i = 0; i<panels.length; i++)
        {
            if( i == 1)
            {
              panels[i] = new JPanel();
              panels[i].setBackground(Color.orange);
              panels[i].setBorder(new LineBorder(Color.WHITE));
              labels[i] = new JLabel();
              labels[i].setText(" ");
              labels[i].setSize(25, 25);
              labels[i].setForeground(Color.WHITE); 
              panels[i].add(labels[i]);
              frame.add(panels[i]);
            }
            else if(i == 3 || i == 5)
            {
                panels[i] = new JPanel();
                panels[i].setBackground(Color.cyan);
                panels[i].setBorder(new LineBorder(Color.WHITE));
                labels[i] = new JLabel();
                labels[i].setText(" ");
                labels[i].setSize(25, 25);
                labels[i].setForeground(Color.WHITE); 
                panels[i].add(labels[i]);
                frame.add(panels[i]); 
            }
            else if(i == 19)
            {
               panels[i] = new JPanel();
               panels[i].setBackground(Color.green);
               panels[i].setBorder(new LineBorder(Color.WHITE));
               labels[i] = new JLabel();
               labels[i].setText("P");
               labels[i].setSize(25, 25);
               labels[i].setForeground(Color.WHITE); 
               panels[i].add(labels[i]);
               frame.add(panels[i]); 
            }
            else
            {
               panels[i] = new JPanel();
               panels[i].setBackground(new Color(51, 51, 51));
               panels[i].setBorder(new LineBorder(Color.WHITE));
               labels[i] = new JLabel();
               labels[i].setText(" ");
               labels[i].setSize(25, 25);
               labels[i].setForeground(Color.WHITE); 
               panels[i].add(labels[i]);
               frame.add(panels[i]);  
            }
        }
        
        StormveilFloor1Handler b = new StormveilFloor1Handler(this);
        frame.addKeyListener(b);
        frame.setVisible(true);
    }
}
