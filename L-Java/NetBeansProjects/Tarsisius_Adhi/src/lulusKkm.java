
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @ciusbandicoot
 */
import javax.swing.JOptionPane;

public class lulusKkm {
    public static void main(String[] args) {
    //masukan nama dan nilai
            String nama=JOptionPane.showInputDialog("Masukan Nama : ");
            int nilai = Integer.parseInt(JOptionPane.showInputDialog("Nilai :"));
            String ket;
            //jika nilai lebih besar 70 maka ket="lulus "jika tidak
            //maka ket="tidak lulus, harus remedial"
        if (nilai >=70)
        {ket="Lulus";
        JOptionPane.showMessageDialog(null, "Lulus");}
        else
        {ket="Tidak Lulus, Harus Remedial";
        JOptionPane.showMessageDialog(null,
                "Nama : "+ nama + "\n" +
                "Nilai: "+ nilai + "\n" +
                "Kkm  : 70 \n" +
                "Keterangan : " +ket);
                }
    }
}