
import java.util.Scanner;

//tugas 2

        //membuat variabel dengan String

        /* Dira sedang merancang sebuah aplikasi perkenalan sederhana. Ia ingin program tersebut meminta nama dan 
        usia penggunanya, kemudian program tersebut menampilkan tulisan dengan format tertentu. Bantulah Dira 
        membuat program tersebut.
        
        nama pengguna= Ahmad Karim
        Usia pengguna= 32
        */

public class tugas2{

    public static void main(String [] args){

        Scanner userInput = new Scanner(System.in);

        System.out.println("Siapa nama mu = ");
        String nama = userInput.nextLine();

        System.out.println("Berapa usia mu = ");
        int usia = userInput.nextInt();

        System.out.println("Halo,"+nama);
        System.out.println("Ternyata usiamu baru,"+usia+" Tahun ya!");


    }
}