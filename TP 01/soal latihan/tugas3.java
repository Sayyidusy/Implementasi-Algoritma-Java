import java.util.Scanner;

public class tugas3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //dua bilangan bulat
        System.out.println("Masukkan Bilangan Pertama");
        int bil1 = input.nextInt();
        
        System.out.println("Masukkan Bilangan Kedua");
        int bil2 = input.nextInt();

        System.out.println("Hasil Penjumlahan :"  + (bil1 + bil2));
        System.out.println("Hasil Pengurangan :"+ (bil1-bil2));
        System.out.println("Hasil perkalian :" + bil1*bil2);
        System.out.println("Hasil pembagian :"+ bil1/bil2);
        System.out.println("Sisa :" + bil1%bil2 +"\n");

        //satu bilangan pecahan
        System.out.println("Masukkan Bilangan Pecahan");
        double bil3 = input.nextDouble();

        System.out.println("Hasil Penjumlahan :"  + (bil1+bil3));
        System.out.println("Hasil Pengurangan :"  + (bil1-bil3));
        System.out.println("Hasil Perkalian :"  + (bil1*bil3));
        System.out.println("Hasil Pembagian:"  + (bil1/bil3));
        System.out.println("Sisa : "+(bil1%bil3)+"\n");

        // dua nilai Boolean
        System.out.println("Masukkan Nilai Boolean Pertama");
        boolean boo1 = input.nextBoolean();

        System.out.println("Masukkan Nilai Boolean Kedua");
        boolean boo2 = input.nextBoolean();

        System.out.println("Nilai Kebenaran 'AND' : "+ (boo1&&boo2));
        System.out.println("Nilai Kebenaran 'OR' : "+ (boo1||boo2));
        System.out.println("Nilai Kebenaran 'NOT Boolean 1' : " + (!boo1));
        System.out.println("Nilai Kebenaran 'NOT Boolean 2' : " + (!boo2));
        System.out.println("NIlai Kebenaran 'XOR' : " + (boo1|boo2));
  
    }
}