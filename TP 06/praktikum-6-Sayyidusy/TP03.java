import java.util.Scanner;
public class TP03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		// Kerjakan soalnya di sini
		//SWITCH CASE
    String namabidang;
    Scanner input = new Scanner (System.in);
    
        System.out.print("");
        namabidang = input.nextLine();
        
        switch(namabidang){
            case "Persegi" :
                int sisi;
                sisi = input.nextInt();
                System.out.print(sisi*sisi);
                System.out.print(" "+4*sisi);
            break;
            case "Persegi Panjang":
                int panjang ;
                int lebar ;
                panjang = input.nextInt();
                lebar = input.nextInt ();
                System.out.print(panjang*lebar);
                System.out.print(" "+2*(panjang+lebar));
            break;
            case "Segitiga":
                int alas;
                int tinggi;
                alas = input.nextInt();
                tinggi = input.nextInt();
                System.out.print((alas*tinggi)/2);
                System.out.print(" "+ 3*tinggi);
            break;
            case "Lingkaran":
                int diameter;
                double p = 3.14;
                diameter = input.nextInt();
                int r = (diameter/2) ;
                System.out.print(p*r*r +" ");
                System.out.print(p*diameter);
             //   ((diameter/2)*(diameter/2))/p
                
                    
        }
	}
}
