import java.util.Scanner;
public class Jurnal01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		//scanner
		Scanner input = new Scanner(System.in);
		//input bil bulat r dan n
		int zatRadioAktif = input.nextInt();
		int hari = input.nextInt();
		// variabel
		// pangkat/10
		int pangkat = hari/10;
		int rasio = 2;
		int i = 1; 
		//while loop
		while(i < pangkat){
			rasio *=2;
			i++;
		}
		double rumus = (double) zatRadioAktif / rasio;
		//looping
		System.out.printf("%.3f\n",rumus);
	}
}
