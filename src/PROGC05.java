import java.util.Scanner;

/**
 * Wycinanie literek
 */
public class PROGC05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String text = "";
            text = scan.nextLine();
            for (int i=2; i<text.length(); i++) {
                if (!(text.charAt(i) == text.charAt(0))) {
                    System.out.print(text.charAt(i));
                }
            }
            System.out.println();
        }

    }
}
