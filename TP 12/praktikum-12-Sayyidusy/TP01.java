import java.util.*;
public class TP01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		//scanner
      Scanner input=new Scanner(System.in);
      
         int angka,i,j,k;
//         System.out.println("masukan baris dan kolom");
         //m=in.nextInt();                 
         angka=input.nextInt();                     // mengisi angka baris dan kolom
         int original[][]=new int[angka][angka];       // dari Original Matrix
         int mirror[][]=new int[angka][angka];       // dari  Mirror Matrix
         k=angka-1;                                // variable untuk swap atau tukar
//         System.out.println("masukan angka matiriks");
         for(i=0;i<angka;i++)
         {
             for(j=0;j<angka;j++)
             {
                 original[i][j]=input.nextInt();     // memasukan element angka pada matriks
             }
         }
//         System.out.println("sebelum mirror");
         for(i=0;i<angka;i++)
         {
             for(j=0;j<angka;j++)
             {
//                 System.out.print(ar[i][j]+"\t");    // menampilkan Original Matrix
             }
//             System.out.println();
         }
         for(i=0;i<angka;i++)
         {
             for(j=0;j<angka;j++)
             {
                 mirror[i][j]=original[i][k-j];             // tukar Matriks Elements
             }

         }
         System.out.println();                      //jarak
//         System.out.println("sesudah mirror");
         for(i=0;i<angka;i++)
         {
             for(j=0;j<angka;j++)
             {
                 System.out.print(mirror[i][j]+" ");    //output mirror matriks
             }
             System.out.println();
         }
         System.out.println();
     }    
 }       