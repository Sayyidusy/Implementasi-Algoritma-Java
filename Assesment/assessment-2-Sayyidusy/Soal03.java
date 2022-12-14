import java.util.*;

public class Soal03 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        //isisialisasi 3x3 matriks

        int arr[][] = new int [angka][angka],
        tabel[][] = new int[3][3];

        //masukan data2 tiap elements
        for (int i = 0; i < angka; i++) {
            for (int j = 0; j < angka; j++) {
                arr[i][j] = input.nextInt(); // memasukan element angka pada matriks
            }
        }
        //output 
        printMatrix(sortMatrix(arr));
    }

    // method untuk urutkan matriks element
    private static int[][] sortMatrix(int arr[][]) {
        int temp[] = new int[3 * 3];
        int k = 0, i, j;
        // Copying the array elements into a 1D array
        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++) {
                temp[k++] = arr[i][j];
            }

        // urutkan array 1D
        Arrays.sort(temp);
        k = 0;
        // Menyalin elemen dari array yang diurutkan ke dalam array 2D
        for (i = 0; i < 3; i++)
            for (j = 0; j < 3; j++) {
                arr[i][j] = temp[k++];
            }
        return arr;
    }

    // Method print matriks
    private static void printMatrix(int arr[][]) {
        int i, j;
        // Loop untuk print elements
        for (i = 0; i < 3; i++) {
            // pake loop for
            System.out.print("\n");
            for (j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.print("");
    }
}