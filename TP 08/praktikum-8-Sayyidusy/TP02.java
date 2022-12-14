import java.util.Scanner;
public class TP02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		
		  //variabel
          int angka, balik = 0;
		  
          //scanner input       
          Scanner input = new Scanner(System.in);
          
          //user menginput nilai
          angka = input.nextInt();
          
          //while loop 
          while( angka != 0 )
          {
              balik = balik * 10;
              balik = balik + angka%10;
              angka = angka/10;
          }
		  
          //output
          System.out.println(balik);           
    
	}
}
