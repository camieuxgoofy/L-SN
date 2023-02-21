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
public class satu1 {
  public static void main(String[] args){
    double dRadius, dKeliling, dLuas;
    dRadius = Double.parseDouble(JOptionPane.showInputDialog("Masukkan input Jari-jari :"));
    dLuas = 3.14 * dRadius * dRadius;
    dKeliling = 3.14 * dRadius * 2;
    JOptionPane.showMessageDialog(null, "Luas lingkaran : " + dLuas + "\nKeliling lingkaran : " + dKeliling);
  }
}