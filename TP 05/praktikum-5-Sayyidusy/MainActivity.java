import java.util.Scanner;

public class MainActivity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String day = in.nextLine();
        int hariSetelah = in.nextInt();
        int sisa = hariSetelah%7;


        // switch (day) {
        //     case "senin":
        //     switch (sisa) {
        //         case 1: System.out.println("Selasa");
                    
        //             break;
            
        //         default:
        //             break;
        //     }
        //     break;
                
          
        // }
        if(day.equals("Senin")){
            switch (sisa) {
                case 1:System.out.println("Selasa");
                    
                    break;
            
                
            }
        }
        in.close();

    }
    
}
