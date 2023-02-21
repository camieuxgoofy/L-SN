/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class LatString {
  public static void main(String[] args) {
      String sKalimat = "ABCDEFGHI";
      System.out.println(sKalimat);
      String sPotongan1 = sKalimat.substring(4);
      System.out.println("sKalimat.substring(4)="+sPotongan1);
      String sPotongan2 = sKalimat.substring(4,5);
      System.out.println("sKalimat.substring(4,5)="+sPotongan2);
  }//main
  }//class
