import java.util.Scanner;
public class Jurnal01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		//SWITCH CASE
    int n;
    Scanner input = new Scanner (System.in);
    
        System.out.print("");
        n = input.nextInt();
        
        switch(n){
            case 1:
                System.out.println("Senin");
            break;
            case 2:
                System.out.println("Selasa");
            break;
            case 3:
                System.out.println("Rabu");
            break;
            case 4:
                System.out.println("Kamis");
            break;
            case 5:
                System.out.println("Jum'at");
            break;
            case 6:
                System.out.println("Sabtu");
            break;
            case 7:
                System.out.println("Ahad");
            break;
            
            default:
                System.out.println("ga tau");
        }
	}
}
