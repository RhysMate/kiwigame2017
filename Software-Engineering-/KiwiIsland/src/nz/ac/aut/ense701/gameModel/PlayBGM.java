/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.ac.aut.ense701.gameModel;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author he_zh
 */
public class PlayBGM implements Runnable{
    Sound BGM;
    public boolean play = true;
    String tmp;
    
    public PlayBGM(String tmp){
        this.tmp = tmp;
    }
    
    @Override
    public synchronized void run() {
        BGM = new Sound(tmp);
            while(true)
            {
                try {
                    Thread.sleep(500);
                        if(play == true){
                            if(BGM.isAlive() == false)
                            {
                                BGM = new Sound(tmp); 
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
