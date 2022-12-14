import java.util.Scanner;
public class Jurnal03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		//scanner
         Scanner input = new Scanner(System.in);
         //variabel
        int angka, cek=0;
        //input angka
        angka=input.nextInt();
   
        //method for
        for (int i=2; i<=angka; i++){
            if (angka%i==0){
                cek++;
            } 
        }
        //if else output keluaran bilangan prima atau bukan
        if (cek==1){
            System.out.println("YA");
        }else {
            System.out.println("BUKAN");
        }  
   }
}
