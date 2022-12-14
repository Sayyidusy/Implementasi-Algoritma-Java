import java.util.*;
public class Jurnal01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);

		int matrix = input.nextInt();
		int mirror = matrix-1;

		int[][] matriks = new int[matrix][matrix];
		for (int i = 0; i < matrix; i++) {
			for (int j = 0; j < matrix ; j++) {

				matriks[i][j] = input.nextInt();
			}
		}

		for (int i = 0; i < matrix; i++) {
			for (int j = 0; j < matrix; j++) {

				System.out.print(matriks[mirror][j] + " ");

			}

			mirror--;
			System.out.println();
		}

	}
}