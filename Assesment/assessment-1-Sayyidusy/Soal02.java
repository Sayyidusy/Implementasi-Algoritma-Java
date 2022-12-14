import java.util.Scanner;
public class Soal02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		//scanner
        Scanner in = new Scanner(System.in);
		
        //variabel
        float berat = in.nextFloat();
        float tinggi = in.nextFloat();
        tinggi= tinggi/100;
        float hasil =berat/(tinggi*tinggi);
        float hasil2;

        
        
        //if else
        if (hasil < 18.5 ){
                hasil2 = berat / (tinggi*tinggi);
                System.out.print("BMI Anda adalah ");
                System.out.printf("%.2f",hasil2);
            System.out.print(". Termasuk kategori underweight.");
		} else if (hasil>= 18.5 && hasil<=24.9 ){
                hasil2 = berat / (tinggi*tinggi);
                System.out.print("BMI Anda adalah ");
                System.out.printf("%.2f",hasil2);
            System.out.print(". Termasuk kategori normal.");
		} else if (hasil>= 25 && hasil<=29.9 ){
                hasil2 = berat / (tinggi*tinggi);

                System.out.print("BMI Anda adalah ");
                System.out.printf("%.2f",hasil2);
            System.out.print(". Termasuk kategori overweight.");
		} else if (hasil>= 30 ){
                hasil2 = berat / (tinggi*tinggi);

                System.out.print("BMI Anda adalah ");
                System.out.printf("%.2f",hasil);
            System.out.print(". Termasuk kategori obesitas.");
        }
	}
}
