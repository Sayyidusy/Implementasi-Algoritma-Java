import java.util.Scanner;

public class latihan5d {

    public static void main(final String[] args) {
		//Bismillah
		
		//kumpulan variabel
        int penumpang,hargaTotal;
        double diskon, hargaDiskon;
        String kota;
        

        // scannernya
        Scanner input = new Scanner(System.in);

        // ambil input
        kota = input.nextLine();
        penumpang = input.nextInt();

        switch (kota.toLowerCase()) {
            case "jakarta":
                hargaTotal = 145000*penumpang;
                System.out.println(hargaTotal);
                break;
            case "bogor":
                hargaTotal = 200000*penumpang;
                if (hargaTotal <= 200000) {
                    System.out.println(hargaTotal);

                }else if (hargaTotal > 200000) {
                    diskon = hargaTotal * 0.1;
                    hargaDiskon = hargaTotal - diskon;
                    System.out.println((long) hargaDiskon);
                }
                break;
            case "garut": case "purwakarta":
                hargaTotal = 75000*penumpang;
                System.out.println(hargaTotal);
                break;
            default:

        }
		
		
	}
}
	