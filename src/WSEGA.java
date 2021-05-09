import java.util.Scanner;

/**
 * Wiek segmentolka
 */
public class WSEGA {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tryNumb = scan.nextInt();
        while(tryNumb != 0) {
            int segm = scan.nextInt();
            int sum = segm - 1;
            int[] tab = new int[segm];
            for (int i=0; i<segm; i++) {
                tab[i] = scan.nextInt();
                sum += tab[i];
            }
            System.out.println(sum);
            tryNumb--;
        }
    }
}
