/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package click;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class OperatorAritmatika {
    public static void main(String[]arg){
        int angka1;
        int angka2;
        int hasil;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Input angka1:");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka2:");
        angka2 = keyboard.nextInt();
        
       //penjumlahan
       
       hasil = angka1 + angka2;
       System.out.println("Hasil=" +hasil);
       
       System.out.print("Input angka1:");
       angka1 = keyboard.nextInt();
       System.out.print("Input angka2:");
       angka2 = keyboard.nextInt();
       
       //pengurangan
       
       hasil=angka1 - angka2;
       System.out.println("Hasil=" +hasil);
       
       System.out.print("Input angka1:");
       angka1 = keyboard.nextInt();
       System.out.print("Input angka2:");
       angka2 = keyboard.nextInt();
       
       //perkalian
       
       hasil=angka1 * angka2;
       System.out.println("Hasil=" +hasil);
       
       System.out.print("Input angka1:");
       angka1 = keyboard.nextInt();
       System.out.print("Input angka2:");
       angka2 = keyboard.nextInt();
       
       //pembagian
       
       hasil=angka1 / angka2;
       System.out.println("Hasil=" +hasil);
       
       System.out.print("Input angka1:");
       angka1 = keyboard.nextInt();
       System.out.print("Input angka2:");
       angka2 = keyboard.nextInt();
       
       //Sisa Bagi
       
       hasil= angka1%angka2;
       System.out.println("Hasil=" +hasil);
       
    }
    
}
