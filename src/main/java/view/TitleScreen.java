
package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import controllers.*;

/**
 * The TitleScreen class represents the graphical user interface for the title screen of the game.
 * It includes buttons to start the game and exit the application.
 */
public class TitleScreen {
 
    public JButton startButton;
    public JButton exitButton;
    private JLabel welcomeLabel;
    private JLabel gameTitleLabel;
    private JPanel mainPanel;
    public JFrame mainFrame;
    
    /**
     * Constructor to initialize the title screen UI.
     */
    public TitleScreen() {
        initializeUI();
    }
    /**
     * Initializes the user interface components for the title screen.
     */
    private void initializeUI() {
        mainFrame = new JFrame("Title Screen");
        mainFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setSize(500,400);
        mainFrame.setResizable(false);
        

        welcomeLabel = new JLabel("WELCOME TO");
        welcomeLabel.setFont(new java.awt.Font("Gadugi", 0, 14));
        welcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setBounds(189, 30, 100, 20);

        gameTitleLabel = new JLabel("ELDEN ROGUE");
        gameTitleLabel.setFont(new java.awt.Font("Felix Titling", 1, 48));
        gameTitleLabel.setForeground(new java.awt.Color(204, 153, 0));
        gameTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameTitleLabel.setBounds(46, 110, 400, 52);

        TitleScreenHandler b = new TitleScreenHandler(this);
        startButton = new JButton("START");
        startButton.addActionListener(b);
        startButton.setBackground(new java.awt.Color(204, 153, 0));
        startButton.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12));
        startButton.setForeground(new java.awt.Color(255, 255, 255));
        startButton.setBounds(190, 200, 119, 32);

        exitButton = new JButton("EXIT");
        exitButton.addActionListener(b);
        exitButton.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12));
        exitButton.setBounds(190, 240, 119, 32);

        mainPanel = new JPanel();
        mainPanel.setBackground(new java.awt.Color(51, 51, 51));
        mainPanel.setLayout(null);
        mainPanel.setBounds(0, 0, 500, 300);
        mainPanel.add(welcomeLabel);
        mainPanel.add(gameTitleLabel);
        mainPanel.add(startButton);
        mainPanel.add(exitButton);
        
        mainFrame.add(mainPanel);
        mainFrame.setVisible(true);
        
        
    }
    
}
