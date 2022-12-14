import java.util.Scanner;
public class Jurnal03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		int d, r, i, nilai;
        
       Scanner input = new Scanner(System.in);
       
       System.out.print("");
       d = input.nextInt();
       r = input.nextInt();
       i = input.nextInt();
       
       
       if(d>i && i>r){
           System.out.println("Dira, Idar, Radi");
       }
       else if(i>r && r>d){
           System.out.println("Idar, Radi, Dira");
       }
       else {
        System.out.println("Radi, Dira, Idar");
    }

	}
}
