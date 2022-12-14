import java.util.Scanner;

import javax.net.ssl.SSLContext;
public class Jurnal02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini

        String[] day = {"senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu"};
        Scanner input = new Scanner(System.in);
        String hari = input.nextLine();
        int number = input.nextInt();
        int hasil;

        switch (hari) {
            case "senin":
                hasil = (number % 7);
                System.out.println(day[hasil]);
                break;
            case "selasa":
                hasil = (number % 7)+1;
                System.out.println(day[hasil]);
                break;
            case "rabu":
                hasil = (number % 7)+2;
                System.out.println(day[hasil]);
                break;
            case "kamis":
                hasil = (number % 7)+3;
                System.out.println(day[hasil]);
                break;
            case "jumat":
                hasil = (number % 7)+4;
                System.out.println(day[hasil]);
                break;
            case "sabtu":
                hasil = (number % 7)+5;
                System.out.println(day[hasil]);
                break;
            case "minggu":
                hasil = (number % 7)+6;
                System.out.println(day[hasil]);
                break;    
        
            default:
                break;
        }
		
		    //SWITCH CASE
    // Scanner input = new Scanner (System.in);
    //     System.out.print("");
    //     String h = input.nextLine();
    //     System.out.print("");
    //     int n = input.nextInt();
    //     int h2 = (n%7);
    //     int hasil;
        
    //     switch(h){
    //         case "Senin":
    //             hasil = 1;
    //             n = n + 1;
    //         break;
    //         case "Selasa":
    //             hasil = 2;
    //             n = n + 2;
    //         break;
    //         case "Rabu":
    //             hasil = 3;
    //             n = n + 3;
    //         break;
    //         case "Kamis":
    //             hasil = 4;
    //             n = n + 4;
    //         break;
    //         case "Jumat":
    //             hasil = 5;
    //             n = n + 5;
    //         break;
    //         case "Sabtu":
    //             hasil = 6;
    //             n = n + 6;
    //         break;
    //         case "Minggu":
    //             hasil = 7;
    //             n = n + 7;       
    //     }
        
    //     switch(n){
    //         case 1: case 8: case 15: case 22: case 29:
    //         System.out.print("Senin");
    //         break;
    //         case 2: case 9: case 16: case 23: case 30:
    //             System.out.println("Selasa");
    //             break;
    //         case 3: case 10: case 17: case 24: 
    //             System.out.println("Rabu");
    //             break;
    //         case 4: case 11: case 18: case 25: 
    //             System.out.println("Kamis");
    //             break;
    //         case 5: case 12: case 19: case 26: 
    //             System.out.println("Jumat");
    //             break;
    //         case 6: case 13: case 20: case 27: 
    //             System.out.println("Sabtu");
    //             break;
    //         case 7: case 14: case 21: case 28: 
    //             System.out.println("Minggu");
    //             break;
                
    //     }
	}
}
