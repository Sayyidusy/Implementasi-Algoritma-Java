import java.util.Scanner;
public class Jurnal02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		//variabel
		int angka;
		int a =0;
		//variabel biar ada koma
        double jumlah = 0;
		//scanner
        Scanner input = new Scanner (System.in);
        //do-while
        do{
            //kondisi do while
			a++;
            angka = input.nextInt();
            jumlah += angka;
			
        }while (angka != 0);
		//output
		//print f untuk dua angka di belakang koma
        System.out.printf("%.2f", jumlah/(a-1));
	}
}
