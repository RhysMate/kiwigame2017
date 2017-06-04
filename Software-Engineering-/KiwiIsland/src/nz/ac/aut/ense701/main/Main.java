package nz.ac.aut.ense701.main;

import nz.ac.aut.ense701.gameModel.Game;
import nz.ac.aut.ense701.gui.KiwiCountUI;
import nz.ac.aut.ense701.gui.LoginPageJFrame;

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
//        System.out.println("Please Enter Your Name");
//        Scanner sc = new Scanner(System.in);
//        String playername = sc.nextLine();
        
        // this part try to make sure the longinpage run first before the main GUI of the game
        LoginPageJFrame log = new LoginPageJFrame();
//        log.setLocation(300,300); 
        log.setTitle("AUT 2017 Software Engineering Project: KiwiIsland");
        log.setSize(800,650);
        log.setVisible(true);
        
        while(log.startgame == false){System.out.print("");}
       
        // create the game object
        final Game game = new Game(log.pname);
        // create the GUI for the game
        final KiwiCountUI  gui  = new KiwiCountUI(game);
        // make the GUI visible
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
