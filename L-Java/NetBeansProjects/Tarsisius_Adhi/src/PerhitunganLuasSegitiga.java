
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
public class PerhitunganLuasSegitiga {
    public static void main(String[] args){
        String sAlas = JOptionPane.showInputDialog("nilai alas : ");
        String sTinggi = JOptionPane.showInputDialog("nilai tinggi : ");
        float alas = Integer.parseInt(sAlas);
        float tinggi = Integer.parseInt(sTinggi);
        float luas =(alas*tinggi);
        JOptionPane.showMessageDialog(null,"luas = px1 = " + alas + "X" + tinggi + "=");
    }
}
