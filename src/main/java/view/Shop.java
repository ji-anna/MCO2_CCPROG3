package view;
import controllers.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

/**
 * Class representing the shop screen.
 */
public class Shop {
    
    /** Array of JLabels to display weapon icons. */
    private JLabel[] weaponLabel;
    
    /** Array of JButton for purchasing weapons. */
    public JButton[] purchase;
    
    /** Array of JPanel to organize UI elements for each weapon. */
    public JPanel[] panels;
    
    /** Label displaying the title of the shop screen. */
    public JLabel title;
    
    /** Frame for the shop screen. */
    public JFrame frame;
    
    /** Label displaying the player's runes. */
    public JLabel runes;
    
    /** Label displaying the cost of runes for purchasing. */
    public JLabel runeCost;
    
    /** Label displaying the category of swords. */
    public JLabel swords;
    
    /** Label displaying the category of katanas. */
    public JLabel katanas;
    
    /** Label displaying the category of greatswords. */
    public JLabel greatswords;
    
    /** Label displaying the category of staves. */
    public JLabel staves;
    
    /** Label displaying the category of seals. */
    public JLabel seals;
    
    /** Label displaying the category of whips. */
    public JLabel whips;
    
    /** Button for navigating back to the previous screen. */
    public JButton back;

    /**
     * Constructor to create a Shop object and initialize the UI.
     */
    public Shop() {
        initializeUI();
    }

    /**
     * Initializes the UI elements of the shop screen.
     */
    private void initializeUI() {
        frame = new JFrame("Shop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 1000);
        frame.setLayout(new BorderLayout()); 
        frame.getContentPane().setBackground(new Color(51, 51, 51));
        frame.setResizable(false);

        title = new JLabel();
        title.setBackground(new Color(204, 153, 0));
        title.setFont(new Font("Copperplate Gothic Bold", 1, 36));
        title.setForeground(new Color(255, 255, 255));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setText("SHOP");
        title.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        title.setOpaque(true);
        title.setPreferredSize(new Dimension(frame.getWidth() - 20, 55));
        frame.add(title, BorderLayout.NORTH);

        runes = new JLabel();
        runes.setFont(new Font("Copperplate Gothic Bold", 1, 15));
        runes.setText("Runes: " + CharacterCreationHandler.player.stats.getRunes());
        runes.setForeground(Color.WHITE);
        runes.setPreferredSize(new Dimension(frame.getWidth() - 60, 55));
        frame.add(runes, BorderLayout.CENTER);

        JPanel weaponsPanel = new JPanel();
        weaponsPanel.setLayout(new GridLayout(0, 1));
        weaponsPanel.setBackground(new Color(51, 51, 51));

        String[] weapons = {"coded", "night", "rogiers", "short",
                            "uchigatana", "moonveil", "rivers", "malenia",
                            "claymore", "starscourge", "inseparable", "malikeths",
                            "astrologers", "albinauric", "guilty", "carian",
                            "finger", "godslayers", "golden", "dragon",
                            "whip", "urumi", "thorned", "hoslows"};
        panels = new JPanel[weapons.length];
        weaponLabel = new JLabel[weapons.length];
        purchase = new JButton[weapons.length];
        ShopHandler b = new ShopHandler(this);
        String imagePath = "";
        for (int i = 0; i < weapons.length; i++) {
            if (i == 0) {
                swords = new JLabel();
                swords.setFont(new Font("Copperplate Gothic Bold", 1, 15));
                swords.setText("SWORDS");
                swords.setForeground(Color.WHITE);
                swords.setHorizontalAlignment(SwingConstants.CENTER);
                swords.setPreferredSize(new Dimension(frame.getWidth(), 55));
                weaponsPanel.add(swords); 
            } else if (i == 4) {
                katanas = new JLabel();
                katanas.setFont(new Font("Copperplate Gothic Bold", 1, 15));
                katanas.setText("KATANAS");
                katanas.setForeground(Color.WHITE);
                katanas.setHorizontalAlignment(SwingConstants.CENTER);
                katanas.setPreferredSize(new Dimension(frame.getWidth(), 55));
                weaponsPanel.add(katanas); 
            } else if (i == 8) {
                greatswords = new JLabel();
                greatswords.setFont(new Font("Copperplate Gothic Bold", 1, 15));
                greatswords.setText("GREATSWORDS");
                greatswords.setForeground(Color.WHITE);
                greatswords.setHorizontalAlignment(SwingConstants.CENTER);
                greatswords.setPreferredSize(new Dimension(frame.getWidth(), 55));
                weaponsPanel.add(greatswords); 
            } else if (i == 12) {
                staves = new JLabel();
                staves.setFont(new Font("Copperplate Gothic Bold", 1, 15));
                staves.setText("STAVES");
                staves.setForeground(Color.WHITE);
                staves.setHorizontalAlignment(SwingConstants.CENTER);
                staves.setPreferredSize(new Dimension(frame.getWidth(), 55));
                weaponsPanel.add(staves); 
            } else if (i == 16) {
                seals = new JLabel();
                seals.setFont(new Font("Copperplate Gothic Bold", 1, 15));
                seals.setText("SEALS");
                seals.setForeground(Color.WHITE);
                seals.setHorizontalAlignment(SwingConstants.CENTER);
                seals.setPreferredSize(new Dimension(frame.getWidth(), 55));
                weaponsPanel.add(seals); 
            } else if (i == 20) {
                whips = new JLabel();
                whips.setFont(new Font("Copperplate Gothic Bold", 1, 15));
                whips.setText("WHIPS");
                whips.setForeground(Color.WHITE);
                whips.setHorizontalAlignment(SwingConstants.CENTER);
                whips.setPreferredSize(new Dimension(frame.getWidth(), 55));
                weaponsPanel.add(whips); 
            }

            panels[i] = new JPanel();
            panels[i].setBackground(new Color(51, 51, 51));
            panels[i].setLayout(new BorderLayout());
            weaponLabel[i] = new JLabel();
            if (i < 4) {
                imagePath = "/weapons/" + weapons[i] + ".png";
            } else {
                imagePath = "/weapons/" + weapons[i] + ".jpg";
            }

            weaponLabel[i].setIcon(new ImageIcon(getClass().getResource(imagePath)));

            panels[i].add(weaponLabel[i], BorderLayout.NORTH);
            purchase[i] = new JButton("PURCHASE");
            purchase[i].setBackground(new Color(204, 153, 0));
            purchase[i].setForeground(Color.WHITE);
            purchase[i].setPreferredSize(new Dimension(5, 30));
            purchase[i].addActionListener(b);
            panels[i].add(purchase[i], BorderLayout.SOUTH);
            weaponsPanel.add(panels[i]); 

        }
        JScrollPane scrollPane = new JScrollPane(weaponsPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        frame.add(scrollPane, BorderLayout.CENTER);

        back = new JButton();
        back.addActionListener(b);
        back.setBackground(new Color(204, 0, 0));
        back.setFont(new Font("Lucida Console", 0, 12));
        back.setForeground(new Color(255, 255, 255));
        back.setText("BACK");
        frame.add(back, BorderLayout.SOUTH); 
        frame.setVisible(true);

    }

}