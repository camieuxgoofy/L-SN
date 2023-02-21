/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2_switch;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Lab_2_switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String sNilai;
       sNilai = JOptionPane.showInputDialog("Masukkan jenis membership anda =");
       sNilai = sNilai.toUpperCase();
       switch (sNilai)
       { case "GOLD":
          JOptionPane.showMessageDialog(null,"Terima kasih atas input anda sebagai member");
          JOptionPane.showMessageDialog(null,"Karena membership anda adalah GOLD, anda\n"+
          "Mendapatkan poin voucher sebesar 50 ribu rupiah");
          
       break;
    
       case "SILVER":
          JOptionPane.showMessageDialog(null,"Terima kasih atas input anda sebagai member");
          JOptionPane.showMessageDialog(null,"Karena membership anda adalah SILVER, anda\n"+
          "Mendapatkan poin voucher sebesar 30 ribu rupiah");
          
       break;
    
       case "BRONZE":
          JOptionPane.showMessageDialog(null,"Terima kasih atas input anda sebagai member");
          JOptionPane.showMessageDialog(null,"Karena membership anda adalah BRONZE, anda\n"+
          "Mendapatkan poin voucher sebesar 10 ribu rupiah"); 
          
          break;
    
       default:
          JOptionPane.showMessageDialog(null,"Terima Kasih atas input anda\n"+"anda sebagai konsumen");
          JOptionPane.showMessageDialog(null,"Meskipun anda bukan member, anda berhak mendapatkan potongan sebesar\n"+
          "5000 rupiah dari total belanja");
       }
    }
    
}
