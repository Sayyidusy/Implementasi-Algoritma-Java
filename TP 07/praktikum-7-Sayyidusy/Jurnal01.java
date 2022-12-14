import java.util.Scanner;
public class Jurnal01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		//scanner
            Scanner input = new Scanner(System.in);
            
            //masukan angka atau nilai FPB
            int angka  = input.nextInt();
            int angka1 = input.nextInt();
            
            // variabel FPB ke hasil FPB nya
            int FPB = hitungFPB (angka,angka1);
            
            //output 
            System.out.println(FPB);
        }
    private static int hitungFPB (int x, int y){
        //If x lebih besar dari y
        //jika x sisa baginya habis atau 0 maka FPB nya y
        if (x > y){ 
            if (x % y == 0){
                return y;
            }else { 
                return hitungFPB(y, x % y);
            }
        }
        //if y sisa baginya habis atau 0 maka FPB nya x
        else {
            if (y % x ==0){
                return x;
            }else{
                return hitungFPB (x, y % x);
            }
        }
    }
}

