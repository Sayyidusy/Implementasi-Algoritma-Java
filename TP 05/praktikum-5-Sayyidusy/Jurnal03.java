import java.util.Scanner;
public class Jurnal03 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		
	Scanner input = new Scanner(System.in);
       
        float a,b;
        char o;
        a = input.nextFloat();
        o = input.next().charAt(0);
        b = input.nextFloat();

        switch (o) {
        case '+':
                float penjumlahan = a + b;
                System.out.print(String.format("%.0f%n", penjumlahan));
                break;
        case '-':
                float pengurangan = a - b;
                System.out.print(String.format("%.0f%n", pengurangan));
                break;
        case '*':
                float perkalian = a * b;
                System.out.print(String.format("%.0f%n", perkalian));
                break;
        case '/':
                float pembagian = a / b;
                System.out.print(pembagian);
				break;
                }
	}
}
