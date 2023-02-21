
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class VisualLuasPersegiPanjang {
public static void main(String[] args){
    String sPanjang = JOptionPane.showInputDialog("Nilai Panjang : ");
    String sLebar = JOptionPane.showInputDialog("Nilai Lebar : ");
    int panjang = Integer.parseInt(sPanjang);
    int lebar = Integer.parseInt(sLebar);
    short luas =(short) (panjang*lebar);
    JOptionPane.showMessageDialog(null,"luas = px1 = " + panjang + "X" + lebar + "=");
    }
}
