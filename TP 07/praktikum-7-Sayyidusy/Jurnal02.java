import java.util.Scanner;

public class Jurnal02 {

	public static void main(final String[] args) {
		//scanner
		Scanner in = new Scanner(System.in);
		//input banyak cakram
		int banyak_cakram = in.nextInt();
		
		cara_pindah(banyak_cakram, 'A', 'B', 'C');

	}

	private static void cara_pindah(int n, char mulai, char tengah, char akhir) {
		if (n==1){
			System.out.println("Cakram 1 dipindahkan dari " + mulai + " ke " + akhir);
			return;
		}
			cara_pindah(n-1, mulai, akhir, tengah);
			System.out.println("Cakram " + n + " dipindahkan dari " + mulai + " ke " + akhir);
			cara_pindah(n-1, tengah, mulai, akhir);
		}
	}