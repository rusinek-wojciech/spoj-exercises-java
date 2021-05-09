import java.util.Scanner;

/**
 * Szyfr Gronsfelda
 */
public class WI_SZYFR {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String code = scan.next();
        String numb = scan.next();
        String text = scan.next();

        int sizeNumb = numb.length();
        int sizeText = text.length();

        int j = 0;
        if (code.equals("SZYFRUJ")) {

            for (int i = 0; i < sizeText; i++) {
                int tmp = text.charAt(i) + Character.getNumericValue(numb.charAt(j));
                if (tmp >= 91) {
                    do {
                        tmp = tmp - 26;
                    } while (tmp >= 91);
                }
                System.out.print((char) tmp);
                j++;
                if (j >= sizeNumb) {
                    j = 0;
                }
            }
        }
        if (code.equals("DESZYFRUJ")) {
            for (int i = 0; i < sizeText; i++) {
                int tmp = text.charAt(i) - Character.getNumericValue(numb.charAt(j));
                if (tmp <= 64) {
                    do {
                        tmp = tmp + 26;
                    } while (tmp <= 64);
                }
                System.out.print((char) tmp);
                j++;
                if (j >= sizeNumb) {
                    j = 0;
                }
            }
        }
    }
}
