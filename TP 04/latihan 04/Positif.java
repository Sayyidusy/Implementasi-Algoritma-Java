import java.util.Scanner;
public class Positif{

    public static void main(String[] args){

        Scanner input =new Scanner (System.in);

        int bil;

        System.out.println("masukan bilangan = ");

        bil=input.nextInt();

        if(bil>0){
            System.out.println("bilangan positif");
        }
        if(bil<0){
            System.out.println("bilangan negatif");
        }
    }
}