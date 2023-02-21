/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2_periksakarakterstring_2;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Lab_2_PeriksaKarakterString_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Kalimat;
        char cari;
        int jumlah =0;
        
        Kalimat = JOptionPane.showInputDialog(null,"masukkan kalimat anda");
        
        cari = JOptionPane.showInputDialog(null,"masukkan karakter yang ingin dihitung jumlahnya").charAt(0);
        
        for(int i = 0; i<Kalimat.length();i++){
            if(cari == Kalimat.chartAt(i)){
                jumlah ++;
            }
        }
        JOptionPane.showMessageDialog(null,"jumlah huruf" + ""+ cari + "n" + jumlah);
    }
    
}
    }
    
}
