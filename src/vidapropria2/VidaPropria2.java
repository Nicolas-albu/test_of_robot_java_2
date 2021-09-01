/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vidapropria2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 *
 * @author Andressa
 */
public class VidaPropria2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException {
        // TODO code application logic here
        
        Robot robo = new Robot();
        robo.delay(5000);
        robo.mouseMove(600, 400);
        robo.mousePress(InputEvent.BUTTON3_MASK);
        robo.mouseRelease(InputEvent.BUTTON3_MASK);
        
        robo.delay(1000);
        robo.keyPress(KeyEvent.VK_UP);
        robo.delay(100);
        robo.keyRelease(KeyEvent.VK_UP);
        
        robo.delay(1000);
        robo.keyPress(KeyEvent.VK_UP);
        robo.delay(100);
        robo.keyRelease(KeyEvent.VK_UP);
        
        robo.delay(1000);
        robo.keyPress(KeyEvent.VK_UP);
        robo.delay(100);
        robo.keyRelease(KeyEvent.VK_UP);
        
        robo.delay(1000);
        robo.keyPress(KeyEvent.VK_UP);
        robo.delay(100);
        robo.keyRelease(KeyEvent.VK_UP);
        
        robo.delay(1000);
        robo.keyPress(KeyEvent.VK_RIGHT);
        robo.delay(100);
        robo.keyRelease(KeyEvent.VK_RIGHT);
        
        robo.delay(1000);
        robo.keyPress(KeyEvent.VK_ENTER);
        robo.delay(100);
        robo.keyRelease(KeyEvent.VK_ENTER);
        
        //Criando pasta = 1
        
        robo.delay(3000);
        robo.keyPress(KeyEvent.VK_O);
        robo.delay(500);
        
        robo.delay(500);
        robo.keyPress(KeyEvent.VK_I);
        robo.delay(500);

        robo.keyPress(KeyEvent.VK_ENTER);
        
        //Entrando mouse para pasta: oi
        
        robo.keyPress(KeyEvent.VK_ENTER);
        
        robo.delay(5000);
        robo.mousePress(InputEvent.BUTTON3_MASK);
        robo.mouseRelease(InputEvent.BUTTON3_MASK);
        
        robo.delay(1000);
        robo.keyPress(KeyEvent.VK_UP);
        robo.delay(100);
        robo.keyRelease(KeyEvent.VK_UP);
        
        robo.delay(1000);
        robo.keyPress(KeyEvent.VK_UP);
        robo.delay(100);
        robo.keyRelease(KeyEvent.VK_UP);
        
        robo.delay(1000);
        robo.keyPress(KeyEvent.VK_RIGHT);
        robo.delay(100);
        robo.keyRelease(KeyEvent.VK_RIGHT);
        
        robo.delay(1000);
        robo.keyPress(KeyEvent.VK_ENTER);
        robo.delay(100);
        robo.keyRelease(KeyEvent.VK_ENTER);
        
        //Criando pasta com nome = java
        
        robo.keyPress(KeyEvent.VK_J);
        robo.delay(500);
        
        robo.keyPress(KeyEvent.VK_A);
        robo.delay(500);
        
        robo.keyPress(KeyEvent.VK_V);
        robo.delay(500);
        
        robo.keyPress(KeyEvent.VK_A);
        robo.delay(500);
        
        robo.keyPress(KeyEvent.VK_ENTER);
        robo.delay(500);
        
        //Entrando na pasta: chato
        
        robo.keyPress(KeyEvent.VK_ENTER);
        robo.delay(500);
        
        //Criando pasta: blablablabla
        
        robo.keyPress(KeyEvent.VK_B);
        robo.delay(500);
        
        robo.keyPress(KeyEvent.VK_L);
        robo.delay(500);
        
        robo.keyPress(KeyEvent.VK_A);
        robo.delay(500);
        
        robo.keyPress(KeyEvent.VK_B);
        robo.delay(500);
        
        robo.keyPress(KeyEvent.VK_L);
        robo.delay(500);
        
        robo.keyPress(KeyEvent.VK_A);
        robo.delay(500);
        
        robo.keyPress(KeyEvent.VK_B);
        robo.delay(500);
        
        robo.keyPress(KeyEvent.VK_L);
        robo.delay(500);
        
        robo.keyPress(KeyEvent.VK_A);
        robo.delay(500);
        
        robo.keyPress(KeyEvent.VK_ENTER);
        robo.delay(500);
        
        //Entrando na pasta: blablabla
        
        robo.keyPress(KeyEvent.VK_ENTER);
        
        //Criando pasta: oi
        
        robo.delay(3000);
        robo.keyPress(KeyEvent.VK_O);
        robo.delay(500);
        
        robo.delay(500);
        robo.keyPress(KeyEvent.VK_I);
        robo.delay(500);

        robo.keyPress(KeyEvent.VK_ENTER);
        
        //Entrando na pasta: oi
        
        robo.keyPress(KeyEvent.VK_ENTER);
        
        //Criando pasta: chato
        
        robo.keyPress(KeyEvent.VK_C);
        robo.delay(500);
        
        robo.keyPress(KeyEvent.VK_H);
        robo.delay(500);
        
        robo.keyPress(KeyEvent.VK_A);
        robo.delay(500);
        
        robo.keyPress(KeyEvent.VK_T);
        robo.delay(500);
        
        robo.keyPress(KeyEvent.VK_O);
        robo.delay(500);
        
        robo.keyPress(KeyEvent.VK_ENTER);
        robo.delay(500);
        
        //Entrando na pasta: chato
        
        robo.keyPress(KeyEvent.VK_ENTER);
        
        //Criando pasta: blablabla
        
        robo.keyPress(KeyEvent.VK_B);
        robo.delay(500);
        
        robo.keyPress(KeyEvent.VK_L);
        robo.delay(500);
        
        robo.keyPress(KeyEvent.VK_A);
        robo.delay(500);
        
        robo.keyPress(KeyEvent.VK_B);
        robo.delay(500);
        
        robo.keyPress(KeyEvent.VK_L);
        robo.delay(500);
        
        robo.keyPress(KeyEvent.VK_A);
        robo.delay(500);
        
        robo.keyPress(KeyEvent.VK_B);
        robo.delay(500);
        
        robo.keyPress(KeyEvent.VK_L);
        robo.delay(500);
        
        robo.keyPress(KeyEvent.VK_A);
        robo.delay(500);
        
        robo.keyPress(KeyEvent.VK_ENTER);
        robo.delay(500);
        
        //Entrando na pasta: blablabla
        
        robo.keyPress(KeyEvent.VK_ENTER);
        
        //Entrando mouse para pasta: oi
        
        
    }
    
}
