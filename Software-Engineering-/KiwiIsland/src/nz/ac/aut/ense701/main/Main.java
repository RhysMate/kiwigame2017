package nz.ac.aut.ense701.main;

import java.util.Scanner;
import nz.ac.aut.ense701.gameModel.Game;
import nz.ac.aut.ense701.gui.KiwiCountUI;
import nz.ac.aut.ense701.gui.UserNameGUI;

/**
 * Kiwi Count Project
 * 
 * @author AS
 * @version 2011
 */
public class Main 
{
    
    /**
     * Main method of Kiwi Count.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) 
   {
//        UserNameGUI gui = new UserNameGUI();
//        System.out.println("plz enter ur name: ");
//        Scanner sc = new Scanner(System.in);
//        String playername = sc.nextLine();
//        final Game game = new Game(playername);
    
//        create the game object
        final Game game = new Game();        
//      create the GUI for the game
        final KiwiCountUI  gui  = new KiwiCountUI(game);
//        make the GUI visible
//        gui.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                gui.setVisible(true);
            }
        });
        }
   

}
