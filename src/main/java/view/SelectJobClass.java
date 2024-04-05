
package view;
import controllers.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

/**
 * Class representing the job class selection screen.
 */
public class SelectJobClass{
    
    /** Array of JLabels to display job class icons. */
    private JLabel[] jobClassLabels;
    
    /** Array of JButton for selecting job classes. */
    public JButton[] selectButtons;
    
    /** Array of JPanel to organize UI elements for each job class. */
    public JPanel[] panel;
    
    /** Label displaying the title of the job class selection screen. */
    public JLabel title;
    
    /** Frame for the job class selection screen. */
    public JFrame mainFrame;

    /**
     * Constructor to create a SelectJobClass object and initialize the UI.
     */
    public SelectJobClass() {
        initializeUI();
    }

    /**
     * Initializes the UI elements of the job class selection screen.
     */
    private void initializeUI() {
        mainFrame = new JFrame("Job Class Selection");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(500,800);
        mainFrame.setLayout(new FlowLayout());
        mainFrame.getContentPane().setBackground(new Color(51, 51, 51));
        mainFrame.setResizable(false);

        title = new JLabel();
        title.setBackground(new Color(204, 153, 0));
        title.setFont(new Font("Copperplate Gothic Bold", 1, 36));
        title.setForeground(new Color(255, 255, 255));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setText("SELECT JOB CLASS");
        title.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        title.setOpaque(true);
        title.setPreferredSize(new Dimension(mainFrame.getWidth()-20, 55));
        mainFrame.add(title,BorderLayout.NORTH);
        String[] jobClassNames = {"Vagabond", "Samurai", "Warrior", "Prophet", "Hero", "Astrologer"};
        panel = new JPanel[jobClassNames.length];
        jobClassLabels = new JLabel[jobClassNames.length];
        selectButtons = new JButton[jobClassNames.length];
        JobClassHandler b = new JobClassHandler(this);
        for (int i = 0; i < jobClassNames.length; i++) {
            panel[i] = new JPanel();
            panel[i].setBackground(new Color(51, 51, 51));
            panel[i].setLayout(new BorderLayout());
            jobClassLabels[i] = new JLabel();
            String imagePath = "/icons/" + jobClassNames[i].toUpperCase() + ".png";
            jobClassLabels[i].setIcon(new ImageIcon(getClass().getResource(imagePath)));
            panel[i].add(jobClassLabels[i],BorderLayout.NORTH);
            selectButtons[i] = new JButton("SELECT");
            selectButtons[i].setBackground(new Color(204, 153, 0));
            selectButtons[i].setForeground(Color.WHITE);
            selectButtons[i].setPreferredSize(new Dimension(5, 30));
            selectButtons[i].addActionListener(b);
            panel[i].add(selectButtons[i],BorderLayout.SOUTH);
            mainFrame.add(panel[i]);
        }
        mainFrame.setVisible(true);

        
    }
}
