package controllers;
import java.awt.event.*;
import view.*;

/**
 * ActionListener implementation for handling fast travel actions in the game.
 */
public class FastTravelHandler implements ActionListener {
    public static FastTravel travel;
    public static Object source;
    
   public FastTravelHandler(FastTravel travel)
   {
       this.travel = travel;
   }
   
   public void actionPerformed (ActionEvent e)
   {
       source = e.getSource();
       
       if(source == travel.stormveil)
       {
           travel.frame.dispose();
           new StormveilFloor1();
       }
       else if(source == travel.raya)
       {
           
       }
       else if(source == travel.elden)
       {
       }
       else
       {
           travel.frame.dispose();
           new GameLobby();
       }
   }
    
    
    
}
