/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import javax.swing.JOptionPane;

public class LulusUnsd {
     public static void main(String[] args) {
          String sNoUjian=JOptionPane.showInputDialog("No Ujian : ");
          String sNama=JOptionPane.showInputDialog("Nama : ");
          int bahasa = Integer.parseInt(JOptionPane.showInputDialog("bahasa :"));
          int matematika = Integer.parseInt(JOptionPane.showInputDialog("matematika :"));
          int ipa = Integer.parseInt(JOptionPane.showInputDialog("ipa :"));
          String ket;
          if ((bahasa >=75)&&(matematika >=60&&(ipa >=70)))
          {ket="Lulus ";
        JOptionPane.showMessageDialog(null, "Lulus");}
        else
        {ket="Tidak Lulus, Harus Remedial";
        JOptionPane.showMessageDialog(null,
                "Nama : "+ sNama + "\n" +
                "Nilai: "+ bahasa + matematika + ipa + "\n" +
                "Kkm  : 70 \n" +
                "Dinyatakan Anda Lulus UN : " + ket);
        }
    }
}
