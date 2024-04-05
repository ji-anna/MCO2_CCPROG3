
package controllers;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import view.*;

/**
 * The ShopHandler class handles user interactions related to shopping in the game.
 * It implements the ActionListener interface to listen for events triggered by user actions.
 */
public class ShopHandler implements ActionListener{
    /**
     * The Shop instance associated with this handler.
     */
    public static Shop shop;
    /**
     * The source of the event.
     */
    public static Object source;
    /**
     * A list to keep track of purchased items.
     */
    public static ArrayList<String> purchased = new ArrayList<>();
    
    /**
     * Constructs a ShopHandler with the provided Shop instance.
     * @param shop The Shop instance associated with this handler.
     */
    public ShopHandler(Shop shop)
    {
        this.shop = shop;
    }

    /**
     * Handles user actions performed in the Shop interface.
     * Performs purchase actions based on the selected item.
     * @param e The ActionEvent object representing the action performed.
     */
    public void actionPerformed(ActionEvent e)
    {
        source = e.getSource();
        if(source == shop.purchase[0])
        {
            if(CharacterCreationHandler.stats.getRunes() < 4000) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE);
            }
            else if(CharacterCreationHandler.stats.getDexterity() < 21) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Dexterity.", 
                                "Insufficient Dexterity", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(shop.frame,"Confirm Purchase?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                    purchased.add("Coded Sword");
                    JOptionPane.showMessageDialog(shop.frame,"Purchase Complete.", 
                                "Purchase Complete", JOptionPane.PLAIN_MESSAGE);
                    shop.frame.dispose();
                    new Shop();  
                }
                else{}
            }
        }
        
        else if(source == shop.purchase[1])
        {
            if(CharacterCreationHandler.stats.getRunes() < 8000) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE);
            }
            else if(CharacterCreationHandler.stats.getDexterity() < 25) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Dexterity.", 
                                "Insufficient Dexterity", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(shop.frame,"Confirm Purchase?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                    purchased.add("Sword of Night and Flame");
                    JOptionPane.showMessageDialog(shop.frame,"Purchase Complete.", 
                                "Purchase Complete", JOptionPane.PLAIN_MESSAGE);
                    shop.frame.dispose();
                    new Shop();  
                }
                else{}
            }
            
        }else if(source == shop.purchase[2])
        {
            if(CharacterCreationHandler.stats.getRunes() < 2000) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE);
            }
            else if(CharacterCreationHandler.stats.getDexterity() < 18) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Dexterity.", 
                                "Insufficient Dexterity", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(shop.frame,"Confirm Purchase?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                    purchased.add("Rogier's Rapier");
                    JOptionPane.showMessageDialog(shop.frame,"Purchase Complete.", 
                                "Purchase Complete", JOptionPane.PLAIN_MESSAGE);
                    shop.frame.dispose();
                    new Shop();  
                }
                else{}
            }
        }
        else if(source == shop.purchase[3])
        {
            if(CharacterCreationHandler.stats.getRunes() < 1000) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE);
            }
            else if(CharacterCreationHandler.stats.getDexterity() < 13) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Dexterity.", 
                                "Insufficient Dexterity", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(shop.frame,"Confirm Purchase?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                    purchased.add("Short Sword");
                    JOptionPane.showMessageDialog(shop.frame,"Purchase Complete.", 
                                "Purchase Complete", JOptionPane.PLAIN_MESSAGE);
                    shop.frame.dispose();
                    new Shop();  
                }
                else{}
            }
        }
        else if(source == shop.purchase[4])
        {
            if(CharacterCreationHandler.stats.getRunes() < 1875) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE);
            }
            else if(CharacterCreationHandler.stats.getDexterity() < 15) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Dexterity.", 
                                "Insufficient Dexterity", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(shop.frame,"Confirm Purchase?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                    purchased.add("Uchigatana");
                    JOptionPane.showMessageDialog(shop.frame,"Purchase Complete.", 
                                "Purchase Complete", JOptionPane.PLAIN_MESSAGE);
                    shop.frame.dispose();
                    new Shop();  
                }
                else{}
            }
        }
        else if(source == shop.purchase[5])
        {
            if(CharacterCreationHandler.stats.getRunes() < 3750) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE);
            }
            else if(CharacterCreationHandler.stats.getDexterity() < 20) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Dexterity.", 
                                "Insufficient Dexterity", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(shop.frame,"Confirm Purchase?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                    purchased.add("Moonveil");
                    JOptionPane.showMessageDialog(shop.frame,"Purchase Complete.", 
                                "Purchase Complete", JOptionPane.PLAIN_MESSAGE);
                    shop.frame.dispose();
                    new Shop();  
                }
                else{}
            }
        }
        else if(source == shop.purchase[6])
        {
            if(CharacterCreationHandler.stats.getRunes() < 7500) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE);
            }
            else if(CharacterCreationHandler.stats.getDexterity() < 25) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Dexterity.", 
                                "Insufficient Dexterity", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(shop.frame,"Confirm Purchase?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                    purchased.add("Rivers of Blood");
                    JOptionPane.showMessageDialog(shop.frame,"Purchase Complete.", 
                                "Purchase Complete", JOptionPane.PLAIN_MESSAGE);
                    shop.frame.dispose();
                    new Shop();  
                }
                else{}
            }
        }
        else if(source == shop.purchase[7])
        {
            if(CharacterCreationHandler.stats.getRunes() < 15000) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE);
            }
            else if(CharacterCreationHandler.stats.getDexterity() < 30) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Dexterity.", 
                                "Insufficient Dexterity", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(shop.frame,"Confirm Purchase?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                    purchased.add("Hand of Malenia");
                    JOptionPane.showMessageDialog(shop.frame,"Purchase Complete.", 
                                "Purchase Complete", JOptionPane.PLAIN_MESSAGE);
                    shop.frame.dispose();
                    new Shop();  
                }
                else{}
            }
        }
        else if(source == shop.purchase[8])
        {
            if(CharacterCreationHandler.stats.getRunes() < 3000) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE);
            }
            else if(CharacterCreationHandler.stats.getDexterity() < 9) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Dexterity.", 
                                "Insufficient Dexterity", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(shop.frame,"Confirm Purchase?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                    purchased.add("Claymore");
                    JOptionPane.showMessageDialog(shop.frame,"Purchase Complete.", 
                                "Purchase Complete", JOptionPane.PLAIN_MESSAGE);
                    shop.frame.dispose();
                    new Shop();  
                }
                else{}
            }
        }else if(source == shop.purchase[9])
        {
            if(CharacterCreationHandler.stats.getRunes() < 6000) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE);
            }
            else if(CharacterCreationHandler.stats.getDexterity() < 14) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Dexterity.", 
                                "Insufficient Dexterity", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(shop.frame,"Confirm Purchase?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                    purchased.add("Starscourge Greatsword");
                    JOptionPane.showMessageDialog(shop.frame,"Purchase Complete.", 
                                "Purchase Complete", JOptionPane.PLAIN_MESSAGE);
                    shop.frame.dispose();
                    new Shop();  
                }
                else{}
            }
        }
        else if(source == shop.purchase[10])
        {
            if(CharacterCreationHandler.stats.getRunes() < 12000) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE);
            }
            else if(CharacterCreationHandler.stats.getDexterity() < 19) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Dexterity.", 
                                "Insufficient Dexterity", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(shop.frame,"Confirm Purchase?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                    purchased.add("Inseparable Sword");
                    JOptionPane.showMessageDialog(shop.frame,"Purchase Complete.", 
                                "Purchase Complete", JOptionPane.PLAIN_MESSAGE);
                    shop.frame.dispose();
                    new Shop();  
                }
                else{}
            }
        }
        else if(source == shop.purchase[11])
        {
            if(CharacterCreationHandler.stats.getRunes() < 24000) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE);
            }
            else if(CharacterCreationHandler.stats.getDexterity() < 24) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Dexterity.", 
                                "Insufficient Dexterity", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(shop.frame,"Confirm Purchase?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                    purchased.add("Malikeths Black Blade");
                    JOptionPane.showMessageDialog(shop.frame,"Purchase Complete.", 
                                "Purchase Complete", JOptionPane.PLAIN_MESSAGE);
                    shop.frame.dispose();
                    new Shop();  
                }
                else{}
            }
        }
        else if(source == shop.purchase[12])
        {
            if(CharacterCreationHandler.stats.getRunes() < 2000) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE);
            }
            else if(CharacterCreationHandler.stats.getDexterity() < 12) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Dexterity.", 
                                "Insufficient Dexterity", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(shop.frame,"Confirm Purchase?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                    purchased.add("Astrologers Staff");
                    JOptionPane.showMessageDialog(shop.frame,"Purchase Complete.", 
                                "Purchase Complete", JOptionPane.PLAIN_MESSAGE);
                    shop.frame.dispose();
                    new Shop();  
                }
                else{}
            }
        }
        else if(source == shop.purchase[13])
        {
            if(CharacterCreationHandler.stats.getRunes() < 4000) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE);
            }
            else if(CharacterCreationHandler.stats.getDexterity() < 14) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Dexterity.", 
                                "Insufficient Dexterity", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(shop.frame,"Confirm Purchase?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                    purchased.add("Albinauric Staff");
                    JOptionPane.showMessageDialog(shop.frame,"Purchase Complete.", 
                                "Purchase Complete", JOptionPane.PLAIN_MESSAGE);
                    shop.frame.dispose();
                    new Shop();  
                }
                else{}
            }
        }else if(source == shop.purchase[14])
        {
            if(CharacterCreationHandler.stats.getRunes() < 8000) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE);
            }
            else if(CharacterCreationHandler.stats.getDexterity() < 16) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Dexterity.", 
                                "Insufficient Dexterity", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(shop.frame,"Confirm Purchase?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                    purchased.add("Staff of the Guilty");
                    JOptionPane.showMessageDialog(shop.frame,"Purchase Complete.", 
                                "Purchase Complete", JOptionPane.PLAIN_MESSAGE);
                    shop.frame.dispose();
                    new Shop();  
                }
                else{}
            }
        }
        else if(source == shop.purchase[15])
        {
            if(CharacterCreationHandler.stats.getRunes() < 16000) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE);
            }
            else if(CharacterCreationHandler.stats.getDexterity() < 18) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Dexterity.", 
                                "Insufficient Dexterity", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(shop.frame,"Confirm Purchase?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                    purchased.add("Carian Regal Scepter");
                    JOptionPane.showMessageDialog(shop.frame,"Purchase Complete.", 
                                "Purchase Complete", JOptionPane.PLAIN_MESSAGE);
                    shop.frame.dispose();
                    new Shop();  
                }
                else{}
            }
        }else if(source == shop.purchase[16])
        {
            if(CharacterCreationHandler.stats.getRunes() < 2500) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE);
            }
            else if(CharacterCreationHandler.stats.getDexterity() < 10) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Dexterity.", 
                                "Insufficient Dexterity", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(shop.frame,"Confirm Purchase?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                    purchased.add("Finger Seal");
                    JOptionPane.showMessageDialog(shop.frame,"Purchase Complete.", 
                                "Purchase Complete", JOptionPane.PLAIN_MESSAGE);
                    shop.frame.dispose();
                    new Shop();  
                }
                else{}
            }
        }
        else if(source == shop.purchase[17])
        {
            if(CharacterCreationHandler.stats.getRunes() < 5000) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE);
            }
            else if(CharacterCreationHandler.stats.getDexterity() < 12) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Dexterity.", 
                                "Insufficient Dexterity", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(shop.frame,"Confirm Purchase?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                    purchased.add("Godslayer's Seal");
                    JOptionPane.showMessageDialog(shop.frame,"Purchase Complete.", 
                                "Purchase Complete", JOptionPane.PLAIN_MESSAGE);
                    shop.frame.dispose();
                    new Shop();  
                }
                else{}
            }
        }
        else if(source == shop.purchase[18])
        {
            if(CharacterCreationHandler.stats.getRunes() < 10000) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE);
            }
            else if(CharacterCreationHandler.stats.getDexterity() < 14) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Dexterity.", 
                                "Insufficient Dexterity", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(shop.frame,"Confirm Purchase?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                    purchased.add("Golden Order Seal");
                    JOptionPane.showMessageDialog(shop.frame,"Purchase Complete.", 
                                "Purchase Complete", JOptionPane.PLAIN_MESSAGE);
                    shop.frame.dispose();
                    new Shop();  
                }
                else{}
            }
        }
        else if(source == shop.purchase[19])
        {
            if(CharacterCreationHandler.stats.getRunes() < 15000) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE);
            }
            else if(CharacterCreationHandler.stats.getDexterity() < 18) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Dexterity.", 
                                "Insufficient Dexterity", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(shop.frame,"Confirm Purchase?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                    purchased.add("Dragon Communion Seal");
                    JOptionPane.showMessageDialog(shop.frame,"Purchase Complete.", 
                                "Purchase Complete", JOptionPane.PLAIN_MESSAGE);
                    shop.frame.dispose();
                    new Shop();  
                }
                else{}
            }
        }
        else if(source == shop.purchase[20])
        {
            if(CharacterCreationHandler.stats.getRunes() < 1500) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE);
            }
            else if(CharacterCreationHandler.stats.getDexterity() < 20) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Dexterity.", 
                                "Insufficient Dexterity", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(shop.frame,"Confirm Purchase?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                    purchased.add("Whip");
                    JOptionPane.showMessageDialog(shop.frame,"Purchase Complete.", 
                                "Purchase Complete", JOptionPane.PLAIN_MESSAGE);
                    shop.frame.dispose();
                    new Shop();  
                }
                else{}
            }
        }else if(source == shop.purchase[21])
        {
            if(CharacterCreationHandler.stats.getRunes() < 3000) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE);
            }
            else if(CharacterCreationHandler.stats.getDexterity() < 25) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Dexterity.", 
                                "Insufficient Dexterity", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(shop.frame,"Confirm Purchase?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                    purchased.add("Urumi");
                    JOptionPane.showMessageDialog(shop.frame,"Purchase Complete.", 
                                "Purchase Complete", JOptionPane.PLAIN_MESSAGE);
                    shop.frame.dispose();
                    new Shop();  
                }
                else{}
            }
        }
        else if(source == shop.purchase[22])
        {
            if(CharacterCreationHandler.stats.getRunes() < 5000) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE);
            }
            else if(CharacterCreationHandler.stats.getDexterity() < 30) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Dexterity.", 
                                "Insufficient Dexterity", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(shop.frame,"Confirm Purchase?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                    purchased.add("Thorned Whip");
                    JOptionPane.showMessageDialog(shop.frame,"Purchase Complete.", 
                                "Purchase Complete", JOptionPane.PLAIN_MESSAGE);
                    shop.frame.dispose();
                    new Shop();  
                }
                else{}
            } 
        }
        else if(source == shop.purchase[23])
        {
            if(CharacterCreationHandler.stats.getRunes() < 10000) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Runes.", 
                                "Insufficient Runes", JOptionPane.ERROR_MESSAGE);
            }
            else if(CharacterCreationHandler.stats.getDexterity() < 35) 
            {
                JOptionPane.showMessageDialog(shop.frame,"Insufficient Dexterity.", 
                                "Insufficient Dexterity", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                int choice = JOptionPane.showConfirmDialog(shop.frame,"Confirm Purchase?","Confirmation",JOptionPane.YES_NO_OPTION);
                if(choice == JOptionPane.YES_OPTION)
                {
                    purchased.add("Hoslow's Petal Whip");
                    JOptionPane.showMessageDialog(shop.frame,"Purchase Complete.", 
                                "Purchase Complete", JOptionPane.PLAIN_MESSAGE);
                    shop.frame.dispose();
                    new Shop();  
                }
                else{}
            }
        }
        else 
        {
            shop.frame.dispose();
            new GameLobby();
        }
        
    }
    
    
}
