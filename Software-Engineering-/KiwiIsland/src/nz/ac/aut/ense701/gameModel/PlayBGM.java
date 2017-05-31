/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.ac.aut.ense701.gameModel;

import static java.lang.Thread.State.TERMINATED;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author he_zh
 */
public class PlayBGM implements Runnable{
    Sound BGM;
    boolean play = true;
    
    public PlayBGM(){
       BGM = new Sound("BGM1"); 
    }
    
    @Override
    public void run() {
            while(true)
            {
                try {
                    Thread.sleep(1000);
                        if(play == true){
                            if(BGM.isAlive() == false)
                            {
                                BGM = new Sound("BGM1.wav"); 
                                BGM.start();
                            }
                        }if(play == false){
                            BGM.stop();
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(PlayBGM.class.getName()).log(Level.SEVERE, null, ex);
                    }

            }
         
    }
}
