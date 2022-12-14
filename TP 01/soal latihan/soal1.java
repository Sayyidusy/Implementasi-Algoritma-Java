
import java.util.Scanner;

public class soal1{
    
    /*Seorang driver ojol dalam sehari mendapat 7 order dengan jumlah penumpang 
masingmasing 2 orang, 4 orang, 3 orang, 1 orang, 2 orang, 4 orang, dan 3 orang.
Driver tersebut ingin tahu berapa jumlah semua penumpang yang telah dibawanya di hari itu.
Buatlah program sederhana untuk membantu Pak Driver Ojol!*/

    public static void main(String [] args){

        Scanner userInput = new Scanner(System.in);
        int a, b, c, d, e, f, g, nilai ;

        System.out.println("Menghitung Penumpang");
        System.out.print("orderan ke-1 =");
        a = userInput.nextInt();
        System.out.print("orderan ke-2 =");
        b = userInput.nextInt();
        System.out.print("orderan ke-3 =");
        c = userInput.nextInt();
        System.out.print("orderan ke-4 =");
        d = userInput.nextInt();
        System.out.print("orderan ke-5 =");
        e = userInput.nextInt();
        System.out.print("orderan ke-6 =");
        f = userInput.nextInt();
        System.out.print("orderan ke-7 =");
        g = userInput.nextInt();
        
        nilai = a+b+c+d+e+f+g ;
    
        System.out.println("Jumlah orderan ojol hari ini adalah  = " + nilai+ " penumpang");
    }




}
