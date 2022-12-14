import java.util.Scanner;
public class Jurnal02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		//scanner
		Scanner input = new Scanner (System.in);
        //input tabel perkalian sampe berapa
        int n = input.nextInt();
        //nested for
		
		//nested for bagian baris kebawah 
		for (int i = 1; i <= n; i++) {
		//nested for bagian ke samping 
        for (int j = i; j <= n * i; j += i) {
            System.out.print(j + " ");
        }
        System.out.println();
           }
        }
}