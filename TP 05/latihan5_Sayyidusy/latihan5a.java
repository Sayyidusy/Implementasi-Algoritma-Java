import java.util.Scanner;

public class latihan5a{

    public static void main(final String[] args) {

        /*Buatlah program untuk menentukan predikat
        dari sebuah nilai huruf yang diinput oleh 
        user:A: Excellent, B: Good, C = Average, D: Fail.
        Jangan cetak apa-apa jika nilai hurufnya bukan A-D.
        */
      
        //var
        String huruf;
       
        // scner
        Scanner input = new Scanner(System.in);

        // input user
        huruf = input.next();

        switch (huruf) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Average");
                break;
            case "D":
                System.out.println("Fail");
                break;
            default:


        }
    }
}