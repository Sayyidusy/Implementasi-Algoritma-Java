import java.util.Scanner;
public class TP03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		//variabel
		int angka;
        int jumlah = 0;
		//scanner
        Scanner input = new Scanner (System.in);
		
        //while do
        do{
            
            angka = input.nextInt();
            jumlah += angka;
            
        }while (angka != 0);
		//output
        System.out.println(jumlah);
	}
}
