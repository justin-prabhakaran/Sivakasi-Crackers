/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sivakasicrackers;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;

/**
 *
 * @author justin
 */
public class Sivakasicrackers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception e) {
            System.out.println("Dark");
        }
        new LogoPage().setVisible(true);
        
    }
    
}
