package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CreditScreen {

    private JFrame creditFrame;
    private JPanel mainPanel;

    public CreditScreen() {
        initializeUI();
    }

    private void initializeUI() {
    creditFrame = new JFrame("Credit Screen");
    creditFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    creditFrame.setSize(800, 500);
    creditFrame.setResizable(false);

    JLabel titleLabel = new JLabel("THANK YOU FOR PLAYING!");
    titleLabel.setFont(new java.awt.Font("DialogInput", 0, 18));
    titleLabel.setForeground(new java.awt.Color(255, 255, 255));
    titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    titleLabel.setBounds(250, 30, 300, 20);

    JLabel gameTitleLabel = new JLabel("ELDEN ROGUE");
    gameTitleLabel.setFont(new java.awt.Font("Felix Titling", 0, 36));
    gameTitleLabel.setForeground(new java.awt.Color(204, 153, 0));
    gameTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    gameTitleLabel.setBounds(220, 70, 360, 52);

    JLabel developerLabel = new JLabel("DEVELOPERS");
    developerLabel.setFont(new java.awt.Font("DialogInput", 0, 16));
    developerLabel.setForeground(new java.awt.Color(204, 153, 0));
    developerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    developerLabel.setBounds(180, 150, 440, 20);
    
    JLabel developerLabel2 = new JLabel("________________");
    developerLabel2.setFont(new java.awt.Font("DialogInput", 0, 16));
    developerLabel2.setForeground(new java.awt.Color(204, 153, 0));
    developerLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    developerLabel2.setBounds(180, 180, 440, 20); 

    JLabel developerLabel3 = new JLabel("LOYOLA,   JIANNA GRACE R.");
    developerLabel3.setFont(new java.awt.Font("DialogInput", 0, 16));
    developerLabel3.setForeground(new java.awt.Color(255, 255, 255));
    developerLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    developerLabel3.setBounds(180, 210, 440, 20);

    JLabel developerLabel4 = new JLabel("TONGOL, DENNISE NICOLE M.");
    developerLabel4.setFont(new java.awt.Font("DialogInput", 0, 16));
    developerLabel4.setForeground(new java.awt.Color(255, 255, 255));
    developerLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    developerLabel4.setBounds(180, 240, 440, 20);
    
    JLabel specialThanksLabel = new JLabel("SPECIAL THANKS");
    specialThanksLabel.setFont(new java.awt.Font("DialogInput", 0, 16));
    specialThanksLabel.setForeground(new java.awt.Color(204, 153, 0));
    specialThanksLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    specialThanksLabel.setBounds(170, 270, 460, 20);

    JLabel developerLabel5 = new JLabel("________________");
    developerLabel5.setFont(new java.awt.Font("DialogInput", 0, 16));
    developerLabel5.setForeground(new java.awt.Color(204, 153, 0));
    developerLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    developerLabel5.setBounds(180, 300, 440, 20);
    
    JLabel developerLabel6 = new JLabel("NICDAO, DIOSDADO");
    developerLabel6.setFont(new java.awt.Font("DialogInput", 0, 16));
    developerLabel6.setForeground(new java.awt.Color(255, 255, 255));
    developerLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    developerLabel6.setBounds(180, 330, 440, 20);
    
    mainPanel = new JPanel();
    mainPanel.setBackground(new java.awt.Color(51, 51, 51));
    mainPanel.setLayout(null);
    mainPanel.setBounds(0, 0, 800, 500);
    mainPanel.add(titleLabel);
    mainPanel.add(gameTitleLabel);
    mainPanel.add(developerLabel);
    mainPanel.add(developerLabel2);
    mainPanel.add(developerLabel3);
    mainPanel.add(developerLabel4);
    mainPanel.add(specialThanksLabel);
    mainPanel.add(developerLabel5);
    mainPanel.add(developerLabel6);

    creditFrame.add(mainPanel);
    creditFrame.setVisible(true);
}
    
    public void showCreditScreen() {
        creditFrame.setVisible(true);
    }
}
