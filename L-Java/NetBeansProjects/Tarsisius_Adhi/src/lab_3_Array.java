/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @ciuus
 */
public class lab_3_Array {
    public static void main (String[]args) {
        char [] arrayC = {'k','a','k','i','k','a','k','a','k','k','e','n','a','k','a','y','u','t','a','k','b','e','r','p','a','k','u','k','a','k','u','k','a','k','u'};
        System.out.print("Isi object array : ");
        for(char c : arrayC) {
            System.out.print(c);
        }
        System.out.print("\n-----------------------------------\n");
        System.out.println("Jumlah character : "+arrayC.length);
        int jmlA = 0;
        for (char hurufA:arrayC) {
            if (hurufA == 'a') {
                jmlA++;
            }
        }
        System.out.println("Isi Huruf A : " +jmlA);
    
    }//main
}//class