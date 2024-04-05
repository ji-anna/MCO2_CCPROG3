package view;

import controllers.*;
import javax.swing.*;

/**
 * Class representing the character creation screen.
 */
public class CharacterCreation {
    /** Button for inputting player name. */
    public JButton inputNameButton;
    
    /** Button for selecting job class. */
    public JButton selectJobClassButton;
    
    /** Button for navigating back. */
    private JButton backButton;
    
    /** Button for confirming character creation. */
    public JButton confirmButton;
    
    /** Label displaying the title of the character creation screen. */
    private JLabel titleLabel;
    
    /** Label displaying the player's name. */
    public JLabel playerNameLabel;
    
    /** Label displaying the selected job class. */
    public JLabel selectedJobClassLabel; 
    
    /** Panel containing the UI elements of the character creation screen. */
    private JPanel mainPanel;
    
    /** Frame for the character creation screen. */
    public JFrame mainFrame;
    
    /**
     * Constructor to create a CharacterCreation object and initialize the UI.
     */
    public CharacterCreation(){
        initializeUI();
    }

    /**
     * Initializes the UI elements of the character creation screen.
     */
    private void initializeUI(){
        mainFrame = new JFrame("Character Creation");
        mainFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setSize(500,350);
        mainFrame.setResizable(false);
        
        titleLabel = new JLabel("CHARACTER CREATION");
        titleLabel.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 30));
        titleLabel.setForeground(new java.awt.Color(204, 153, 0));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setBounds(10, 10, 480, 50);

        playerNameLabel = new JLabel("Player: ");
        playerNameLabel.setFont(new java.awt.Font("DialogInput", 1, 12));
        playerNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        playerNameLabel.setBounds(12, 58, 150, 17);

        selectedJobClassLabel = new JLabel("Job Class: ");
        selectedJobClassLabel.setFont(new java.awt.Font("DialogInput", 1, 12));
        selectedJobClassLabel.setForeground(new java.awt.Color(255, 255, 255));
        selectedJobClassLabel.setBounds(12, 81, 150, 17);

        CharacterCreationHandler b = new CharacterCreationHandler(this);
        inputNameButton = new JButton("INPUT NAME");
        inputNameButton.addActionListener(b);
        inputNameButton.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12));
        inputNameButton.setBounds(181, 144, 128, 24);

        selectJobClassButton = new JButton("SELECT JOB CLASS");
        selectJobClassButton.addActionListener(b);
        selectJobClassButton.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12));
    
        selectJobClassButton.setBounds(181, 180, 128, 24);

        backButton = new JButton("BACK");
        backButton.addActionListener(b);
        backButton.setBackground(new java.awt.Color(204, 0, 0));
        backButton.setFont(new java.awt.Font("Lucida Console", 0, 12));
        backButton.setForeground(new java.awt.Color(255, 255, 255));
   
        backButton.setBounds(142, 238, 72, 20);

        confirmButton = new JButton("CONFIRM");
        confirmButton.addActionListener(b);
        confirmButton.setBackground(new java.awt.Color(0, 153, 0));
        confirmButton.setFont(new java.awt.Font("Lucida Console", 0, 12));
        confirmButton.setForeground(new java.awt.Color(255, 255, 255));
   
        confirmButton.setBounds(271, 238, 79, 20);

        mainPanel = new JPanel();
        mainPanel.setBackground(new java.awt.Color(51, 51, 51));
        mainPanel.setLayout(null);
        mainPanel.setBounds(0, 0, 500, 300);
        mainPanel.add(titleLabel);
        mainPanel.add(playerNameLabel);
        mainPanel.add(selectedJobClassLabel);
        mainPanel.add(inputNameButton);
        mainPanel.add(selectJobClassButton);
        mainPanel.add(backButton);
        mainPanel.add(confirmButton);
        
        mainFrame.add(mainPanel);
        mainFrame.setVisible(true);
      
        
    }
    
}
