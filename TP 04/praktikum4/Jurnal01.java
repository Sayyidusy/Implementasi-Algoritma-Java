import java.util.Scanner;
public class Jurnal01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner input = new Scanner(System.in);
    int bil;
    bil = input.nextInt();
	
    if(bil%4 == 0){
    System.out.println("Kelipatan empat");

    }else{ 
    System.out.println("Bukan kelipatan empat");}
    
	}
}
