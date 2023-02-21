/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktek_4;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class VisualLuasPersegiPanjang {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Panjang,Lebar,Luas;
        Panjang=Double.parseDouble(JOptionPane.showInputDialog(null,"Masukan Panjang (cm)="));
        Lebar=Double.parseDouble(JOptionPane.showInputDialog(null,"Masukan Lebar (cm)="));
        Luas = Panjang * Lebar;
       JOptionPane.showMessageDialog(null,"Luas Persegi Panjang = Panjang * Lebar = " + Luas) ;
        // TODO code application logic here
    }
    
}
