import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author User
 */
public class Latihan_Analisa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Nama File: ");
        String file = input.nextLine();
        try{
            Scanner fs = new Scanner(newFileReader(file)):
            while(fs.hasNextLine())(
                    String isi = fs.nextLine());
                    System.out.print(isi);
    }
    
}
catch (FileNotFoundException fe){
   System.out.println("Invalid filename.Try another:");
   //getFileScanner();
}

}