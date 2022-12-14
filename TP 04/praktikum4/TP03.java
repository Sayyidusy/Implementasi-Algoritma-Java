import java.util.Scanner;
public class TP03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		 //kumpulan interger
       int d, r, i;
        
       Scanner input = new Scanner(System.in);
       
       System.out.print("");
       d = input.nextInt();
       r = input.nextInt();
       i = input.nextInt();
       
       if(d>i && i>r){
			System.out.println("Dira");
       }
       else if(r>d && r>i){
			System.out.println("Radi");
       }
       else {
			System.out.println("Idar");
    }
	}
}
