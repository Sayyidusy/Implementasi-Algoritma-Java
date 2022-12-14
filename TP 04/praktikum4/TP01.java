import java.util.Scanner;
public class TP01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input =new Scanner (System.in);

        int bil;

        System.out.print("");

        bil=input.nextInt();

        if(bil%6 == 0){
            System.out.println("Enam");
        }
        else{
            System.out.println("Bukan enam");
        }
	}
}
