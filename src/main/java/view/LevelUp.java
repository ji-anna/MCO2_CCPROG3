
package view;
import java.awt.*;
import controllers.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

/**
 * Class representing the level up screen.
 */
public class LevelUp {
    /** Button for increasing health. */
    public JButton health;
    
    /** Button for increasing endurance. */
    public JButton endurance;
    
    /** Button for increasing dexterity. */
    public JButton dexterity;
    
    /** Button for increasing strength. */
    public JButton strength;
    
    /** Button for increasing intelligence. */
    public JButton intelligence;
    
    /** Button for increasing faith. */
    public JButton faith;
    
    /** Button for returning to the previous screen. */
    public JButton back;
    
    /** Label displaying the title of the level up screen. */
    private JLabel title;
    
    /** Label displaying the current amount of runes. */
    private JLabel runes;
    
    /** Label displaying the rune cost for leveling up. */
    private JLabel runeCost;
    
    /** Label displaying the current player level. */
    private JLabel level;
    
    /** Panel for organizing UI elements. */
    private JPanel panel;
    
    /** Panel for organizing UI elements. */
    private JPanel panel2;
    
    /** Panel for organizing UI elements. */
    private JPanel panel3;
    
    /** Panel for organizing UI elements. */
    private JPanel panel4;
    
    /** Panel for organizing UI elements. */
    private JPanel panel5;
    
    /** Panel for organizing UI elements. */
    private JPanel panel6;
    
    /** Panel for organizing UI elements. */
    private JPanel panel7;
    
    /** Frame for the level up screen. */
    public JFrame frame;
    
    /**
     * Constructor to create a LevelUp object and initialize the UI.
     */
    public LevelUp(){
        initializeGUI();
    }

    /**
     * Initializes the UI elements of the level up screen.
     */
    public void initializeGUI()
    {
        frame = new JFrame("Game Lobby");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,300);
        frame.getContentPane().setBackground(new Color(51, 51, 51));
        frame.setLayout(new BorderLayout());
        panel = new JPanel();
        panel.setBackground(new Color(51, 51, 51));
        
        title = new JLabel();
        title.setBackground(new Color(204, 153, 0));
        title.setFont(new Font("Copperplate Gothic Bold", 1, 36));
        title.setForeground(new Color(255, 255, 255));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setText("LEVEL UP");
        title.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        title.setOpaque(true);
        title.setPreferredSize(new Dimension(frame.getWidth()-20, 55));
        panel.add(title, BorderLayout.CENTER);
        frame.add(panel,BorderLayout.NORTH);
         
        panel3 = new JPanel();
        panel3.setBackground(new Color(51, 51, 51));
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel2.setBackground(new Color(51, 51, 51));
        runes = new JLabel();
        runes.setFont(new Font("Copperplate Gothic Bold", 1, 15)); 
        runes.setText("Runes: " + CharacterCreationHandler.player.stats.getRunes());
        runes.setForeground(Color.WHITE);
        panel2.add(runes);
        runeCost = new JLabel();
        runeCost.setFont(new Font("Copperplate Gothic Bold", 1, 15)); 
        runeCost.setText("Rune Cost: " + (CharacterCreationHandler.stats.getLevel()*100) / 2);
        runeCost.setForeground(Color.WHITE);
        panel2.add(runeCost);
        level = new JLabel();
        level.setFont(new Font("Copperplate Gothic Bold", 1, 15)); 
        level.setText("Player Level: " + CharacterCreationHandler.stats.getLevel());
        level.setForeground(Color.WHITE);
        panel2.add(level);
        panel3.add(panel2);
      
        panel4 = new JPanel();
        panel4.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel4.setBackground(new Color(51, 51, 51));
        panel5 = new JPanel();
        panel5.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel5.setBackground(new Color(51, 51, 51));
        panel6 = new JPanel();
        panel6.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel6.setBackground(new Color(51, 51, 51));
        panel7 = new JPanel();
        panel7.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel7.setBackground(new Color(51, 51, 51));
        
        LevelUpHandler b = new LevelUpHandler(this);
        health = new JButton();
        health.addActionListener(b);
        health.setFont(new Font("Malgun Gothic Semilight", 0, 12)); 
        health.setForeground(new Color(51, 51, 51));
        health.setText("HEALTH: " + CharacterCreationHandler.stats.getHealth());
        
        strength = new JButton();
        strength.addActionListener(b);
        strength.setFont(new Font("Malgun Gothic Semilight", 0, 12));
        strength.setForeground(new Color(51, 51, 51));
        strength.setText("STRENGTH: " + CharacterCreationHandler.stats.getStrength());
        
        endurance = new JButton();
        endurance.addActionListener(b);
        endurance.setFont(new Font("Malgun Gothic Semilight", 0, 12));
        endurance.setForeground(new Color(51, 51, 51));
        endurance.setText("ENDURANCE: " + CharacterCreationHandler.stats.getEndurance());
        
        intelligence = new JButton();
        intelligence.addActionListener(b);
        intelligence.setFont(new Font("Malgun Gothic Semilight", 0, 12));
        intelligence.setForeground(new Color(51, 51, 51));
        intelligence.setText("INTELLIGENCE: " + CharacterCreationHandler.stats.getIntelligence());
        
        dexterity = new JButton();
        dexterity.addActionListener(b);
        dexterity.setFont(new Font("Malgun Gothic Semilight", 0, 12));
        dexterity.setForeground(new Color(51, 51, 51));
        dexterity.setText("DEXTERITY: " + CharacterCreationHandler.stats.getDexterity());
        
        faith = new JButton();
        faith.addActionListener(b);
        faith.setFont(new Font("Malgun Gothic Semilight", 0, 12));
        faith.setForeground(new Color(51, 51, 51));
        faith.setText("FAITH: " + CharacterCreationHandler.stats.getFaith());
        
        back = new JButton();
        back.addActionListener(b);
        back.setBackground(new Color(204, 0, 0));
        back.setFont(new Font("Lucida Console", 0, 12)); 
        back.setForeground(new Color(255, 255, 255));
        back.setText("BACK");
        
        int preferredWidth = intelligence.getPreferredSize().width;
        health.setPreferredSize(new Dimension(preferredWidth, health.getPreferredSize().height));
        strength.setPreferredSize(new Dimension(preferredWidth, strength.getPreferredSize().height));
        endurance.setPreferredSize(new Dimension(preferredWidth, endurance.getPreferredSize().height));
        dexterity.setPreferredSize(new Dimension(preferredWidth, dexterity.getPreferredSize().height));
        faith.setPreferredSize(new Dimension(preferredWidth, faith.getPreferredSize().height));
        
        panel4.add(health);
        panel4.add(strength);
        
        panel5.add(endurance);
        panel5.add(intelligence);
        panel6.add(dexterity);
        panel6.add(faith);
        panel7.add(back);
        
        panel3.add(panel4);
        panel3.add(panel5);
        panel3.add(panel6); 
        panel3.add(panel7);
        
        frame.add(panel3);
        frame.setVisible(true);
        
    }
    
}
