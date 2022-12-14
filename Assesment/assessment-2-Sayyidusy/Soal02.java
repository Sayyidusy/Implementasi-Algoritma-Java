import java.util.*;

public class Soal02 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        //menginput kalimat
        String kalimat = input.nextLine();
        //hasil menerjemahkan kalimat
        String hasil = "";
        // split() ambil nilai didalam variabel string 
        // split() untuk memaninpulasi string
        String[] kata = kalimat.split(" ");

        for (int i = 0; i < kata.length; i++) {
            // mengetahui jumlah karakter pada string
            int huruf1 = kata[i].length();
            int huruf2 = huruf1 - 2;
            //memotong bagian suatu string
            // substring(0, huruf2) adalah memotong 2 huruf belakang nya
            hasil = hasil + kata[i].substring(0, huruf2) + " ";
        }
        //output hasil menerjemahkan kalimat
        System.out.println(hasil);
    }
}