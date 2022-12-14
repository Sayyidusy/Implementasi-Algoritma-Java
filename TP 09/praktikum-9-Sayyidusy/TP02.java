import java.util.Scanner;
public class TP02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		//scanner
        Scanner input = new Scanner(System.in);
        //variabel
        int i;
        int faktorial = 1;
        //input nilai yang ingin di faktorial 
        int angka = input.nextInt(); 
        //method for
        for(i=1;i<=angka;i++){    
        faktorial=faktorial*i;    
  }    
  System.out.println(faktorial);    
 }  
}  