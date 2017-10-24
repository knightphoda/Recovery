/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationbruno;
import java.awt.Dimension;
import java.awt.Toolkit;
import javaapplicationbruno.Tela.TelaPrograma;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
/**
 *
 * @author Luis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){      
        TelaPrograma abre;                                                      //Inicia a Tela Principal do programa
        abre = new TelaPrograma();
        abre.setVisible(true);
        abre.setResizable(false);
        abre.setLocationRelativeTo(null);
        
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) { //Setar o look and feel do programa
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
           // If Nimbus is not available, you can set the GUI to another look and feel.
        }
    }
    
}
