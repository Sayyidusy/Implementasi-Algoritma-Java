import java.util.*;

public class Soal01 {
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        //keluaran output kondisi lampunya
        String[] output = { "HIDUP MATI", 
                            "HIDUP HIDUP", 
                            "MATI HIDUP",
                            "MATI MATI" 
                          };
        
        //deklarasi array tipe data string
        ArrayList<String> kondisiLampu = new ArrayList<>();//pake arraylist karena tipe data bisa di ganti
        // awal dari 0
        int i = 0;
        //kondisi bolean 
        boolean lampu = true;
        //input berapa kali tekan lampu                  
        int n = input.nextInt();

        //memakai while loop lansung eksekusi
        while (lampu) {
            if (i >= 3)
            //kondisi bolean berhnti jika false
            lampu= false;
            int input1 = input.nextInt();

            
            if (input1 <= 100) {

                kondisiLampu.add(output[i]);
            }
            i++;
        }

        for (String hasil : kondisiLampu) {
            System.out.println(hasil);
        }

    }

}