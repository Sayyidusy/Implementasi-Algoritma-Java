import java.util.*;

public class Soal04 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        //input jumlah pemain 
        int pemain = input.nextInt();
        //input berisi bilangan yang ditebak oleh para pemain. 
        int bilangan = input.nextInt();
        int[] tebak = new int[pemain];

        //looping for ini  untuk menginput dari jumlah pemain
        for (int i = 0; i < pemain; i++) {
            tebak[i] = input.nextInt();
        }

        for (int i = 0; i < pemain; i++) {
        
            for (int j = pemain - 1; j >= 0; j--) {
                if (tebak[i] + tebak[j] == bilangan && i + 1 < j + 1) {
                    //output hasil amsyong
                    System.out.println((i + 1) + " " + (j + 1));
                }
            }
        }

    }
}

