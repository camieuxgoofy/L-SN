/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class nilaiBahasa {
    
    private static double[] nilaibahasa;
    public static void main(String[] args) {
        double [] nilaiBahasa = {20.5,78.8,40.25,90.15,77,92,46,99,48,60,62,67,80.67,88,11.55};
        int no=1;
        double total=0,max=20.5,min=20.5;
        System.out.printf("Daftar  Nilai Bahasa");
        System.out.printf("====================");
        for ( double i : nilaiBahasa){
        System.out.printf(no+"\t"+i);
        no++;}
        total = total + i;
        if (max < i ) {
            max = i;} //if max
        if (min > i ) {
            min = i;} //if min
                //for
        System.out.printf("====================");
        System.out.printf("total :"+total);
        System.out.printf("Rata-rata :"+total);
        System.out.printf("Nilai Maksimum :" + max);
        System.out.printf("Nilai Minimum :"+ min);
        } //void main
    } //void main

