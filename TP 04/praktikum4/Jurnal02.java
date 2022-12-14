import java.util.Scanner;
public class Jurnal02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner user = new Scanner(System.in);         
    int pajak = 0;
    int penghasilan_kotor = 0 ;
    int penghasilan_bersih = 0;
    int biaya_pajak = 0;
    int penghasilan = user.nextInt();
    
    if(penghasilan > 500){
           pajak = 30 ;
           penghasilan_kotor = penghasilan * 1000000;
           biaya_pajak = (penghasilan_kotor  /100)*pajak;
           penghasilan_bersih = (penghasilan_kotor - biaya_pajak);

    }else if(penghasilan >= 251 && penghasilan <= 500) {
           pajak = 25 ;
           penghasilan_kotor = penghasilan * 1000000;
           biaya_pajak = (penghasilan_kotor * pajak)/100;
           penghasilan_bersih = (penghasilan_kotor - biaya_pajak);

    }else if(penghasilan >= 51 && penghasilan <= 250){
           pajak = 5 ;
           penghasilan_kotor = penghasilan * 1000000;
           biaya_pajak = (penghasilan_kotor * pajak)/100;
           penghasilan_bersih = (penghasilan_kotor - biaya_pajak);
           
    }else if(penghasilan >= 0 && penghasilan <= 50){
           pajak = 5 ;
           penghasilan_kotor = penghasilan * 1000000;
           biaya_pajak = (penghasilan_kotor * pajak)/100;
           penghasilan_bersih = (penghasilan_kotor - biaya_pajak);}
    
    System.out.println("Penghasilan kotor = "+penghasilan+" juta Rupiah");
    System.out.println("Pajak " + pajak + "% = Rp. " + biaya_pajak);
    System.out.println("Penghasilan bersih = Rp. " + penghasilan_bersih);
	}
}
