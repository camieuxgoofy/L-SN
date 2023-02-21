/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SI;

import static java.awt.PageAttributes.MediaType.C;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class A {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A;
        int B, C;
        
        String strA = JOptionPane.showInputDialog("Nilai A: ");
        String strB = JOptionPane.showInputDialog("Nilai B: ");
        A = Integer.parseInt(strA); //konversi string ke int
        B = Integer.parseInt(strB); //konversi string ke int
        C = A * B;
        
        JOptionPane.showMessageDialog(null,"C = A * B =" + C) ;
    }
    
}
