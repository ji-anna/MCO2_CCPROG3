
package view;
import controllers.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

/**
 * Class representing the fast travel screen.
 */
public class FastTravel {
    /** Button for fast traveling to Stormveil Castle. */
    public JButton stormveil;
    
    /** Button for fast traveling to Raya Lucaria Academy. */
    public JButton raya;
    
    /** Button for fast traveling to The Elden Throne. */
    public JButton elden;
    
    /** Button for navigating back. */
    private JButton back;
    
    /** Label displaying the title of the fast travel screen. */
    private JLabel label;
    
    /** Panel for organizing UI elements. */
    private JPanel panel;
    
    /** Another panel for organizing UI elements. */
    private JPanel panel2;
    
    /** Frame for the fast travel screen. */
    public JFrame frame;
    

    /**
     * Constructor to create a FastTravel object and initialize the UI.
     */
    public FastTravel(){
        initializeUI();
    }

    /**
     * Initializes the UI elements of the fast travel screen.
     */
     private void initializeUI()
    {
        panel = new JPanel();
        panel2 = new JPanel();
        frame = new JFrame("Fast Travel");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);
        frame.getContentPane().setBackground(new Color(51, 51, 51));
        
        FastTravelHandler b = new FastTravelHandler(this);
        stormveil = new JButton();
        stormveil.addActionListener(b);
        stormveil.setFont(new Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        stormveil.setText("Stormveil Castle");
        stormveil.setBounds(162, 98, 159, 29);
        frame.add(stormveil);
        
        raya = new JButton();
        raya.addActionListener(b);
        raya.setFont(new Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        raya.setText("Raya Lucaria Academy");
        raya.setBounds(162, 139, 159, 29);
        frame.add(raya);

        elden = new JButton();
        elden.addActionListener(b);
        elden.setFont(new Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        elden.setText("The Elden Throne");
        elden.setBounds(162, 180, 159, 29);
        frame.add(elden);
        
        back = new JButton();
        back.addActionListener(b);
        back.setBackground(new Color(204, 0, 0));
        back.setFont(new Font("Lucida Console", 0, 12)); // NOI18N
        back.setForeground(new Color(255, 255, 255));
        back.setText("BACK");
        back.setBounds(200, 227, 81, 23);
        frame.add(back);
        
        label = new JLabel();
        label.setBackground(new Color(204, 153, 0));
        label.setFont(new Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        label.setForeground(new Color(255, 255, 255));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("FAST TRAVEL");
        label.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
        label.setOpaque(true);
        
        GroupLayout panelLayout = new GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel2.setBackground(new Color(51, 51, 51));
        GroupLayout panel2Layout = new GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label)
                .addContainerGap(247, Short.MAX_VALUE))
        );
        panel2.setBounds(0, 0, 500, 300);
        frame.add(panel2);
        frame.add(panel);
        frame.setVisible(true);
        
        
    }
    
}
