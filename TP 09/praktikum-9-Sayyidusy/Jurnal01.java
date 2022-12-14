import java.util.Scanner;
public class Jurnal01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		//scanner
        Scanner input = new Scanner(System.in);
        //variabel
        int angka =input.nextInt();
        String gg ;
        //method for
        for( int i = 1; i <= angka ; i++){    
           
            //pake if else biar tau mana yang ganjil mana yang genap
            if ((i % 2) == 0) {
                gg = "Genap";
            System.out.println(i +" - "+ gg);
        }
        else { 
                gg = "Ganjil";
            System.out.println(i + " - " + gg);
        } 
   }    
    
  }  
}  
//ganjil di modulus 2 sisa 1
//genap di modulus 2 habis atau sisa 0