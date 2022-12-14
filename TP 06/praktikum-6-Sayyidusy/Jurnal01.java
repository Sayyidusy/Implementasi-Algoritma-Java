import java.util.Scanner;
public class Jurnal01 {

	public static void main(final String[] args) {
		//Kerjakan soalnya di sini
		//scanner
        Scanner in = new Scanner(System.in);
        //scanner input user
        String nama1 = sapaan(in.nextLine());
        String nama2 = sapaan(in.nextLine());
        int waktu = in.nextInt();
        //output
        System.out.println(nama1 + salam(waktu));
        System.out.println(nama2 + salam(waktu));
	}
		//method 1
        private static String salam(int pukul){
        String waktu="";
        if(pukul <= 24){
            if(pukul>=6 && pukul<=11){
                waktu = "pagi.";
            }else if(pukul >= 12 && pukul <=14){
                waktu = "siang.";
            }else if(pukul >=15 && pukul <=17){
                waktu = "sore.";
            }else{
                waktu = "malam.";
            }
        }
        return waktu;
        }
        
        //method 2
        private static String sapaan(String nama){
            return "Halo, "+nama+"."+" Selamat ";
        }
}
