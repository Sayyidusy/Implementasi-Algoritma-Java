import java.util.Scanner;
public class Jurnal03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		//Scanner
		Scanner input = new Scanner(System.in);
		//input Scanner
        int jariJari = input.nextInt();
        int tinggi = input.nextInt();
		
        System.out.printf("%.3f%n", luasPermukaanKerucut(jariJari, tinggi));
    }
	//method
    private static double luasPermukaanKerucut(int jariJari, double tinggi) {
        double luas = Math.PI*jariJari*(jariJari+(Math.sqrt((tinggi*tinggi)+(jariJari*jariJari))));
        return luas;
	}
}
