import java.util.*;
public class lat2 {

        public static void main(String[] args) {
            
         Scanner input = new Scanner(System.in);
       //  System.out.println("Masukkan jumlah baris dan kolom:");
         int baris = input.nextInt();
         // System.out.println("Masukkan jumlah kolom:");
         int angka = input.nextInt();
         int[][] matriks = new int[baris][baris];
         for (int i = 0; i < baris; i++) {
         for (int j = 0; j < baris ; j++) {
//         System.out.println("Masukkan elemen untuk baris " + i
//         + " dan kolom " + j);
         matriks[i][j] = input.nextInt();
          }
         }
        // System.out.println("Matriks yang dibentuk: ");
         System.out.println();
         for (int i = 0; i < baris; i++) {
             
         for (int j = 0; j < baris; j++) {
             //baris dan kolom dikali dengan angka yang user input
         int hasil = matriks [i][j] *angka;
         System.out.print(hasil + " ");
         
         }
         System.out.println();
       }
   }
} 