public class Jurnal01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		
		for ( int i =1; i <=6; i++){
			
			for(int j = 1; j < 6; j++) {
				if(i % 2 == 0) {
					System.out.print(" *");
				}
				else{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}