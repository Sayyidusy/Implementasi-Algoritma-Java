import java.util.Scanner;

public class TP02 {

	public static void main(final String[] args) {

		//Membuat variabel
		String kalimat;

		Scanner input;

		// membuat scanner baru
		input = new Scanner(System.in);

		// Mengambil input dari user
		kalimat = input.nextLine();


		//Penggunaan method
		kalimat = penghematKata(kalimat);


		System.out.print(kalimat + " ");



	}
	     private static String penghematKata(String kata) {

		kata = kata.replace("a","");
		kata = kata.replace("i","");
		kata = kata.replace("u","");
		kata = kata.replace("e","");
		kata = kata.replace("o","");

		return kata;
	}
}