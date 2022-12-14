import java.util.Scanner;
public class Soal03 {
	
	static String[] huruf ={"","satu","dua","tiga","empat","lima","enam","tujuh","delapan","sembilan","sepuluh","sebelas"};
	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		//scanner
          Scanner input = new Scanner(System.in);
          //variabel angka buat di jumlahkan
          long angka  = input.nextInt();
          long angka2 = input.nextInt();
          //operasi penjumlahan
          long hasilpenjumlahan  = angka + angka2;
		  //output
          System.out.println(new Soal03().hasil(hasilpenjumlahan));
	}
	private static String hasil(Long angka){
        if(angka < 12)
            return huruf[angka.intValue()];
        if(angka >=12 && angka <= 19)
           return huruf[angka.intValue() % 10] + " belas";
        if(angka >= 20 && angka <= 99)
           return hasil(angka / 10) + " puluh " + huruf[angka.intValue() % 10];
        if(angka >= 100 && angka <= 199)
           return "seratus " + hasil(angka % 100);
        if(angka >= 200 && angka <= 999)
           return hasil(angka / 100) + " ratus " + hasil(angka % 100);
        if(angka >= 1000 && angka <= 1999)
           return "seribu " + hasil(angka % 1000);
        if(angka >= 2000 && angka <= 999999)
           return hasil(angka / 1000) + " ribu " + hasil(angka % 1000);
        return "";
        }
}
