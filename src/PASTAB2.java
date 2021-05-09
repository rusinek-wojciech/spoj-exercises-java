import java.util.Scanner;

/**
 * Warunek w tablicy
 */
public class PASTAB2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] tab = new long[n];
        for (int i=0; i<n; i++) {
            tab[i] = scan.nextLong();
        }
        String operation = scan.next();
        long border = scan.nextLong();
        if (operation.equals(">")) {
            for (int i=0; i<n; i++) {
                if (tab[i] > border) {
                    System.out.println(tab[i]);
                }
            }
        }
        if (operation.equals("<")) {
            for (int i=0; i<n; i++) {
                if (tab[i] < border) {
                    System.out.println(tab[i]);
                }
            }
        }
    }
}
