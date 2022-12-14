import java.util.*;
public class TP02 {

	public static void main(final String[] args) {
		  
        int angka, i, j; //variabel
        Scanner input = new Scanner(System.in); //scanner
//            System.out.print("Masukkan jumlah baris matriks: ");
//           n = scan.nextInt();
//            System.out.print("Masukkan jumlah kolom matriks: ");
            angka = input.nextInt(); //masukan kolom dan baris pada matriks
//            System.out.println("Masukkan elemen matriks pertama: ");

            int matriks1[][] = new int[angka][angka]; //dari matriks 1
            int matriks2[][] = new int[angka][angka]; //dari matriks 2
            int hasil[][] = new int[angka][angka];  //untuk matriks hasil nya
            
            
            for (i = 0; i < angka; i++) {
              for (j = 0; j < angka; j++) {
                matriks1[i][j] = input.nextInt(); //masukan element setiap kolom dan baris (1)
              }
            }
//            System.out.println("Masukkan elemen matriks kedua: ");
            for (i = 0; i < angka; i++) {
              for (j = 0; j < angka; j++) {
                matriks2[i][j] = input.nextInt();//masukan element setiap kolom dan baris (2)
              }
               
            }
//            System.out.println("Hasil penjumlahan matriks: ");
              System.out.println();
            for (i = 0; i < angka; i++) {
              for (j = 0; j < angka; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j]; //hasil penjumlahan matriks
                System.out.print(hasil[i][j] + " "); //output hasil penjumlahan kedua matirks
              }
              System.out.println();
            }
      }
}