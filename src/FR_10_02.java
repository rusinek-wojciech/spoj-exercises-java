import java.util.Scanner;

/**
 * Jąkała
 */
public class FR_10_02 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numb1 = in.nextInt();
        int numb2 = numb1;
        String[] tab = new String[numb1];
        while (numb1 != 0) {
            tab[numb1 - 1] = in.next();
            numb1--;
        }
        String text = in.next();
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < numb2; j++) {
                if (tab[j].charAt(0) == text.charAt(i)) {
                    System.out.print(text.charAt(i));
                }
            }
            System.out.print(text.charAt(i));
        }

    }
}
