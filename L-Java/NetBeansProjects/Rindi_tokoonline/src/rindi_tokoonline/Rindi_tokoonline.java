/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rindi_tokoonline;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Rindi_tokoonline {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat variabel belanja dan scanner
        int belanja = 0;
                Scanner scan = new Scanner (System.in);
                
       // mengambil input 
       System.out.print("Total Belanjaan: Rp ");
       belanja = scan.nextInt();
       
       // cek apakah dia belanja di atas 100000
      if (belanja > 100000) {
          System.out.println("Selamat, anda mendapatkan hadiah!");
      }
      System.out.println("Terima Kasih");
      
              
    }
    
}
