import java.util.Scanner;
public class Genap{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int bil;
    bil = input.nextInt();
	
    if(bil%2 == 0)
    System.out.println("Bilangan genap");

    else 
    System.out.println("Bilangan ganjil");

    }
    
}