/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class  jarakdanwaktu {
    public static void main(String[] args){
        double dJarak, dWaktu, dKecepatan;
        String sJarak = JOptionPane.showInputDialog("Masukan Nilai Jarak (km) :");
        String sWaktu = JOptionPane.showInputDialog("Masukan Nilai Waktu Tempuh (jam) :");
        dKecepatan = Double.parseDouble(JOptionPane.showMessageDialog("Kecepatan :"));
        dKecepatan = dJarak / dWaktu;
        JOptionPane.showMessageDialog(null,"Kecepatan :" + dKecepatan);
    }//end void main
}//end public class
