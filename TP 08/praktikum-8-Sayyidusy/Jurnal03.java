import java.util.Scanner;
public class Jurnal03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		//variabel
            int angka,i;
            int faktorial,lastdig;
            //scanner
            Scanner input = new Scanner(System.in);
            //input angka
            angka = input.nextInt();
            //variabel 2
            int total = 0;
            int temp_n = angka;
            
            //while loop
            while(angka != 0){
                    i = 1;
                    faktorial = 1;
                    lastdig = angka % 10;
                    while(i <= lastdig)
                {
                    
                faktorial = faktorial * i;
                i++;
                }
                total = total + faktorial;
                angka = angka / 10;
            
            }
            if(total == temp_n){
            System.out.println("YA");
            }else{
            System.out.println("BUKAN");}
            
//                        ======PENGERTIAN======
//            145 : 1!+4!+5!       = 1+24+120   = 145      Special number
//            19  : 1!+9!          = 1+362880   = 362881   Not a Special number
//            124 : 1!+2!+4!       = 1+2+24     = 27       Not a Special number
//             1  : 1!             = 1          = 1        Special number
	}
}
