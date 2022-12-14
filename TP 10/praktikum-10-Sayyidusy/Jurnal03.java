import java.util.Scanner;
public class Jurnal03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		int k = 0;
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for( int i = 1; i <= n ; i++)
		{
			for( int j = 1; j <= i ; j++)
			{
			if(k <= 9){
			System.out.print(k +"");
			k++;    
			} 
			else {
			k = 0;
			System.out.print(k+"");
			k++;   			
			}
			}
			System.out.println();
		}
	}
}
