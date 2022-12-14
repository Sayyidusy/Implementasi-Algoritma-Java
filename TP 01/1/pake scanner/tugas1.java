        //TUGAS_IMA_TP_SOAL1
        //BISMILLAH
import java.util.Scanner;

    //tugas01
        /*Seorang mahasiswa, sebut saja Dira, memutuskan untuk mulai menabung, karena ia ingin membeli laptop 
        baru yang lebih canggih. Dira ingin tahu, `jika dia menabung sebesar X Rupiah/hari, 
        selama N hari berturutturut, berapakah jumlah uang tabungannya? 
        Buatlah sebuah program untuk membantu Dira!

        jika    x=Rp.150.000 
                n=30 hari

                brp total uang tabungan Dira?
        */

public class tugas1{

    public static void main(String [] args){

        Scanner userInput = new Scanner(System.in);
        int x, n, nilai ;

        
        System.out.print("x =");
        x = userInput.nextInt();
        System.out.print("n =");
        n = userInput.nextInt();
        
        nilai = x*n ;
    
        System.out.println("nilai =" + nilai);
    }
}