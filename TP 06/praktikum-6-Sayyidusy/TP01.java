import java.util.Scanner;
public class TP01 {

	private static double suhu(double R) {
    double konversi = (R - 32) * 5 / 9;

    return konversi;

    }
	public static void main(final String[] args) {
	// Kerjakan soalnya di sini
	Scanner input = new Scanner(System.in);

    double R1 = suhu(input.nextDouble());
    double R2 = suhu(input.nextDouble());
    double R3 = suhu(input.nextDouble());

    System.out.printf("%2.1f %2.1f %2.1f", R1, R2, R3);

        }
}

