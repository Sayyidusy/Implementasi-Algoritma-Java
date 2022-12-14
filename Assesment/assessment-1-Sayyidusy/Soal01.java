import java.util.Scanner;
public class Soal01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		// scanner
		//
          Scanner input =new Scanner (System.in);
		  
        //input user dan variabel
          int a = input.nextLine().charAt(0)- '0';
          int b = input.nextLine().charAt(1)- '0';
          int c = input.nextLine().charAt(2)- '0';
          
          input.close();
		 
        //output 
            System.out.println(a+b+c);
          
          
        }
}