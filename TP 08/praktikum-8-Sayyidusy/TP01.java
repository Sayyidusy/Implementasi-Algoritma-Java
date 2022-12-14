import java.util.Scanner;
public class TP01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		//scanner
        Scanner input = new Scanner(System.in);
        //variabel
		int amoeba = input.nextInt();
		int membelah = 0;
		boolean lanjut = true;
        // while
		while(lanjut){
                    //if-else
                    
			if(amoeba <= 30){
				lanjut = false;
			} else if(amoeba != 30){
				amoeba /= 2;
				membelah++;
			}
		}
                //output
                System.out.println(membelah*15);
	}
}
