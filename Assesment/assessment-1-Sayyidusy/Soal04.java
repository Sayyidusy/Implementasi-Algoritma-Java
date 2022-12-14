import java.util.Scanner;
public class Soal04 {
	//rekursif
	private static int pangkat(int x, int y) {
		//memakai if else
      if (y == 0) {
         return 1;
      }
      else {
         return x * pangkat(x, y - 1);
      }
   }

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		//scanner
       Scanner input =new Scanner (System.in);
	   
       //inputnya
       int angka = input.nextInt();
       int pangkatnya = input.nextInt();
       
     
       //outputnya
       System.out.println(pangkat(angka,pangkatnya));
   }
	
}
