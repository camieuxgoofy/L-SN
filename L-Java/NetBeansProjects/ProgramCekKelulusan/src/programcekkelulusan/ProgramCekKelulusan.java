/*Membuat program cek kelulusan

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programcekkelulusan;
import java.util.Scanner;
      
/**
 *
 * @author User
 */
public class ProgramCekKelulusan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat variabel dan Scanner
    int nilai;
    String nama;
    Scanner scan = new Scanner (System.in);
     
        // mengambil input 
        System.out.print ("Nama: ");
        nama = scan.nextLine();
        System.out.print("Nilai: ");
        nilai = scan.nextInt();
        
        //cek apakah dia lulus atau tidak
        if (nilai >= 70)
            System.out.println("Selamat " + nama + ", anda lulus!");
        else 
                System.out.println("Maaf " + nama + ", anda gagal");
    }
    
                

