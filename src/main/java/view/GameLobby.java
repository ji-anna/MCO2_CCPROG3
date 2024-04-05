
package view;
import controllers.*;
import java.awt.*;
import javax.swing.*;

/**
 * Class representing the game lobby screen.
 */
public class GameLobby {
    /** Button for accessing fast travel. */
    public JButton fastTravel;
    
    /** Button for leveling up. */
    public JButton levelUp;
    
    /** Button for accessing inventory. */
    public JButton inventory;
    
    /** Button for accessing the shop. */
    public JButton shop;
    
    /** Button for quitting the game. */
    private JButton quit;
    
    /** Label displaying the title of the game lobby screen. */
    private JLabel label;
    
    /** Panel for organizing UI elements. */
    private JPanel panel;
    
    /** Frame for the game lobby screen. */
    public JFrame frame;
    

    /**
     * Constructor to create a GameLobby object and initialize the UI.
     */
    public GameLobby(){
        initializeUI();
    }
    
    /**
     * Initializes the UI elements of the game lobby screen.
     */
    private void initializeUI()
    {
        frame = new JFrame("Game Lobby");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);
        frame.getContentPane().setBackground(new Color(51, 51, 51));
        
        label = new JLabel();
        label.setBackground(new Color(204, 153, 0));
        label.setFont(new Font("Copperplate Gothic Bold", 1, 36)); 
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("GAME LOBBY");
        label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        label.setOpaque(true);
        
        GameLobbyHandler b = new GameLobbyHandler(this);
        fastTravel = new JButton();
        fastTravel.addActionListener(b);
        fastTravel.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); 
        fastTravel.setText("FAST TRAVEL");
        
        levelUp = new JButton();
        levelUp.addActionListener(b);
        levelUp.setFont(new Font("Malgun Gothic Semilight", 0, 12)); 
        levelUp.setText("LEVEL UP");
        
        inventory = new JButton();
        inventory.addActionListener(b);
        inventory.setFont(new Font("Malgun Gothic Semilight", 0, 12)); 
        inventory.setText("INVENTORY");
        
        shop = new JButton();
        shop.addActionListener(b);
        shop.setFont(new Font("Malgun Gothic Semilight", 0, 12)); 
        shop.setText("SHOP");
        
        quit = new JButton();
        quit.addActionListener(b);
        quit.setBackground(new Color(204, 0, 0));
        quit.setFont(new Font("Lucida Console", 0, 12));
        quit.setForeground(new Color(255, 255, 255));
        quit.setText("QUIT");
        
        panel = new JPanel();
        panel.setBackground(new Color(51, 51, 51));
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setHorizontalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inventory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fastTravel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(levelUp, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(shop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 139, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(quit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
       layout.setVerticalGroup(
           (layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fastTravel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(levelUp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inventory)
                    .addComponent(shop, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(quit)
                .addGap(69, 69, 69)
            )
                   )
       );
       panel.setBounds(0, 0, 500, 300);
       frame.add(panel);
       frame.setVisible(true);
    }
    
    
    
}
