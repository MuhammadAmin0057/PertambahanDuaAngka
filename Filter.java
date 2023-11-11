/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Filter {
    public static void digitFilter (KeyEvent evt){
        char input = evt.getKeyChar();
        if (!((Character.isDigit(input)) ||
                (input == KeyEvent.VK_BACK_SPACE)   ||
                (input == KeyEvent.VK_DELETE))){
        
            new JFrame().getToolkit().beep();
            JOptionPane.showMessageDialog(null, "error");
        }
    }
    
}
