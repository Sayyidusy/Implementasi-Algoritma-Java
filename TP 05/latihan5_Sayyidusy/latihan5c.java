import java.util.Scanner;

public class latihan5c {

    public static void main(final String[] args) {
		//Bismillah
		
      //kumpulan variabel
        String kota;
        

        // scannernya
        Scanner input = new Scanner(System.in);

        // ambil input
        kota = input.nextLine();


        switch (kota.toLowerCase()) {
            case "jakarta":
                System.out.println("145.000");
                break;
            case "bogor":
                System.out.println("200.000");
                break;
            case "garut": case "purwakarta":
                System.out.println("75.000");
                break;
            default:

        }
		
		
	}
}
	