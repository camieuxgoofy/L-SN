//cp
import java.util.Scanner;
public class kalkulatorbisa {
    double bil1;
    double bil2;
    double hasil;
    int Operasi;
   
    public void tambah (){
       
        hasil=bil1+bil2;
       
    }
    public void kurang(){
       
        hasil=bil1-bil2;
      
    }
    public void bagi(){
       
        hasil=bil1/bil2;
      
    }
    public void kali (){
       
        hasil=bil1*bil2;
       
    }
    int Operasi(){
        if(Operasi==1){
            tambah();
        System.out.println("Hasil= "+hasil);}
            else if(Operasi==2){
                    kurang();
            System.out.println("Hasil ="+hasil);}
                else if(Operasi==3){
                    bagi();
                System.out.println("Hasil= "+hasil);}
                    else{
                    kali();
                    System.out.println("Hasil= "+hasil);}
                   
        return Operasi;
                    }
            
   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        kalkulatorbisa kb = new kalkulatorbisa();
        double hasil , Operasi,bil1,bil2;
       
        System.out.println("Nilai 1");
        kb.bil1 = input.nextInt();
        System.out.println("Nilai 2");
        kb.bil2 = input.nextInt();
      
        System.out.println("Pilih Operasi \n=============");
        System.out.println("1.Tambah\n2.Kurang\n3.Bagi\n4.Kali");
        kb.Operasi=input.nextInt();
        kb.Operasi();
    }
}