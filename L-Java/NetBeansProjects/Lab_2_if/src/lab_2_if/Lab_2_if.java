/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2_if;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class Lab_2_if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sNama, sMataKuliah, sNilai;
        int Nilai;
        
        JOptionPane.showInputDialog("NAMA=");
        JOptionPane.showInputDialog("MATAKULIAH=");
        
        sNilai = JOptionPane.showInputDialog("NILAI=");
        Nilai = Integer.parseInt(sNilai);
        if(Nilai>=70){System.out.println("Nilai anda sempurna");}
        else {System.out.println("Nilai anda belum sempurna");}
    }
    
}
