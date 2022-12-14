import java.util.*;
public class TP03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		
		int i, j, k, angka, jumlah = 0;
         
         Scanner scan = new Scanner(System.in);
//    System.out.print("Masukkan jumlah baris matriks pertama: ");
    angka = scan.nextInt();
    
    int matriks1[][] = new int[angka][angka];//dari matriks 1
    int matriks2[][] = new int[angka][angka];//dari matriks 2
    int hasil[][] = new int[angka][angka];//untuk matriks hasil nya
    
    //if else , sbnernya g usah sih tpi pake buat program lain haha
    // if untuk mendeklarasikan jika angka tidak sama dengan angka maka Matriks tidak dapat dikalikan satu sama lain
    //
    if (angka != angka) {
      System.out.println("Matriks tidak dapat dikalikan satu sama lain.\n");
    } else {
//      System.out.println("Masukkan elemen matriks pertama: ");
      for (i = 0; i < angka; i++) {
        for (j = 0; j < angka; j++) {
          matriks1[i][j] = scan.nextInt(); //masukan element setiap kolom dan baris (1)
        }
      }
//      System.out.println("Masukkan elemen matriks kedua: ");
      for (i = 0; i < angka; i++) {
        for (j = 0; j < angka; j++) {
          matriks2[i][j] = scan.nextInt(); //masukan element setiap kolom dan baris (2)
        }
      }
      for (i = 0; i < angka; i++) {
        for (j = 0; j < angka; j++) {
          for (k = 0; k < angka; k++) {
            jumlah = jumlah + matriks1[i][k] * matriks2[k][j]; //operasi perkalian pada element matriks
          }
          hasil[i][j] = jumlah;
          jumlah = 0;
        }
      }
//      System.out.println("Hasil perkalian matriks: ");
        System.out.println();
      for (i = 0; i < angka; i++) {
        for (j = 0; j < angka; j++) {
          System.out.print(hasil[i][j] + " ");//hasil perkalian matriks
        }
        System.out.println();
      }
    }
  }
}