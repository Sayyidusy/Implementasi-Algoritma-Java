import java.util.Scanner;
//tugas3 

        /* Dira memiliki banyak permen. Karena Dira anak baik, ia ingin berbagi permen tersebut
        dengan teman-temannya. Jika jumlah permen yang dimiliki Dira adalah N, dan 
        jumlah teman-teman Dira sebanyak T, bantulah Dira menghitung berapa 
        jumlah permen yang didapat tiap orang (Dira dan teman-temannya).
        Hitung juga jumlah sisa permen, karena mungkin saja permen yang ada tidak habis dibagi sama rata.

        jumlah permen = 24 buah
        jumlah teman  = 5 orang

            berapa permen yang di bagi ke teman dira? dan apakah ada sisa permen?

        
        */

public class tugas3{

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);


        System.out.println("Jumlah Permen = ");
        int permen = userInput.nextInt();

        System.out.println("Jumlah Teman = ");
        int teman = userInput.nextInt();

        int pembagian = permen/(teman + 1);
        //System.out.println("Jumlah permen masing-masing : "+pembagian);

        int sisa = permen%(teman + 1);
        //System.out.println("Sisa permen : "+sisa);

    
        
        System.out.println("jumlah permen ada "+permen+",dibagi ke Dira dan " +teman+ " temannya,"); 
        System.out.println("maka setiap orang mendapatkan " +pembagian+ " buah permen, bersisa " +sisa+ " buah.");
        
        



    }
}