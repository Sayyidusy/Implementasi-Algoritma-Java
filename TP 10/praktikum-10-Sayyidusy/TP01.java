public class TP01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		//nested for, alas 5 tinggi 5 segitiga siku siku
		
		//angka 1 tapi kebawah
            for(int i = 1 ; i <= 5 ; i++ ) {
				//angka selanjut nya abis angka 1 dan 
                for(int j = 1; j <= i; j++) {
                    System.out.print("*");
                 }
                System.out.println();
            }
      }

}