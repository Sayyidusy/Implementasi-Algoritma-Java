import java.util.Scanner;
public class Jurnal02 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		//scanner
		Scanner input = new Scanner(System.in);
		// input scanner
        String lirik = input.nextLine();
        int sisaBagi = lirik.length()%5;

		//switch
        switch (sisaBagi) {
            case 0:
                System.out.print(a(lirik));
                break;
            case 1:
                System.out.print(e(lirik));
                break;
            case 2:
                System.out.print(i(lirik));
                break;
            case 3:
                System.out.print(o(lirik));
                break;
            case 4:
                System.out.print(u(lirik));
                break;
            default:
        }
    }
	//method
    private static String a (String lirik) {
        String lirikBaru = lirik.replaceAll("[aAiIuUeEoO]", "a");
        return lirikBaru;
    }
    private static String i (String lirik) {
        String lirikBaru = lirik.replaceAll("[aAiIuUeEoO]", "i");
        return lirikBaru;
    }
    private static String u (String lirik) {
        String lirikBaru = lirik.replaceAll("[aAiIuUeEoO]", "u");
        return lirikBaru;
    }
    private static String e (String lirik) {
        String lirikBaru = lirik.replaceAll("[aAiIuUeEoO]", "e");
        return lirikBaru;
    }
    private static String o (String lirik) {
        String lirikBaru = lirik.replaceAll("[aAiIuUeEoO]", "o");
        return lirikBaru;
	}
}
