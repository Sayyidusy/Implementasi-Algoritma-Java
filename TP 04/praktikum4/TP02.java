import java.util.Scanner;
public class TP02 {
	//diskon 5%  jika beli antara 100rb-200rb
    //diskon 10% jika beli di atas 200rb
    //diskon 0%  jika beli di bawah 100rb
    //harga 18rb per kg
	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		//kumpulan interger
        int diskon, total_diskon, total_harga, total_biaya;
        
       Scanner user = new Scanner(System.in);
		final int harga = 18000;
	
		int kg = user.nextInt();
		
		total_harga = kg * harga;
                
		if(total_harga > 200000){
			diskon = 10; //diskon 10%
			total_diskon = (diskon * total_harga)/100;
			total_biaya = total_harga - (total_diskon);
                        
		}else if(total_harga >= 100000 && total_harga <= 200000 ) {
			diskon = 5; //diskon 5%
			total_diskon = (diskon * total_harga)/100;
			total_biaya = total_harga - (total_diskon);
                        
		}else{
			diskon = 0;
			total_diskon = diskon * total_harga;
			total_biaya = total_harga;}
		
		System.out.println("Telur " + kg + " x " + harga + " = " + total_harga);
		System.out.println("Diskon " + diskon + "% = " + total_diskon);
		System.out.println("Total dibayar = " + total_biaya);
	}
}
